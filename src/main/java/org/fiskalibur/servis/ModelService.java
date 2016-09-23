package org.fiskalibur.servis;

import org.fiskalibur.model.Model;

public interface ModelService {

    Model saveModel(Model model);

    Iterable<Model> getAllModels ();

}
