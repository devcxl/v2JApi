package cn.devcxl.v2ray;


import com.v2ray.core.app.log.command.LoggerServiceGrpc;
import com.v2ray.core.app.proxyman.command.HandlerServiceGrpc;
import com.v2ray.core.app.stats.command.StatsServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author devcxl
 */
public class V2RayApiClient {

    private HandlerServiceGrpc.HandlerServiceBlockingStub handlerServiceBlockingStub;
    private LoggerServiceGrpc.LoggerServiceBlockingStub loggerServiceBlockingStub;
    private StatsServiceGrpc.StatsServiceBlockingStub statsServiceBlockingStub;
    private static final ConcurrentHashMap<String, V2RayApiClient> concurrentHashMap = new ConcurrentHashMap();

    public V2RayApiClient(HandlerServiceGrpc.HandlerServiceBlockingStub handlerServiceBlockingStub, LoggerServiceGrpc.LoggerServiceBlockingStub loggerServiceBlockingStub, StatsServiceGrpc.StatsServiceBlockingStub statsServiceBlockingStub) {
        this.handlerServiceBlockingStub = handlerServiceBlockingStub;
        this.loggerServiceBlockingStub = loggerServiceBlockingStub;
        this.statsServiceBlockingStub = statsServiceBlockingStub;
    }

    public static V2RayApiClient getInstance(String host, int port) {
        String key = host + port;
        if (concurrentHashMap.containsKey(key)) {
            return concurrentHashMap.get(key);
        }
        synchronized (key.intern()) {
            if (!concurrentHashMap.containsKey(key)) {
                ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                        // needing certificates.
                        .usePlaintext()
                        .build();
                V2RayApiClient v2RayApiClient1 = new V2RayApiClient(HandlerServiceGrpc.newBlockingStub(channel),
                        LoggerServiceGrpc.newBlockingStub(channel),
                        StatsServiceGrpc.newBlockingStub(channel));

                concurrentHashMap.put(key, v2RayApiClient1);
            }
            return concurrentHashMap.get(key);
        }

    }

    public HandlerServiceGrpc.HandlerServiceBlockingStub getHandlerServiceBlockingStub() {
        return handlerServiceBlockingStub;
    }

    public LoggerServiceGrpc.LoggerServiceBlockingStub getLoggerServiceBlockingStub() {
        return loggerServiceBlockingStub;
    }

    public StatsServiceGrpc.StatsServiceBlockingStub getStatsServiceBlockingStub() {
        return statsServiceBlockingStub;
    }
}