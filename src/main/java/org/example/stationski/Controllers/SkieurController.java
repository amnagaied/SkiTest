package org.example.stationski.Controllers;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Skieur;
import org.example.stationski.Services.Interfaces.AbonnementService;
import org.example.stationski.Services.Interfaces.CourService;
import org.example.stationski.Services.Interfaces.SkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("/Skieur")

public class SkieurController  {
    @Autowired

    SkieurService SkieurService;

    @PostMapping("/AjouterSkieur")
    public Skieur AjouterSkieur(@RequestBody Skieur a) {return SkieurService.AjouterSkieur(a);}
    @PostMapping("/ModifierSkieur")
    public Skieur ModifierSkieur(@RequestBody Skieur a) {return SkieurService.ModifierSkieur(a);}
    @DeleteMapping("/SupprimerSkieur")
    public void SupprimerSkieur(@RequestBody Long id) {SkieurService.SupprimerSkieur(id);}
    @GetMapping("/GetSkieur")
    public Skieur GetSkieur(@RequestBody Long id) {return SkieurService.GetSkieur(id);}
    @GetMapping("/GetAllSkieur")
    public List<Skieur> GetAllSkieur() {return SkieurService.GetAllSkieur();}
}
