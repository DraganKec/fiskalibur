package org.fiskalibur.servis;

import org.fiskalibur.model.Kasa;

public interface KasaService {

    Kasa getKasa(int id);

    Iterable<Kasa> getAll();

    Kasa saveKasa(Kasa entity);

}
