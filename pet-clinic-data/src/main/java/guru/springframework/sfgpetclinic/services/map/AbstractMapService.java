package guru.springframework.sfgpetclinic.services.map;

// Lecture 69 Created
// Lecture 88, Issue 22 Refactor Changed the ID to be Long or something
//    that extends Long, and BAseEntitu and refactory save()

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        // System.out.println("AbstractMapService... num of owners: " +map.size());
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if(object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("AbstractMapService: object can't be null");
        }
        return object;

    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    // Lecture 88, Issue 22 Refactor this to account for empty map. Set id to 1L
    private Long getNextId() {

        Long nextId = null;

        try {
            return Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;

    }

}
