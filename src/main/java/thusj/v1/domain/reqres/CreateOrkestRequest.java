package thusj.v1.domain.reqres;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrkestRequest {

//    @NotNull
//    @Min(1)
//    @Max(10000)
//    private int id;

    @NotBlank
    private String naam;

    @NotBlank
    private String plaats;
}
