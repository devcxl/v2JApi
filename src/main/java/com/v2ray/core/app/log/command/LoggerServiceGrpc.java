package com.v2ray.core.app.log.command;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: app/log/command/config.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LoggerServiceGrpc {

  private LoggerServiceGrpc() {}

  public static final String SERVICE_NAME = "v2ray.core.app.log.command.LoggerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.v2ray.core.app.log.command.RestartLoggerRequest,
      com.v2ray.core.app.log.command.RestartLoggerResponse> getRestartLoggerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestartLogger",
      requestType = com.v2ray.core.app.log.command.RestartLoggerRequest.class,
      responseType = com.v2ray.core.app.log.command.RestartLoggerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.v2ray.core.app.log.command.RestartLoggerRequest,
      com.v2ray.core.app.log.command.RestartLoggerResponse> getRestartLoggerMethod() {
    io.grpc.MethodDescriptor<com.v2ray.core.app.log.command.RestartLoggerRequest, com.v2ray.core.app.log.command.RestartLoggerResponse> getRestartLoggerMethod;
    if ((getRestartLoggerMethod = LoggerServiceGrpc.getRestartLoggerMethod) == null) {
      synchronized (LoggerServiceGrpc.class) {
        if ((getRestartLoggerMethod = LoggerServiceGrpc.getRestartLoggerMethod) == null) {
          LoggerServiceGrpc.getRestartLoggerMethod = getRestartLoggerMethod =
              io.grpc.MethodDescriptor.<com.v2ray.core.app.log.command.RestartLoggerRequest, com.v2ray.core.app.log.command.RestartLoggerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestartLogger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.log.command.RestartLoggerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.v2ray.core.app.log.command.RestartLoggerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LoggerServiceMethodDescriptorSupplier("RestartLogger"))
              .build();
        }
      }
    }
    return getRestartLoggerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoggerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceStub>() {
        @java.lang.Override
        public LoggerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceStub(channel, callOptions);
        }
      };
    return LoggerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoggerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceBlockingStub>() {
        @java.lang.Override
        public LoggerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceBlockingStub(channel, callOptions);
        }
      };
    return LoggerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoggerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LoggerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LoggerServiceFutureStub>() {
        @java.lang.Override
        public LoggerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LoggerServiceFutureStub(channel, callOptions);
        }
      };
    return LoggerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LoggerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void restartLogger(com.v2ray.core.app.log.command.RestartLoggerRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.log.command.RestartLoggerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestartLoggerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRestartLoggerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.v2ray.core.app.log.command.RestartLoggerRequest,
                com.v2ray.core.app.log.command.RestartLoggerResponse>(
                  this, METHODID_RESTART_LOGGER)))
          .build();
    }
  }

  /**
   */
  public static final class LoggerServiceStub extends io.grpc.stub.AbstractAsyncStub<LoggerServiceStub> {
    private LoggerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceStub(channel, callOptions);
    }

    /**
     */
    public void restartLogger(com.v2ray.core.app.log.command.RestartLoggerRequest request,
        io.grpc.stub.StreamObserver<com.v2ray.core.app.log.command.RestartLoggerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestartLoggerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoggerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LoggerServiceBlockingStub> {
    private LoggerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.v2ray.core.app.log.command.RestartLoggerResponse restartLogger(com.v2ray.core.app.log.command.RestartLoggerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestartLoggerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoggerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LoggerServiceFutureStub> {
    private LoggerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoggerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LoggerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.v2ray.core.app.log.command.RestartLoggerResponse> restartLogger(
        com.v2ray.core.app.log.command.RestartLoggerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestartLoggerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESTART_LOGGER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoggerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoggerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESTART_LOGGER:
          serviceImpl.restartLogger((com.v2ray.core.app.log.command.RestartLoggerRequest) request,
              (io.grpc.stub.StreamObserver<com.v2ray.core.app.log.command.RestartLoggerResponse>) responseObserver);
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

  private static abstract class LoggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoggerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.v2ray.core.app.log.command.ConfigOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoggerService");
    }
  }

  private static final class LoggerServiceFileDescriptorSupplier
      extends LoggerServiceBaseDescriptorSupplier {
    LoggerServiceFileDescriptorSupplier() {}
  }

  private static final class LoggerServiceMethodDescriptorSupplier
      extends LoggerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoggerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoggerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoggerServiceFileDescriptorSupplier())
              .addMethod(getRestartLoggerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
