package org.fiskalibur.controller;

import org.fiskalibur.model.Kasa;
import org.fiskalibur.model.Komitent;
import org.fiskalibur.model.Model;
import org.fiskalibur.model.Servis;
import org.fiskalibur.servis.KasaService;
import org.fiskalibur.servis.KomitentService;
import org.fiskalibur.servis.ModelService;
import org.fiskalibur.servis.ServisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private KomitentService komitentService;
    private KasaService kasaService;
    private ModelService modelService;
    private ServisService servisService;

    @Autowired
    public PageController(KomitentService komitentService, KasaService kasaService, ModelService modelService, ServisService servisService) {
        this.komitentService = komitentService;
        this.kasaService = kasaService;
        this.modelService = modelService;
        this.servisService = servisService;
    }

    Komitent komitent = new Komitent();
    Kasa kasa = new Kasa();
    Model model = new Model();
    Servis servis = new Servis();

    @RequestMapping("/test")
    public String Index() {
        komitent.setId(2);
        komitent.setNazivKomitenta("Testni");

        komitentService.saveKomitent(komitent);

        return "indl;saf glsdfhls;fdoex";
    }
}
