package alane.estudos.rickAndMortyintegrationapi.integrationService;

import alane.estudos.rickAndMortyintegrationapi.response.ListOfLocationResponse;
import alane.estudos.rickAndMortyintegrationapi.response.LocationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class LocationIntegrationService {

    final WebClient webClient;

    public Flux<ListOfLocationResponse> findAllLocations() {

        return   webClient.get()
                .uri("/location")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(ListOfLocationResponse.class);
    }

    public Mono<LocationResponse> findLocation(int id) {

        return  webClient.get()
                .uri("/location/" + id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(LocationResponse.class);
    }

}
