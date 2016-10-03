package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Komitent;
import org.fiskalibur.repository.KomitentRepository;
import org.fiskalibur.servis.KomitentService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
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

    @Override
    public void deleteKom(int id) {
        komitentRepository.delete(id);
    }
}
