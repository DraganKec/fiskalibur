package org.fiskalibur.controller;

import org.fiskalibur.model.Kasa;
import org.fiskalibur.servis.KasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dragan on 18/10/16.
 */
@RestController
public class KasaController {

    private KasaService kasaService;

    @Autowired
    public KasaController(KasaService kasaService) {
        this.kasaService = kasaService;
    }

    @RequestMapping("/getAllKasa")
    public Iterable<Kasa> GetAllKasa() {
        return kasaService.getAll();
    }
}