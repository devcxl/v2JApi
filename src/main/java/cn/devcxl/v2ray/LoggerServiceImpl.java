package cn.devcxl.v2ray;

import com.v2ray.core.app.log.command.LoggerServiceGrpc;
import com.v2ray.core.app.log.command.RestartLoggerRequest;
import com.v2ray.core.app.log.command.RestartLoggerResponse;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

/**
 * @author devcxl
 */
public class LoggerServiceImpl implements LoggerService {


    private ManagedChannel managedChannel;

    private LoggerServiceGrpc.LoggerServiceBlockingStub stub;

    public LoggerServiceImpl(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
        this.stub = LoggerServiceGrpc.newBlockingStub(managedChannel);
    }

    @Override
    public void restart() {
        stub.restartLogger(RestartLoggerRequest.getDefaultInstance());
    }
}
