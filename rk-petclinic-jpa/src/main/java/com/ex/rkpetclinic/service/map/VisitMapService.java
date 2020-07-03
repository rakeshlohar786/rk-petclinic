package com.ex.rkpetclinic.service.map;

import com.ex.rkpetclinic.model.Visit;
import com.ex.rkpetclinic.service.VisitService;
import org.springframework.stereotype.Service;

import javax.sound.midi.VoiceStatus;
import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long>
             implements VisitService
{

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        System.out.println("-----"+visit.getPet());
        System.out.println("------"+visit.getPet().getOwner());
        System.out.println("------"+ visit.getPet().getId());
        System.out.println("-------"+visit.getPet().getOwner().getId());

        if(visit.getPet() == null || visit.getPet().getOwner() == null ||
           visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null){
           throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
