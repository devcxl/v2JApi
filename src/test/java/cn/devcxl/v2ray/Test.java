package cn.devcxl.v2ray;


import com.v2ray.core.app.log.command.LoggerServiceGrpc;
import com.v2ray.core.app.log.command.RestartLoggerRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Test {

    public static void main(String[] args) {
        ManagedChannel build = ManagedChannelBuilder.forAddress("127.0.0.1", 15490).usePlaintext().build();
        LoggerServiceGrpc.LoggerServiceBlockingStub loggerServiceBlockingStub = LoggerServiceGrpc.newBlockingStub(build);
        loggerServiceBlockingStub.restartLogger(RestartLoggerRequest.getDefaultInstance());
    }

}
