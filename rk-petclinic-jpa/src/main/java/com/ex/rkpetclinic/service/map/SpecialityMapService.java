package com.ex.rkpetclinic.service.map;

import com.ex.rkpetclinic.model.Speciality;
import com.ex.rkpetclinic.service.SpecialityService;

import java.util.Set;

public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}