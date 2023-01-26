package alane.estudos.rickAndMortyintegrationapi.controller;

import alane.estudos.rickAndMortyintegrationapi.response.CharacterResponse;
import alane.estudos.rickAndMortyintegrationapi.response.ListOfCharacterResponse;
import alane.estudos.rickAndMortyintegrationapi.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {

    final CharacterService characterService;


    @GetMapping("/character")
    public ResponseEntity<Flux<ListOfCharacterResponse>> getAllCharacters(){
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @GetMapping("/character/{id}")
    public ResponseEntity<Mono<CharacterResponse>> getCharacter(@PathVariable int id){
        return ResponseEntity.ok(characterService.getCharacter(id));
    }

}
