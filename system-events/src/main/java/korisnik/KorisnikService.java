package korisnik;

import com.etf.grpc.Korisnik.Empty;
import com.etf.grpc.Korisnik.KorisnikAPIResponse;
import com.etf.grpc.Korisnik.LoginRequest;
import com.etf.grpc.korisnikGrpc.korisnikImplBase;

import io.grpc.stub.StreamObserver;

public class KorisnikService extends korisnikImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<KorisnikAPIResponse> responseObserver) {
		System.out.println("Login:");
		
		String username = request.getUsername();
		String password = request.getPassword();
		
		KorisnikAPIResponse.Builder response = KorisnikAPIResponse.newBuilder();
		if(username.equals(password)) {
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		} else {
			response.setResponseCode(100).setResponsemessage("INVALID PASSWORD");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<KorisnikAPIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}

}
