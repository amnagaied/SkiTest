package org.example.stationski.Controllers;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Services.Interfaces.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Abonnement")
public class AbonnementController {
    @Autowired
     AbonnementService abonnementService;

    @PostMapping("/AjouterAbonnement")
    public Abonnement AjouterAbonnement(@RequestBody Abonnement a) {return abonnementService.AjouterAbonnement(a);}
    @PostMapping("/ModifierAbonnement")
    public Abonnement ModifierAbonnement(@RequestBody Abonnement a) {return abonnementService.ModifierAbonnement(a);}
    @DeleteMapping("/SupprimerAbonnement")
    public void SupprimerAbonnement(@RequestBody Long id) {abonnementService.SupprimerAbonnement(id);}
    @GetMapping("/GetAbonnement")
    public Abonnement GetAbonnement(@RequestBody Long id) {return abonnementService.GetAbonnement(id);}
    @GetMapping("/GetAllAbonnement")
    public List<Abonnement> GetAllBloc() {return abonnementService.GetAllAbonnement();}
}
