package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Servis;
import org.fiskalibur.repository.ServisRepository;
import org.fiskalibur.servis.ServisService;

import javax.annotation.Resource;

public class ServisServiceImpl implements ServisService {

    @Resource
    private ServisRepository servisRepository;

    @Override
    public Servis saveServis(Servis servis) {
        return servisRepository.save(servis);
    }
}
