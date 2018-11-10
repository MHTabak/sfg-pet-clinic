package guru.springframework.sfgpetclinic.services.map;

// Created Lecture 69
// Lecture 87 Change to implement OwnerService, instead of CrudService OwnerService
//    implements CrudService. Add implementation for findByLastName()
// Lecture 88, issue 22, get rid of object.getId() in param in
//     super.save(object.getId() , object).
// Lecture 89 Was missing @Service on this class. Added @Service so Spring will make
//     this a managed bean and make it available for autowiring
// Lecture 91 - work for this was done under lecture 88
// Lecture 130 - Add PetTypeService and PetService. Modify the save(Owner object) method
//                  to check for null object

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        // System.out.println("OnwerServiceMap...");
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    // Lecture 130 - If an owner has no pets (null per list), Persist the Onwer
    // If the owner has pets, iterate over the pits, and for each pet,
    //    see if the PetType is null, throw and exeception - musgt have a PetType
    //    If the PetType is not null, see if the PetType has an id
    //    If there is no id for the PetType, set the PetType id to the value
    //      returned by persisting the PetType
    //    If the Pet id is null, set it to the value returned from PetService.sage()
    @Override
    public Owner save(Owner object) {

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if(pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                        if(pet.getId() == null) {
                            Pet savedPet = petService.save(pet);
                            pet.setId(savedPet.getId());
                        }
                    } else {
                        throw new RuntimeException("Pet Type is Required");
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}
