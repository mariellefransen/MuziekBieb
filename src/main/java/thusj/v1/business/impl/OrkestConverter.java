package thusj.v1.business.impl;


import thusj.v1.domain.Orkest;
import thusj.v1.persistence.entity.OrkestEntity;

final class OrkestConverter {
    private OrkestConverter() {
    }

    public static Orkest convert(OrkestEntity orkestEntity) {
        return Orkest.builder()
                .id(orkestEntity.getId())
                .naam(orkestEntity.getNaam())
                .plaats(orkestEntity.getPlaats())
                .build();
    }
}
