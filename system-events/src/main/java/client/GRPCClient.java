package client;

import com.etf.grpc.korisnikGrpc;
import com.etf.grpc.Korisnik.APIResponse;
import com.etf.grpc.Korisnik.LoginRequest;
import com.etf.grpc.korisnikGrpc.korisnikBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		korisnikBlockingStub korisnikStub = korisnikGrpc.newBlockingStub(channel);
		
		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("kiki").setPassword("kiki").build();
		
		APIResponse response = korisnikStub.login(loginRequest);
		
		System.out.println(response.getResponsemessage());

	}

}
