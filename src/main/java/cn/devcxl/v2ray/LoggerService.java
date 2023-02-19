package cn.devcxl.v2ray;

import io.grpc.ManagedChannel;

/**
 * @author devcxl
 */
public interface LoggerService {


    /**
     * 重启日志
     */
    public void restart();
}
