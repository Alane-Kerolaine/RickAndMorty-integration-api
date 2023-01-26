package alane.estudos.rickAndMortyintegrationapi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.util.List;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfLocationResponse {

    private List<LocationResponse> results;

}
