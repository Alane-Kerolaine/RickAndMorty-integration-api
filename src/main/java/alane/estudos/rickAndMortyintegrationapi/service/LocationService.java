package alane.estudos.rickAndMortyintegrationapi.service;

import alane.estudos.rickAndMortyintegrationapi.integrationService.LocationIntegrationService;
import alane.estudos.rickAndMortyintegrationapi.response.ListOfLocationResponse;
import alane.estudos.rickAndMortyintegrationapi.response.LocationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class LocationService {

    final LocationIntegrationService locationIntegrationService;

    public Flux<ListOfLocationResponse> getAllLocations(){
        return locationIntegrationService.findAllLocations();
    }

    public Mono<LocationResponse> getLocation(int id){
        return locationIntegrationService.findLocation(id);
    }

}
