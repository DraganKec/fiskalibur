package org.fiskalibur.controller;

import org.fiskalibur.model.Model;
import org.fiskalibur.servis.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @RequestMapping("/getAllModels")
    public Iterable<Model> getAllModels() {
        return modelService.getAllModels();
    }
}
