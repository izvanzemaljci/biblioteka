package server;
import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import korisnik.KorisnikService;
import zaposlenik.ZaposlenikService;

public class GRPCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(9090).addService(new KorisnikService())
													.addService(new ZaposlenikService())
													.build();
		
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		
		server.awaitTermination();
	}
}
