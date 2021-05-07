package korisnik;

import com.etf.grpc.Korisnik.APIResponse;
import com.etf.grpc.Korisnik.Empty;
import com.etf.grpc.Korisnik.LoginRequest;
import com.etf.grpc.korisnikGrpc.korisnikImplBase;

import io.grpc.stub.StreamObserver;

public class KorisnikService extends korisnikImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Login:");
		
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password)) {
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		} else {
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}

}
