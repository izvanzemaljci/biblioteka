package com.etf.grpc;

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
    comments = "Source: zaposlenik.proto")
public final class zaposlenikGrpc {

  private zaposlenikGrpc() {}

  public static final String SERVICE_NAME = "zaposlenik";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.etf.grpc.Zaposlenik.AddZaposlenikRequest,
      com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> getAddZaposlenikMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addZaposlenik",
      requestType = com.etf.grpc.Zaposlenik.AddZaposlenikRequest.class,
      responseType = com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.etf.grpc.Zaposlenik.AddZaposlenikRequest,
      com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> getAddZaposlenikMethod() {
    io.grpc.MethodDescriptor<com.etf.grpc.Zaposlenik.AddZaposlenikRequest, com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> getAddZaposlenikMethod;
    if ((getAddZaposlenikMethod = zaposlenikGrpc.getAddZaposlenikMethod) == null) {
      synchronized (zaposlenikGrpc.class) {
        if ((getAddZaposlenikMethod = zaposlenikGrpc.getAddZaposlenikMethod) == null) {
          zaposlenikGrpc.getAddZaposlenikMethod = getAddZaposlenikMethod = 
              io.grpc.MethodDescriptor.<com.etf.grpc.Zaposlenik.AddZaposlenikRequest, com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "zaposlenik", "addZaposlenik"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.grpc.Zaposlenik.AddZaposlenikRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new zaposlenikMethodDescriptorSupplier("addZaposlenik"))
                  .build();
          }
        }
     }
     return getAddZaposlenikMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static zaposlenikStub newStub(io.grpc.Channel channel) {
    return new zaposlenikStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static zaposlenikBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new zaposlenikBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static zaposlenikFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new zaposlenikFutureStub(channel);
  }

  /**
   */
  public static abstract class zaposlenikImplBase implements io.grpc.BindableService {

    /**
     */
    public void addZaposlenik(com.etf.grpc.Zaposlenik.AddZaposlenikRequest request,
        io.grpc.stub.StreamObserver<com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddZaposlenikMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddZaposlenikMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.etf.grpc.Zaposlenik.AddZaposlenikRequest,
                com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse>(
                  this, METHODID_ADD_ZAPOSLENIK)))
          .build();
    }
  }

  /**
   */
  public static final class zaposlenikStub extends io.grpc.stub.AbstractStub<zaposlenikStub> {
    private zaposlenikStub(io.grpc.Channel channel) {
      super(channel);
    }

    private zaposlenikStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected zaposlenikStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new zaposlenikStub(channel, callOptions);
    }

    /**
     */
    public void addZaposlenik(com.etf.grpc.Zaposlenik.AddZaposlenikRequest request,
        io.grpc.stub.StreamObserver<com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddZaposlenikMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class zaposlenikBlockingStub extends io.grpc.stub.AbstractStub<zaposlenikBlockingStub> {
    private zaposlenikBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private zaposlenikBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected zaposlenikBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new zaposlenikBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse addZaposlenik(com.etf.grpc.Zaposlenik.AddZaposlenikRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddZaposlenikMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class zaposlenikFutureStub extends io.grpc.stub.AbstractStub<zaposlenikFutureStub> {
    private zaposlenikFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private zaposlenikFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected zaposlenikFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new zaposlenikFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse> addZaposlenik(
        com.etf.grpc.Zaposlenik.AddZaposlenikRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddZaposlenikMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ZAPOSLENIK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final zaposlenikImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(zaposlenikImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ZAPOSLENIK:
          serviceImpl.addZaposlenik((com.etf.grpc.Zaposlenik.AddZaposlenikRequest) request,
              (io.grpc.stub.StreamObserver<com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse>) responseObserver);
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

  private static abstract class zaposlenikBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    zaposlenikBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.etf.grpc.Zaposlenik.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("zaposlenik");
    }
  }

  private static final class zaposlenikFileDescriptorSupplier
      extends zaposlenikBaseDescriptorSupplier {
    zaposlenikFileDescriptorSupplier() {}
  }

  private static final class zaposlenikMethodDescriptorSupplier
      extends zaposlenikBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    zaposlenikMethodDescriptorSupplier(String methodName) {
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
      synchronized (zaposlenikGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new zaposlenikFileDescriptorSupplier())
              .addMethod(getAddZaposlenikMethod())
              .build();
        }
      }
    }
    return result;
  }
}
