package com.v2ray.core.app.stats.command;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: app/stats/command/command.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StatsServiceGrpc {

  private StatsServiceGrpc() {}

  public static final String SERVICE_NAME = "v2ray.core.app.stats.command.StatsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.GetStatsRequest,
      com.v2ray.core.app.stats.command.GetStatsResponse> getGetStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStats",
      requestType = com.v2ray.core.app.stats.command.GetStatsRequest.class,
      responseType = com.v2ray.core.app.stats.command.GetStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.GetStatsRequest,
      com.v2ray.core.app.stats.command.GetStatsResponse> getGetStatsMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.GetStatsRequest, com.v2ray.core.app.stats.command.GetStatsResponse> getGetStatsMethod;
    if ((getGetStatsMethod = StatsServiceGrpc.getGetStatsMethod) == null) {
      synchronized (StatsServiceGrpc.class) {
        if ((getGetStatsMethod = StatsServiceGrpc.getGetStatsMethod) == null) {
          StatsServiceGrpc.getGetStatsMethod = getGetStatsMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.stats.command.GetStatsRequest, com.v2ray.core.app.stats.command.GetStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.GetStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.GetStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatsServiceMethodDescriptorSupplier("GetStats"))
              .build();
        }
      }
    }
    return getGetStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.QueryStatsRequest,
      com.v2ray.core.app.stats.command.QueryStatsResponse> getQueryStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryStats",
      requestType = com.v2ray.core.app.stats.command.QueryStatsRequest.class,
      responseType = com.v2ray.core.app.stats.command.QueryStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.QueryStatsRequest,
      com.v2ray.core.app.stats.command.QueryStatsResponse> getQueryStatsMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.QueryStatsRequest, com.v2ray.core.app.stats.command.QueryStatsResponse> getQueryStatsMethod;
    if ((getQueryStatsMethod = StatsServiceGrpc.getQueryStatsMethod) == null) {
      synchronized (StatsServiceGrpc.class) {
        if ((getQueryStatsMethod = StatsServiceGrpc.getQueryStatsMethod) == null) {
          StatsServiceGrpc.getQueryStatsMethod = getQueryStatsMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.stats.command.QueryStatsRequest, com.v2ray.core.app.stats.command.QueryStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.QueryStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.QueryStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatsServiceMethodDescriptorSupplier("QueryStats"))
              .build();
        }
      }
    }
    return getQueryStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.SysStatsRequest,
      com.v2ray.core.app.stats.command.SysStatsResponse> getGetSysStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSysStats",
      requestType = com.v2ray.core.app.stats.command.SysStatsRequest.class,
      responseType = com.v2ray.core.app.stats.command.SysStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.SysStatsRequest,
      com.v2ray.core.app.stats.command.SysStatsResponse> getGetSysStatsMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.stats.command.SysStatsRequest, com.v2ray.core.app.stats.command.SysStatsResponse> getGetSysStatsMethod;
    if ((getGetSysStatsMethod = StatsServiceGrpc.getGetSysStatsMethod) == null) {
      synchronized (StatsServiceGrpc.class) {
        if ((getGetSysStatsMethod = StatsServiceGrpc.getGetSysStatsMethod) == null) {
          StatsServiceGrpc.getGetSysStatsMethod = getGetSysStatsMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.stats.command.SysStatsRequest, com.v2ray.core.app.stats.command.SysStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSysStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.SysStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.stats.command.SysStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatsServiceMethodDescriptorSupplier("GetSysStats"))
              .build();
        }
      }
    }
    return getGetSysStatsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsServiceStub>() {
        @java.lang.Override
        public StatsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsServiceStub(channel, callOptions);
        }
      };
    return StatsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsServiceBlockingStub>() {
        @java.lang.Override
        public StatsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsServiceBlockingStub(channel, callOptions);
        }
      };
    return StatsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatsServiceFutureStub>() {
        @java.lang.Override
        public StatsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatsServiceFutureStub(channel, callOptions);
        }
      };
    return StatsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StatsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStats(com.v2ray.core.app.stats.command.GetStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.GetStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStatsMethod(), responseObserver);
    }

    /**
     */
    public void queryStats(com.v2ray.core.app.stats.command.QueryStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.QueryStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryStatsMethod(), responseObserver);
    }

    /**
     */
    public void getSysStats(com.v2ray.core.app.stats.command.SysStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.SysStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSysStatsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.v2ray.core.app.stats.command.GetStatsRequest,
                com.v2ray.core.app.stats.command.GetStatsResponse>(
                  this, METHODID_GET_STATS)))
          .addMethod(
            getQueryStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.v2ray.core.app.stats.command.QueryStatsRequest,
                com.v2ray.core.app.stats.command.QueryStatsResponse>(
                  this, METHODID_QUERY_STATS)))
          .addMethod(
            getGetSysStatsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.v2ray.core.app.stats.command.SysStatsRequest,
                com.v2ray.core.app.stats.command.SysStatsResponse>(
                  this, METHODID_GET_SYS_STATS)))
          .build();
    }
  }

  /**
   */
  public static final class StatsServiceStub extends io.grpc.stub.AbstractAsyncStub<StatsServiceStub> {
    private StatsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStats(com.v2ray.core.app.stats.command.GetStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.GetStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryStats(com.v2ray.core.app.stats.command.QueryStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.QueryStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSysStats(com.v2ray.core.app.stats.command.SysStatsRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.SysStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSysStatsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StatsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StatsServiceBlockingStub> {
    private StatsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.v2ray.core.app.stats.command.GetStatsResponse getStats(com.v2ray.core.app.stats.command.GetStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.v2ray.core.app.stats.command.QueryStatsResponse queryStats(com.v2ray.core.app.stats.command.QueryStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.v2ray.core.app.stats.command.SysStatsResponse getSysStats(com.v2ray.core.app.stats.command.SysStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSysStatsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StatsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StatsServiceFutureStub> {
    private StatsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.v2ray.core.app.stats.command.GetStatsResponse> getStats(
        com.v2ray.core.app.stats.command.GetStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.v2ray.core.app.stats.command.QueryStatsResponse> queryStats(
        com.v2ray.core.app.stats.command.QueryStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryStatsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.v2ray.core.app.stats.command.SysStatsResponse> getSysStats(
        com.v2ray.core.app.stats.command.SysStatsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSysStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATS = 0;
  private static final int METHODID_QUERY_STATS = 1;
  private static final int METHODID_GET_SYS_STATS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StatsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StatsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATS:
          serviceImpl.getStats((com.v2ray.core.app.stats.command.GetStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.GetStatsResponse>) responseObserver);
          break;
        case METHODID_QUERY_STATS:
          serviceImpl.queryStats((com.v2ray.core.app.stats.command.QueryStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.QueryStatsResponse>) responseObserver);
          break;
        case METHODID_GET_SYS_STATS:
          serviceImpl.getSysStats((com.v2ray.core.app.stats.command.SysStatsRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.stats.command.SysStatsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StatsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.v2ray.core.app.stats.command.Command.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StatsService");
    }
  }

  private static final class StatsServiceFileDescriptorSupplier
      extends StatsServiceBaseDescriptorSupplier {
    StatsServiceFileDescriptorSupplier() {}
  }

  private static final class StatsServiceMethodDescriptorSupplier
      extends StatsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StatsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StatsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatsServiceFileDescriptorSupplier())
              .addMethod(getGetStatsMethod())
              .addMethod(getQueryStatsMethod())
              .addMethod(getGetSysStatsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
