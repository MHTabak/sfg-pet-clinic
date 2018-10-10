package guru.springframework.sfgpetclinic.bootstrap;

// Created Lecture 87
// Lecture
// Lecuture 88, issue 22, get rid of {owner/vet/}.setId() calls. This
//          work is also done in lecture 91


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
//import guru.springframework.sfgpetclinic.services.map.VetServiceMap;


@Component
public class DataLoader implements CommandLineRunner {

    // This made the service local to this class. We need to get Spring Managed bean
    // versions of these classes, so the data can be accessed by other modules
    // private final OwnerService ownerService;
    // private final VetService vetService;

    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader() {
        // Set as local attributes, need Spring managed bean versions
        //OwnerService = new OwnerServiceMap();
        //vetService = new VetServiceMap();
    }

    @Autowired
    public void setOwnerService(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Autowired
    public void setVetService(VetService vetService) {
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading owners ... ");

        Owner owner1 = new Owner();
        // owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loading Vets ...");

        Vet vet1 = new Vet();
        // vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        // vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }

}
