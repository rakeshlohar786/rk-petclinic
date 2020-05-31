package com.ex.rkpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rkpetclinic.model.Owner;
import rkpetclinic.model.Vet;
import rkpetclinic.service.OwnerService;
import rkpetclinic.service.VetService;
import rkpetclinic.service.map.OwnerServiceMap;
import rkpetclinic.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {

        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rakesh");
        owner1.setSecondName("Lohar");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Lalit");
        owner2.setSecondName("Desai");
        ownerService.save(owner2);

        System.out.println("Owner Data Loaded...........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jay");
        vet1.setSecondName("Pandey");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ivyanka");
        vet2.setSecondName("Trump");
        vetService.save(vet2);

        System.out.println("Vet Data Loaded...............");

    }
}
