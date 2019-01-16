package piyush.springframework.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import piyush.springframework.domain.UnitOfMeasure;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByDescriptionTeaspoon() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", uomOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionPinch() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Pinch");
        assertEquals("Pinch", uomOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionOunce() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Ounce");
        assertEquals("Ounce", uomOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionEach() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Each");
        assertEquals("Each", uomOptional.get().getDescription());
    }

    @Test
    public void findByDescriptionCup() throws Exception {
        Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals("Cup", uomOptional.get().getDescription());
    }
}