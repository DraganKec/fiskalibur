package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Komitent;
import org.fiskalibur.repository.KomitentRepository;
import org.fiskalibur.servis.KomitentService;
import javax.annotation.Resource;

public class KomitentServiceImpl implements KomitentService {

    @Resource
    private KomitentRepository komitentRepository;

    @Override
    public Komitent saveKomitent(Komitent komitent) {
        return komitentRepository.save(komitent);
    }

    @Override
    public Komitent getKomitent(int id) {
        return komitentRepository.findOne(id);
    }

    @Override
    public Iterable<Komitent> getAllKomitents() {
        return komitentRepository.findAll();
    }
}
