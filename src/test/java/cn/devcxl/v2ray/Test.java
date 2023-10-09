package cn.devcxl.v2ray;


import com.google.protobuf.InvalidProtocolBufferException;
import com.v2ray.core.app.proxyman.command.AddUserOperation;
import com.v2ray.core.app.proxyman.command.AlterInboundRequest;
import com.v2ray.core.app.stats.command.*;
import com.v2ray.core.common.protocol.SecurityConfig;
import com.v2ray.core.common.protocol.SecurityType;
import com.v2ray.core.common.protocol.User;
import com.v2ray.core.common.serial.TypedMessage;
import com.v2ray.core.proxy.vmess.Account;

import java.util.UUID;

public class Test {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        V2RayApiClient instance = V2RayApiClient.getInstance("127.0.0.1", 15490);


        // Global Traffic statistics
        StatsServiceGrpc.StatsServiceBlockingStub statsServiceBlockingStub = instance.getStatsServiceBlockingStub();
        GetStatsResponse downstats = statsServiceBlockingStub.getStats(GetStatsRequest.newBuilder().setName("outbound>>>PROXY>>>traffic>>>downlink").clearReset().build());
        GetStatsResponse upstats = statsServiceBlockingStub.getStats(GetStatsRequest.newBuilder().setName("outbound>>>PROXY>>>traffic>>>uplink").clearReset().build());
        System.out.println(downstats.getStat().getValue() / 1024 / 1024);
        System.out.println(upstats.getStat().getValue() / 1024 / 1024);


        //System Stats
        SysStatsResponse sysStats = statsServiceBlockingStub.getSysStats(SysStatsRequest.newBuilder().buildPartial());
        System.out.println(sysStats);



        // Add Account
        Account account = Account.newBuilder().setAlterId(0).setId(UUID.randomUUID().toString()).setSecuritySettings(SecurityConfig.newBuilder().setType(SecurityType.AUTO).build()).build();

        TypedMessage AccountTypedMsg = TypedMessage.newBuilder().setType(Account.getDescriptor().getFullName()).setValue(account.toByteString()).build();

        User user = User.newBuilder().setEmail("test@qq.com").setLevel(0).setAccount(AccountTypedMsg).build();
        AddUserOperation addUserOperation = AddUserOperation.newBuilder().setUser(user).build();

        TypedMessage typedMessage = TypedMessage.newBuilder().setType(AddUserOperation.getDescriptor().getFullName()).setValue(addUserOperation.toByteString()).build();

        instance.getHandlerServiceBlockingStub().alterInbound(AlterInboundRequest.newBuilder().setTag("test").setOperation(typedMessage).build());

    }

}
