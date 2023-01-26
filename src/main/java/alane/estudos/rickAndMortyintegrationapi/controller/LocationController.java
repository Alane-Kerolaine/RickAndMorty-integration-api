package alane.estudos.rickAndMortyintegrationapi.controller;


import alane.estudos.rickAndMortyintegrationapi.response.ListOfLocationResponse;
import alane.estudos.rickAndMortyintegrationapi.response.LocationResponse;
import alane.estudos.rickAndMortyintegrationapi.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/locations")
@RequiredArgsConstructor
public class LocationController {

    final LocationService locationService;

    @GetMapping("/location")
    public ResponseEntity<Flux<ListOfLocationResponse>> getAllLocations(){
        return ResponseEntity.ok(locationService.getAllLocations());
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<Mono<LocationResponse>> getLocation(@PathVariable int id){
        return ResponseEntity.ok(locationService.getLocation(id));
    }

}
