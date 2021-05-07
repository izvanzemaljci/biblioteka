package client;

import com.etf.grpc.korisnikGrpc;
import com.etf.grpc.zaposlenikGrpc;
import com.etf.grpc.zaposlenikGrpc.zaposlenikBlockingStub;
import com.etf.grpc.Korisnik.KorisnikAPIResponse;
import com.etf.grpc.Korisnik.LoginRequest;
import com.etf.grpc.Zaposlenik.AddZaposlenikRequest;
import com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse;
import com.etf.grpc.korisnikGrpc.korisnikBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		korisnikBlockingStub korisnikStub = korisnikGrpc.newBlockingStub(channel);
		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("kiki").setPassword("kiki").build();
		KorisnikAPIResponse response = korisnikStub.login(loginRequest);
		System.out.println("Login: ");
		System.out.println(response.getResponsemessage());
		
		
		zaposlenikBlockingStub zaposlenikStub = zaposlenikGrpc.newBlockingStub(channel);
		AddZaposlenikRequest addZaposlenikRequest = AddZaposlenikRequest.newBuilder().setName("ana").build();
		ZaposlenikAPIResponse responseZ = zaposlenikStub.addZaposlenik(addZaposlenikRequest);
		System.out.println("Add zaposlenik: ");
		System.out.println(responseZ.getResponsemessage());

        channel.shutdown(); 

	}

}
