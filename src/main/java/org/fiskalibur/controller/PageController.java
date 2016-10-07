package org.fiskalibur.controller;

import org.fiskalibur.model.Komitent;
import org.fiskalibur.servis.KomitentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    private KomitentService komitentService;

    @Autowired
    public PageController(KomitentService komitentService) {
        this.komitentService = komitentService;
    }

    @RequestMapping("/saveKomitent")
    public Komitent saveKomitent(@RequestBody Komitent komitent) {
        return komitentService.saveKomitent(komitent);
    }

    @RequestMapping("/getAllKomitents")
    public Iterable<Komitent> getAllKomitents() {
        return komitentService.getAllKomitents();
    }

    @RequestMapping("/deleteKomitent")
    public void delteKomitent(@RequestBody int id) {
        komitentService.deleteKom(id);
    }

    @RequestMapping("/getOneKomitent")
    public Komitent getKomitent(@RequestBody int id) {
       return komitentService.getKomitent(id);
    }

    @RequestMapping("/test")
    public Komitent test() {
        Komitent komitent = komitentService.getKomitent(7);
        return komitentService.getKomitent(2);
    }
}
