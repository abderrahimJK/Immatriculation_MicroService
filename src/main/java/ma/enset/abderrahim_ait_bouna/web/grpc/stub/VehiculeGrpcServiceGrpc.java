package ma.enset.abderrahim_ait_bouna.web.grpc.stub;

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
    comments = "Source: immatriculation.proto")
public final class VehiculeGrpcServiceGrpc {

  private VehiculeGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "VehiculeGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicule",
      requestType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest.class,
      responseType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> getGetVehiculeMethod;
    if ((getGetVehiculeMethod = VehiculeGrpcServiceGrpc.getGetVehiculeMethod) == null) {
      synchronized (VehiculeGrpcServiceGrpc.class) {
        if ((getGetVehiculeMethod = VehiculeGrpcServiceGrpc.getGetVehiculeMethod) == null) {
          VehiculeGrpcServiceGrpc.getGetVehiculeMethod = getGetVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeGrpcService", "getVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeGrpcServiceMethodDescriptorSupplier("getVehicule"))
                  .build();
          }
        }
     }
     return getGetVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> getGetAllVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllVehicules",
      requestType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest.class,
      responseType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> getGetAllVehiculesMethod() {
    io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> getGetAllVehiculesMethod;
    if ((getGetAllVehiculesMethod = VehiculeGrpcServiceGrpc.getGetAllVehiculesMethod) == null) {
      synchronized (VehiculeGrpcServiceGrpc.class) {
        if ((getGetAllVehiculesMethod = VehiculeGrpcServiceGrpc.getGetAllVehiculesMethod) == null) {
          VehiculeGrpcServiceGrpc.getGetAllVehiculesMethod = getGetAllVehiculesMethod = 
              io.grpc.MethodDescriptor.<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeGrpcService", "getAllVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeGrpcServiceMethodDescriptorSupplier("getAllVehicules"))
                  .build();
          }
        }
     }
     return getGetAllVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveVehicule",
      requestType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest.class,
      responseType = ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
      ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod() {
    io.grpc.MethodDescriptor<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> getSaveVehiculeMethod;
    if ((getSaveVehiculeMethod = VehiculeGrpcServiceGrpc.getSaveVehiculeMethod) == null) {
      synchronized (VehiculeGrpcServiceGrpc.class) {
        if ((getSaveVehiculeMethod = VehiculeGrpcServiceGrpc.getSaveVehiculeMethod) == null) {
          VehiculeGrpcServiceGrpc.getSaveVehiculeMethod = getSaveVehiculeMethod = 
              io.grpc.MethodDescriptor.<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest, ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "VehiculeGrpcService", "saveVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VehiculeGrpcServiceMethodDescriptorSupplier("saveVehicule"))
                  .build();
          }
        }
     }
     return getSaveVehiculeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VehiculeGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new VehiculeGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VehiculeGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VehiculeGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VehiculeGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VehiculeGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class VehiculeGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getAllVehicules(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveVehiculeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest,
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse>(
                  this, METHODID_GET_VEHICULE)))
          .addMethod(
            getGetAllVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest,
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse>(
                  this, METHODID_GET_ALL_VEHICULES)))
          .addMethod(
            getSaveVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest,
                ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse>(
                  this, METHODID_SAVE_VEHICULE)))
          .build();
    }
  }

  /**
   */
  public static final class VehiculeGrpcServiceStub extends io.grpc.stub.AbstractStub<VehiculeGrpcServiceStub> {
    private VehiculeGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllVehicules(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest request,
        io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VehiculeGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<VehiculeGrpcServiceBlockingStub> {
    private VehiculeGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse getVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse getAllVehicules(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse saveVehicule(ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveVehiculeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VehiculeGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<VehiculeGrpcServiceFutureStub> {
    private VehiculeGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VehiculeGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VehiculeGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VehiculeGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse> getVehicule(
        ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse> getAllVehicules(
        ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllVehiculesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse> saveVehicule(
        ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICULE = 0;
  private static final int METHODID_GET_ALL_VEHICULES = 1;
  private static final int METHODID_SAVE_VEHICULE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VehiculeGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VehiculeGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICULE:
          serviceImpl.getVehicule((ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetVehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_VEHICULES:
          serviceImpl.getAllVehicules((ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.GetAllVehiculeResponse>) responseObserver);
          break;
        case METHODID_SAVE_VEHICULE:
          serviceImpl.saveVehicule((ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.SaveVehiculeResponse>) responseObserver);
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

  private static abstract class VehiculeGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VehiculeGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.abderrahim_ait_bouna.web.grpc.stub.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VehiculeGrpcService");
    }
  }

  private static final class VehiculeGrpcServiceFileDescriptorSupplier
      extends VehiculeGrpcServiceBaseDescriptorSupplier {
    VehiculeGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class VehiculeGrpcServiceMethodDescriptorSupplier
      extends VehiculeGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VehiculeGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VehiculeGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VehiculeGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetVehiculeMethod())
              .addMethod(getGetAllVehiculesMethod())
              .addMethod(getSaveVehiculeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
