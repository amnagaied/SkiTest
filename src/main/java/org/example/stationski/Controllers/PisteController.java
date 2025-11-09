package org.example.stationski.Controllers;

import org.example.stationski.Entities.Cours;
import org.example.stationski.Entities.Piste;
import org.example.stationski.Services.Interfaces.CourService;
import org.example.stationski.Services.Interfaces.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Piste")

public class PisteController {
    @Autowired
    PisteService PisteService;

    @PostMapping("/AjouterPiste")
    public Piste AjouterPiste(@RequestBody Piste a) {return PisteService.AjouterPiste(a);}
    @PostMapping("/ModifierPiste")
    public Piste ModifierPiste(@RequestBody Piste a) {return PisteService.ModifierPiste(a);}
    @DeleteMapping("/SupprimerPiste")
    public void SupprimerPiste(@RequestBody Long id) {PisteService.SupprimerPiste(id);}
    @GetMapping("/GetPiste")
    public Piste GetPiste(@RequestBody Long id) {return PisteService.GetPiste(id);}
    @GetMapping("/GetAllPiste")
    public List<Piste> GetAllPiste() {return PisteService.GetAllPiste();}
}
