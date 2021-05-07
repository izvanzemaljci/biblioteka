package zaposlenik;

import java.time.LocalDate;

import com.etf.grpc.Zaposlenik.AddZaposlenikRequest;
import com.etf.grpc.Zaposlenik.ZaposlenikAPIResponse;
import com.etf.grpc.zaposlenikGrpc.zaposlenikImplBase;

import io.grpc.stub.StreamObserver;

public class ZaposlenikService extends zaposlenikImplBase {

	@Override
	public void addZaposlenik(AddZaposlenikRequest request, StreamObserver<ZaposlenikAPIResponse> responseObserver) {
		System.out.println("AddZaposlenik:");
		
		String name = request.getName();
		LocalDate dateOfBirth = LocalDate.parse(request.getDateOfBirth());
		LocalDate dateOfEmployment = LocalDate.parse(request.getDateOfEmployment());
		
		ZaposlenikAPIResponse.Builder response = ZaposlenikAPIResponse.newBuilder();
		if(name.equals(name)) {
			response.setResponseCode(0).setResponsemessage("SUCCESS");
		} else {
			response.setResponseCode(100).setResponsemessage("INVALID NAME");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
