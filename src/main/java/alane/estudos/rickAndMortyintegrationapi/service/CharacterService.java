package alane.estudos.rickAndMortyintegrationapi.service;

import alane.estudos.rickAndMortyintegrationapi.integrationService.CharacterIntegrationService;
import alane.estudos.rickAndMortyintegrationapi.response.CharacterResponse;
import alane.estudos.rickAndMortyintegrationapi.response.ListOfCharacterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CharacterService {

    final CharacterIntegrationService characterIntegrationService;

    public Flux<ListOfCharacterResponse> getAllCharacters(){
        return characterIntegrationService.findAllCharacters();
    }

    public Mono<CharacterResponse> getCharacter(int id){
        return characterIntegrationService.findCharacter(id);
    }

}
