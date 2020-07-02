package com.ex.rkpetclinic.repository;

import com.ex.rkpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
