package guru.springframework.sfgpetclinic.services.map;

// Created in Lecture 69
// Lecture 87 Chang from implementing CrudService to implementing VetService, which in turn
//    implements CrudSerivce
// Lecutre 88, issue 22, get rid of object.getId() in param in
//     super.save(object.getId() , object). Added @Service so Spring will manage this bean
//     and make it available for autowiring in the DataLoader and controllers classes

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
