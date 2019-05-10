package guru.springframework.sfgpetclinic.services.springdatajpa;

// Created in Lecture 192

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Smith";

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;

    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = service.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());

        verify(ownerRepository).findByLastName(any());

    }

    @Test
    void findAll() {

        // Put 2 owners into a Hashset
        Set<Owner> returnOwnersSet = new HashSet<>();
        returnOwnersSet.add(Owner.builder().id(1L).build());
        returnOwnersSet.add(Owner.builder().id(2L).build());

        // Use Mockito when to return the Owner set above when findAll()
        // is called
        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);

        // Call the service invocation of OwnerRepository.findAll()
        Set<Owner> owners = service.findAll();

        // Check owner set is not null and has a size of 2
        assertNotNull(owners);
        assertEquals(2, owners.size());

    }

    @Test
    void findById() {

        // Tell Mockito that when the OwnerRepository.findById() is called, retrun an Optional
        // Owner based on returnOwner The call to anyLong() means any Long value returned is OK
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        // Make the call to findByid()
        Owner owner = service.findById(1L);

        // Check the return object is not null
        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {

        // Tell Mockito that when the OwnerRepository.findById() is called, return an
        // Optional empty
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        // Make the call to findByid()
        Owner owner = service.findById(1L);

        // Check the return object is not null
        assertNull(owner);

    }

    @Test
    void save() {

        // Create an owner object to save
        Owner ownerToSave = Owner.builder().id(1L).build();

        // Tell Mockito that when save() is called, return the returnOwner object
        when(ownerRepository.save(any())).thenReturn(returnOwner);

        // Call the save() method
        Owner savedOwner = service.save(ownerToSave);

        assertNotNull(savedOwner);

        // Verify the OwnerRepsitory.save() method was called
        verify(ownerRepository).save(any());

    }

    @Test
    void delete() {

        service.delete(returnOwner);

        // The delete method does not return an object. We can only check that the
        // method was actually called once
        verify(ownerRepository, times(1)).delete(any());

    }

    @Test
    void deleteById() {

        service.deleteById(1L);

        // The delete method does not return an object. We can only check that the
        // method was actually called once. Note, this is the same as above, but
        // if we don't use times(1) as the number of calls, Mockito will check for 1 call
        verify(ownerRepository).deleteById(any());

    }
}