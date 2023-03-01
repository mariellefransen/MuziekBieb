package thusj.v1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import thusj.v1.persistence.entity.OrkestEntity;

public interface IOrkestRepo extends JpaRepository<OrkestEntity,Integer> {



}
