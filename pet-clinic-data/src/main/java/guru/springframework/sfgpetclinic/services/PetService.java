package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;

import java.util.Set;


public interface PetService extends CrudService<Pet, Long> {

    Set<Pet> findByPetType(PetType petType);
}
