package guru.springframework.sfgpetclinic.services.map;

// Created in Lecture 69
// Lecture 87 - Change from implementing CrudService to implementing VetService, which in turn
//    implements CrudSerivce
// Lecutre 88, issue 22 - Get rid of object.getId() in param in
//     super.save(object.getId() , object). Added @Service so Spring will manage this bean
//     and make it available for autowiring in the DataLoader and controllers classes
// Lecture 91 - work for this done under lecture 88
// Lecture 132 - Add code to save so that if we get a Vet that has a specialty with no id
//                 we save that specialty, which creates an id. We then set the Id on our
//                 specialty.
// Lecture 161 - Renamed from VetServiceMap for consistency


import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        // Make sure all the Vet's specialties have a valid id. If they don't,
        // save the specialty to get one and assign it.
        if (object.getSpecialties().size() > 0) {
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }

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
