package com.ex.rkpetclinic.bootstrap;

import com.ex.rkpetclinic.model.*;
import com.ex.rkpetclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    protected DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;

        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0 ) {
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType dogStatus = petTypeService.save(dog);
        System.out.println("Dog Save Status " + dogStatus.getId());

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType catStatus = petTypeService.save(cat);
        System.out.println("Cat Save Status " + catStatus.getId());

        Speciality radiology = new Speciality();
        radiology.setDecription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDecription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDecription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Rakesh");
        owner1.setLastName("Lohar");
        owner1.setAddress("B-704 Viva Kingston Cronw Bldg");
        owner1.setCity("Virar Mumba");
        owner1.setTelephone("121233");

        Pet sheru = new Pet();
        sheru.setPetType(dog);
        sheru.setBirthDate(LocalDate.now());
        sheru.setOwner(owner1);
        sheru.setName("Sheru");
        owner1.getPets().add(sheru);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Lalit");
        owner2.setLastName("Desai");
        owner2.setAddress("B-704 Viva Kingston Cronw Bldg");
        owner2.setCity("Virar Mumba");
        owner2.setTelephone("121233");

        Pet simmi = new Pet();
        simmi.setPetType(catStatus);
        simmi.setBirthDate(LocalDate.now());
        simmi.setOwner(owner2);
        simmi.setName("Simmi");
        owner2.getPets().add(simmi);
        ownerService.save(owner2);


        System.out.println("Rakesh Code Failed");
        Visit firstVisit = new Visit();
        firstVisit.setDate(LocalDate.now());
        firstVisit.setPet(simmi);
        firstVisit.setDescription("Cute Simmi");
        visitService.save(firstVisit);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jay");
        vet1.setLastName("Pandey");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Ivyanka");
        vet2.setLastName("Trump");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

    }
}