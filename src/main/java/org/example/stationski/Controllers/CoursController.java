package org.example.stationski.Controllers;

import org.example.stationski.Entities.Abonnement;
import org.example.stationski.Entities.Cours;
import org.example.stationski.Services.Interfaces.AbonnementService;
import org.example.stationski.Services.Interfaces.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cours")
public class CoursController {
    @Autowired
    CourService CoursService;

    @PostMapping("/AjouterCours")
    public Cours AjouterCours(@RequestBody Cours a) {return CoursService.AjouterCours(a);}
    @PostMapping("/ModifierCours")
    public Cours ModifierCours(@RequestBody Cours a) {return CoursService.ModifierCours(a);}
    @DeleteMapping("/SupprimerCours")
    public void SupprimerCours(@RequestBody Long id) {CoursService.SupprimerCours(id);}
    @GetMapping("/GetCours")
    public Cours GetCours(@RequestBody Long id) {return CoursService.GetCours(id);}
    @GetMapping("/GetAllCours")
    public List<Cours> GetAllCours() {return CoursService.GetAllCours();}
}
