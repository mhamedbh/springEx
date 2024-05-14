package tn.esprit.ExamenSpring.controll;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/spring")
public class TestController {




//    @PostMapping("/add-participant")
//    public Participant addChambre(@RequestBody Participant c) {
//        Participant chambre = participantService.ajouterParticipant(c);
//        return chambre;
//    }
//

//
//    @GetMapping("/retrieve-par")
//    public List<Participant> getChambres() {
//        return participantService.getParReservLogis();
//    }
//

//    @PostMapping("/add-logistique/{d}")
//    public Logistique addzeaChambre(@RequestBody Logistique c,@PathVariable("d") String d) {
//        return logistiqueService.ajoutAffectLogEvnm(c,d);
//    }

//
//    @GetMapping("/retrieve-logistique/{dd}/{df}")
//    public List<Logistique> getChambres(@PathVariable("dd")@DateTimeFormat(pattern = "yyyy-MM-dd") Date dd, @PathVariable("df")@DateTimeFormat(pattern = "yyyy-MM-dd") Date df) {
//        return logistiqueService.getLogistiquesDates(dd,df);
//    }
//

//    @PostMapping("/add-evenement")
//    public Evenement addChaeazembre(@RequestBody Evenement c) {
//        Evenement chambre = evenementService.ajoutAffectEvenParticip(c);
//        return chambre;
//    }

}
