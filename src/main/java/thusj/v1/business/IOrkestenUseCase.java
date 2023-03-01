package thusj.v1.business;

import thusj.v1.domain.Orkest;
import thusj.v1.domain.reqres.CreateOrkestRequest;

import java.util.List;

public interface IOrkestenUseCase {

  List<Orkest> getOrkesten();
  Orkest getOrkest(Integer id);

  //TODO: change response of kan dat ook zo?
  Integer createOrkest(CreateOrkestRequest request);



}
