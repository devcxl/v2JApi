package cn.devcxl.v2ray;

import cn.devcxl.v2ray.bean.Inbound;
import cn.devcxl.v2ray.bean.Outbound;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import com.v2ray.core.InboundHandlerConfig;
import com.v2ray.core.app.proxyman.command.AddInboundRequest;
import com.v2ray.core.app.proxyman.command.AddUserOperation;
import com.v2ray.core.app.proxyman.command.AlterInboundRequest;
import com.v2ray.core.app.proxyman.command.HandlerServiceGrpc;
import com.v2ray.core.app.stats.command.StatsServiceGrpc;
import com.v2ray.core.common.protocol.User;
import com.v2ray.core.common.serial.TypedMessage;
import io.grpc.ManagedChannel;

import java.nio.charset.StandardCharsets;

/**
 * @author devcxl
 */
public class HandlerServiceImpl implements HandlerService {

    private ManagedChannel managedChannel;

    private HandlerServiceGrpc.HandlerServiceBlockingStub stub;


    public HandlerServiceImpl(ManagedChannel managedChannel) {
        this.managedChannel = managedChannel;
        this.stub = HandlerServiceGrpc.newBlockingStub(managedChannel);
    }

    @Override
    public void addInbound(Inbound inbound) {
        // todo: addInbound
    }

    @Override
    public void removeInbound(Inbound inbound) {
        // todo: removeInbound
    }

    @Override
    public void alterInbound(Inbound inbound) {
        // todo: alterInbound
    }

    @Override
    public void addOutbound(Outbound outbound) {
        // todo: addOutbound
    }

    @Override
    public void removeOutbound(Outbound outbound) {
        // todo: removeOutbound
    }

    @Override
    public void alterOutbound(Outbound outbound) {
        // todo: alterOutbound
    }
}
