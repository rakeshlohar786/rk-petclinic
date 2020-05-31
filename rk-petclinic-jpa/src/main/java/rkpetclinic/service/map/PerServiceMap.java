package rkpetclinic.service.map;

import rkpetclinic.model.Pet;
import rkpetclinic.service.CrudService;
import rkpetclinic.service.PetService;
import rkpetclinic.service.VetService;

import java.util.Set;

public class PerServiceMap extends AbstractMapService<Pet,Long> implements PetService
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
