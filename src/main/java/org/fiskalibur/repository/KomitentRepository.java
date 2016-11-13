package org.fiskalibur.repository;

import org.fiskalibur.model.Komitent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface KomitentRepository extends CrudRepository<Komitent, Integer> {

    @Query(value = "SELECT new org.fiskalibur.model.Komitent(k.id, k.nazivKomitenta) FROM Komitent k")
    Iterable<Komitent> getNazivKomitenta();
}
