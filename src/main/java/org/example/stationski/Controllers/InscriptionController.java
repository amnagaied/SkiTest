package org.example.stationski.Controllers;
import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Inscription;
import org.example.stationski.Services.Interfaces.CourService;
import org.example.stationski.Services.Interfaces.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Inscription")

public class InscriptionController {
    @Autowired
    InscriptionService InscriptionService;

    @PostMapping("/AjouterInscription")
    public Inscription AjouterInscription(@RequestBody Inscription a) {return InscriptionService.AjouterInscription(a);}
    @PostMapping("/ModifierInscription")
    public Inscription ModifierInscription(@RequestBody Inscription a) {return InscriptionService.ModifierInscription(a);}
    @DeleteMapping("/SupprimerInscription")
    public void SupprimerInscription(@RequestBody Long id) {InscriptionService.SupprimerInscription(id);}
    @GetMapping("/GetInscription")
    public Inscription GetInscription(@RequestBody Long id) {return InscriptionService.GetInscription(id);}
    @GetMapping("/GetAllInscription")
    public List<Inscription> GetAllInscription() {return InscriptionService.GetAllInscription();}

}
