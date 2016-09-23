package org.fiskalibur.servis.imp;

import org.fiskalibur.model.Model;
import org.fiskalibur.repository.ModelRepository;
import org.fiskalibur.servis.ModelService;

import javax.annotation.Resource;

public class ModelServiceImpl implements ModelService {

    @Resource
    private ModelRepository modelRepository;

    @Override
    public Model saveModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Iterable<Model> getAllModels() {
        return modelRepository.findAll();
    }
}
