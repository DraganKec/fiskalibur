package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Kasa;
import org.fiskalibur.repository.KasaRepository;
import org.fiskalibur.servis.KasaService;
import javax.annotation.Resource;

public class KasaServiceImpl implements KasaService {

    @Resource
    private KasaRepository kasaRepository;

    @Override
    public Kasa getKasa(int id) {
        return kasaRepository.findOne(id);
    }

    @Override
    public Iterable<Kasa> getAll() {
        return kasaRepository.findAll();
    }

    @Override
    public Kasa saveKasa(Kasa entity) {
        return kasaRepository.save(entity);
    }


}
