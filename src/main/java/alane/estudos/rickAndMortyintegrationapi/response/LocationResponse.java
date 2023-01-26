package alane.estudos.rickAndMortyintegrationapi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LocationResponse {

    int id;
    String name;
    String type;
    String dimension;

}
