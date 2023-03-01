package thusj.v1.business.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import thusj.v1.business.IOrkestenUseCase;
import thusj.v1.domain.Orkest;
import thusj.v1.domain.reqres.CreateOrkestRequest;
import thusj.v1.persistence.IOrkestRepo;
import thusj.v1.persistence.entity.OrkestEntity;

import java.util.List;

import static thusj.v1.business.impl.OrkestConverter.convert;

@Service
@AllArgsConstructor
public class OrkestenUseCaseImpl implements IOrkestenUseCase {

    private IOrkestRepo repo;
    @Override
    public List<Orkest> getOrkesten() {
        return repo.findAll().stream().map(OrkestConverter::convert).toList();
    }

    @Override
    public Orkest getOrkest(Integer id) {
        return  convert( repo.findById(id).orElse(null));
    }

    @Override
    public Integer createOrkest(CreateOrkestRequest request) {
        OrkestEntity o = repo.save(OrkestEntity.builder().naam(request.getNaam()).plaats(request.getPlaats()).build());
        return o.getId();
    }
}
