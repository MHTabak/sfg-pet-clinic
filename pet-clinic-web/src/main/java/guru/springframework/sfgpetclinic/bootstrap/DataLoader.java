package guru.springframework.sfgpetclinic.bootstrap;

// Created Lecture 87
// Lecture
// Lecture 88, issue 22, get rid of {owner/vet/}.setId() calls. This
//          work is also done in lecture 91
// Lecture 129 - Add PetType data, set services in constructor and made them final
// Lecture 130 - Add contact information for Owners we create. Add a dog for Mike
//               and a cat for Fiona


import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

//import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
//import guru.springframework.sfgpetclinic.services.map.VetServiceMap;


@Component
public class DataLoader implements CommandLineRunner {

    // This made the service local to this class. We need to get Spring Managed bean
    // versions of these classes, so the data can be accessed by other modules
    // private final OwnerService ownerService;
    // private final VetService vetService;

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        // Set as local attributes, need Spring managed bean versions
        //OwnerService = new OwnerServiceMap();
        //vetService = new VetServiceMap();
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    // In Lecture 129, John seems to have changed to using constructor injection. I will comment
    // out these two methods so I do it the same way. Note, changed these service attributes to
    // be final. Had to remove the final property for setter injection.
    //@Autowired
    //public void setOwnerService(OwnerService ownerService) {
    //    this.ownerService = ownerService;
    //}

    //@Autowired
    //public void setVetService(VetService vetService) {
    //    this.vetService = vetService;
    //}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading PetTypes");
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        System.out.println("Loading Wwners ... ");

        Owner owner1 = new Owner();
        // owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
