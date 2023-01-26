package alane.estudos.rickAndMortyintegrationapi.integrationService;

import alane.estudos.rickAndMortyintegrationapi.response.CharacterResponse;
import alane.estudos.rickAndMortyintegrationapi.response.ListOfCharacterResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class CharacterIntegrationService {

    final WebClient webClient;

    public Flux<ListOfCharacterResponse> findAllCharacters() {

        return   webClient.get()
                .uri("/character")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(ListOfCharacterResponse.class);
    }

    public Mono<CharacterResponse> findCharacter(int id) {

        log.info("Buscando o personagem com o id [{}]", id);
        return  webClient.get()
                .uri("/character/" + id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CharacterResponse.class);
    }

}
