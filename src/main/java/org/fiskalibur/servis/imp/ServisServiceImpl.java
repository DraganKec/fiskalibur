package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Servis;
import org.fiskalibur.repository.ServisRepository;
import org.fiskalibur.servis.ServisService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
@Transactional
public class ServisServiceImpl implements ServisService {

    @Resource
    private ServisRepository servisRepository;

    @Override
    public Servis saveServis(Servis servis) {
        return servisRepository.save(servis);
    }
}
