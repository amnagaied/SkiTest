package org.example.stationski.Controllers;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Moniteur;
import org.example.stationski.Services.Interfaces.CourService;
import org.example.stationski.Services.Interfaces.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Moniteur")

public class MoniteurController {
    @Autowired
    private final MoniteurService MoniteurService;

    public MoniteurController(org.example.stationski.Services.Interfaces.MoniteurService moniteurService) {
        MoniteurService = moniteurService;
    }

    @PostMapping("/AjouterMoniteur")
    public Moniteur AjouterMoniteur(@RequestBody Moniteur a) {return MoniteurService.AjouterMoniteur(a);}
    @PostMapping("/ModifierMoniteur")
    public Moniteur ModifierMoniteur(@RequestBody Moniteur a) {return MoniteurService.ModifierMoniteur(a);}
    @DeleteMapping("/SupprimerMoniteur")
    public void SupprimerMoniteur(@RequestBody Long id) {MoniteurService.SupprimerMoniteur(id);}
    @GetMapping("/GetMoniteur")
    public Moniteur GetMoniteur(@RequestBody Long id) {return MoniteurService.GetMoniteur(id);}
    @GetMapping("/GetAllMoniteur")
    public List<Moniteur> GetAllMoniteur() {return MoniteurService.GetAllMoniteur();}
}
