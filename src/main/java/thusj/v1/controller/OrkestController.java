package thusj.v1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thusj.v1.business.IOrkestenUseCase;
import thusj.v1.domain.Orkest;
import thusj.v1.domain.reqres.CreateOrkestRequest;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/muziekbieb")
//@RequestMapping("/muziekbieb/orkest")
@AllArgsConstructor
public class OrkestController {

    private final IOrkestenUseCase getOrkestenUseCase;

    @GetMapping("{id}")
    public ResponseEntity<Orkest> getOrkest(@PathVariable(value = "id") final Integer id){
        Orkest o = getOrkestenUseCase.getOrkest(id);
        return ResponseEntity.ok().body(o);
    }

    @GetMapping
    public List<Orkest> getAllOrkesten(){
        return getOrkestenUseCase.getOrkesten();
    }

    @PostMapping
    public ResponseEntity<Integer> createOrkest(@RequestBody @Valid CreateOrkestRequest createOrkestRequest){
        int response = getOrkestenUseCase.createOrkest(createOrkestRequest);
        return  ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
