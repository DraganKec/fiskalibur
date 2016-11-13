package org.fiskalibur.servis;

import org.fiskalibur.model.Komitent;

public interface KomitentService {

    Komitent saveKomitent(Komitent komitent);

    Komitent getKomitent(int id);

    Iterable<Komitent> getAllKomitents();

    void deleteKom (int id);

    Iterable<Komitent> getNazivKomitenta ();

}
