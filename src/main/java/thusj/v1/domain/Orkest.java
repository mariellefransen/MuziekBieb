package thusj.v1.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//TODO: ook Noargs... nodig???
public class Orkest {

    private Integer id;
    private String naam;
    private String plaats;

}
