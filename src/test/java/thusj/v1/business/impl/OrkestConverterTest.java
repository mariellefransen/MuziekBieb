package thusj.v1.business.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import thusj.v1.domain.Orkest;
import thusj.v1.persistence.entity.OrkestEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static thusj.v1.business.impl.OrkestConverter.convert;

class OrkestConverterTest {

    OrkestEntity orkestEntity,wrongEntity;
    @BeforeEach
    void setUp() {
        // setup an OrkestEntity to convert
        orkestEntity = OrkestEntity.builder().id(1).naam("Harmonie").plaats("Meijel").build();
    }

    @Test
    void convertCorrectEntity() {
        Orkest o = convert(orkestEntity);
        assertEquals(o.getId(),1);
        assertEquals(o.getPlaats(),"Meijel");
        assertEquals(o.getNaam(),"Harmonie");
    }


}