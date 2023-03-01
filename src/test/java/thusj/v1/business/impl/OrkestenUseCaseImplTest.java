package thusj.v1.business.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import thusj.v1.domain.Orkest;
import thusj.v1.persistence.IOrkestRepo;
import thusj.v1.persistence.entity.OrkestEntity;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrkestenUseCaseImplTest {

    @Mock
    private IOrkestRepo mockRepo;

    @InjectMocks
    private OrkestenUseCaseImpl orkestenusecase;



    @Test
    void getOrkesten() {

        OrkestEntity eersteEntity = OrkestEntity.builder().id(1).naam("Harmonie Eendracht").plaats("Meijel").build();
        OrkestEntity tweedeEntity = OrkestEntity.builder().id(2).naam("Harmonie Caecilia").plaats("Laak").build();
        when(mockRepo.findAll()).thenReturn(List.of(eersteEntity,tweedeEntity));

        Orkest eerste  = Orkest.builder().id(1).naam("Harmonie Eendracht").plaats("Meijel").build();
        Orkest tweede  = Orkest.builder().id(2).naam("Harmonie Caecilia").plaats("Laak").build();
        List<Orkest> expectedResult = List.of(eerste,tweede);

        List<Orkest> actualResult = orkestenusecase.getOrkesten();

        assertEquals(expectedResult,actualResult);
        verify(mockRepo).findAll();
    }

    @Test
    void getOrkest() {
        OrkestEntity eersteEntity = OrkestEntity.builder().id(1).naam("Harmonie Eendracht").plaats("Meijel").build();
        OrkestEntity tweedeEntity = OrkestEntity.builder().id(2).naam("Harmonie Caecilia").plaats("Laak").build();
        when(mockRepo.findById(1)).thenReturn(Optional.ofNullable(eersteEntity));

        Orkest eerste  = Orkest.builder().id(1).naam("Harmonie Eendracht").plaats("Meijel").build();

        Orkest actualResult = orkestenusecase.getOrkest(1);
        assertEquals(actualResult,eerste);
        verify(mockRepo).findById(1);

    }

//    @Test
//    void createOrkest() {
//    }
}