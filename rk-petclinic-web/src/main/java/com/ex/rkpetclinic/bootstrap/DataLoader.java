package com.ex.rkpetclinic.bootstrap;

import com.ex.rkpetclinic.model.PetType;
import com.ex.rkpetclinic.service.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.ex.rkpetclinic.model.Owner;
import com.ex.rkpetclinic.model.Vet;
import com.ex.rkpetclinic.service.OwnerService;
import com.ex.rkpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    protected DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;

    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType dogStatus = petTypeService.save(dog);
        System.out.println("Dog Save Status "+dogStatus.getId());

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType catStatus = petTypeService.save(cat);
        System.out.println("Cat Save Status "+catStatus.getId());

        Owner owner1 = new Owner();
        owner1.setFirstName("Rakesh");
        owner1.setSecondName("Lohar");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Lalit");
        owner2.setSecondName("Desai");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Jay");
        vet1.setSecondName("Pandey");
        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Ivyanka");
        vet2.setSecondName("Trump");
        vetService.save(vet2);


    }
}