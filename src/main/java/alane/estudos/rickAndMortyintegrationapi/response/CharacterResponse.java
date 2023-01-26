package alane.estudos.rickAndMortyintegrationapi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CharacterResponse {

    private int id;
    private String name;
    private String status;
    private String species;
    private String image;
    private List<String> episode;

}
