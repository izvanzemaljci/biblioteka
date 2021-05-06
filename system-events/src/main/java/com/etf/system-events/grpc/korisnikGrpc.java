package com.etf.system-events.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: korisnik.proto")
public final class korisnikGrpc {

  private korisnikGrpc() {}

  public static final String SERVICE_NAME = "korisnik";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.LoginRequest,
      com.etf.system-events.grpc.Korisnik.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.etf.system-events.grpc.Korisnik.LoginRequest.class,
      responseType = com.etf.system-events.grpc.Korisnik.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.LoginRequest,
      com.etf.system-events.grpc.Korisnik.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.LoginRequest, com.etf.system-events.grpc.Korisnik.APIResponse> getLoginMethod;
    if ((getLoginMethod = korisnikGrpc.getLoginMethod) == null) {
      synchronized (korisnikGrpc.class) {
        if ((getLoginMethod = korisnikGrpc.getLoginMethod) == null) {
          korisnikGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.etf.system-events.grpc.Korisnik.LoginRequest, com.etf.system-events.grpc.Korisnik.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "korisnik", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.system-events.grpc.Korisnik.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.system-events.grpc.Korisnik.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new korisnikMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.Empty,
      com.etf.system-events.grpc.Korisnik.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.etf.system-events.grpc.Korisnik.Empty.class,
      responseType = com.etf.system-events.grpc.Korisnik.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.Empty,
      com.etf.system-events.grpc.Korisnik.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.etf.system-events.grpc.Korisnik.Empty, com.etf.system-events.grpc.Korisnik.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = korisnikGrpc.getLogoutMethod) == null) {
      synchronized (korisnikGrpc.class) {
        if ((getLogoutMethod = korisnikGrpc.getLogoutMethod) == null) {
          korisnikGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.etf.system-events.grpc.Korisnik.Empty, com.etf.system-events.grpc.Korisnik.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "korisnik", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.system-events.grpc.Korisnik.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.system-events.grpc.Korisnik.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new korisnikMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static korisnikStub newStub(io.grpc.Channel channel) {
    return new korisnikStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static korisnikBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new korisnikBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static korisnikFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new korisnikFutureStub(channel);
  }

  /**
   */
  public static abstract class korisnikImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.etf.system-events.grpc.Korisnik.LoginRequest request,
        io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.etf.system-events.grpc.Korisnik.Empty request,
        io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.etf.system-events.grpc.Korisnik.LoginRequest,
                com.etf.system-events.grpc.Korisnik.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.etf.system-events.grpc.Korisnik.Empty,
                com.etf.system-events.grpc.Korisnik.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class korisnikStub extends io.grpc.stub.AbstractStub<korisnikStub> {
    private korisnikStub(io.grpc.Channel channel) {
      super(channel);
    }

    private korisnikStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected korisnikStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new korisnikStub(channel, callOptions);
    }

    /**
     */
    public void login(com.etf.system-events.grpc.Korisnik.LoginRequest request,
        io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.etf.system-events.grpc.Korisnik.Empty request,
        io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class korisnikBlockingStub extends io.grpc.stub.AbstractStub<korisnikBlockingStub> {
    private korisnikBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private korisnikBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected korisnikBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new korisnikBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.etf.system-events.grpc.Korisnik.APIResponse login(com.etf.system-events.grpc.Korisnik.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.etf.system-events.grpc.Korisnik.APIResponse logout(com.etf.system-events.grpc.Korisnik.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class korisnikFutureStub extends io.grpc.stub.AbstractStub<korisnikFutureStub> {
    private korisnikFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private korisnikFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected korisnikFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new korisnikFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.etf.system-events.grpc.Korisnik.APIResponse> login(
        com.etf.system-events.grpc.Korisnik.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.etf.system-events.grpc.Korisnik.APIResponse> logout(
        com.etf.system-events.grpc.Korisnik.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final korisnikImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(korisnikImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.etf.system-events.grpc.Korisnik.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.etf.system-events.grpc.Korisnik.Empty) request,
              (io.grpc.stub.StreamObserver<com.etf.system-events.grpc.Korisnik.APIResponse>) responseObserver);
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

  private static abstract class korisnikBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    korisnikBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.etf.system-events.grpc.Korisnik.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("korisnik");
    }
  }

  private static final class korisnikFileDescriptorSupplier
      extends korisnikBaseDescriptorSupplier {
    korisnikFileDescriptorSupplier() {}
  }

  private static final class korisnikMethodDescriptorSupplier
      extends korisnikBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    korisnikMethodDescriptorSupplier(String methodName) {
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
      synchronized (korisnikGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new korisnikFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
