package guru.springframework.sfgpetclinic.services.map;

// Created Lecture 69
// Lecture 87 Change to implement OwnerService, instead of CrudService OwnerService
//    implements CrudService. Add implementation for findByLastName()
// Lecture 88, issue 22, get rid of object.getId() in param in
//     super.save(object.getId() , object).
// Lecture 89 Was missing @Service on this class. Added @Service so Spring will make
//     this a managed bean and make it available for autowiring
//

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>  implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        // System.out.println("OnwerServiceMap...");
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
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
