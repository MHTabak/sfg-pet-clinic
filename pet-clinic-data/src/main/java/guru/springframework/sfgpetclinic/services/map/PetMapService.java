package guru.springframework.sfgpetclinic.services.map;

// Created Lecture 69
// Lecture 87. Change to implement PetService, which in turn implements CrudService
//    Correction to how things were set up.
// Lecture 88, issue 22, get rid of object.getId() in param in
//     super.save(object.getId() , object).
// Lecture 91 work for this lecture done under lecture 88
// Lecture 130 - Added @Service
// Lecture 161 - Renamed from PetMapService for consistency
// Lecture 165 - Add @Profile({“default”, “map” }) so this file will only be
//               implemented if the "default" or "map" profiles are active

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map" })
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

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
        return super.save(object);
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
