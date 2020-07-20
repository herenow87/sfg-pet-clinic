package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;

import java.util.Set;


public interface PetService {
    Pet findById(Long id);

    Set<Pet> findByPetType(PetType petType);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
