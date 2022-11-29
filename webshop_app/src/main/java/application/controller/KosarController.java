package application.controller;

import application.dao.KosarDAO;
import application.dao.UserDAO;
import application.model.*;
import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KosarController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private KosarDAO kosarDAO;

    @PostMapping(value = "/registujvasarlas")
    public String registerNewPurchase(@RequestParam("vasarolt_termek_name") String nev, @RequestParam("vasarolt_termek_darab") int db) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        User currentUser = userDAO.getUserByEmail(currentPrincipalName);
        int arucikk_ara = 1000;
        Arucikk arucikk = new Arucikk(nev, arucikk_ara, db);
        Arucikk[] arucikkek = new Arucikk[1];
        arucikkek[0] = arucikk;
        int[] arucikkekDarab = new int[1];
        arucikkekDarab[0] = db;
        Kosar kosar = new Kosar(arucikkek, arucikkekDarab, currentUser.getId());
        Szallitas szallitas= new Szallitas(currentUser.getId(),currentUser.getCim(), arucikk.getNev(),kosar.getOsszAr());

        int plus_pont = (int)(Math.round(((arucikk_ara*db)*0.10) + currentUser.getFelhasznalhato_keret()));
        userDAO.updateUserKeret(currentUser.getId(),plus_pont);
        kosarDAO.insertSzallitas(szallitas);
        kosarDAO.insertKosar(kosar);

        return "redirect:/cart";
    }

    // @GetMapping("/transport")
    //  public String transport(){
    //   return "transport";
    // }
    @GetMapping("/transport")
    public String felhasznalok_kezelese(Model model){
        model.addAttribute("szallit",kosarDAO.listSzallitasok());
        return "transport";
    }
    @PostMapping(value = "/transport_update/{id}")
    public String updateSzallitasok(@RequestParam("id") String input_id, @RequestParam("vasarlo_id") String input_vasarlo_id, @RequestParam("cim") String input_cim,@RequestParam("arucikkek") String input_arucikkek,@RequestParam("vegosszeg") String input_vegosszeg) {

        if(!input_id.trim().equals("") && !input_vasarlo_id.trim().equals("") && !input_cim.trim().equals("")&& !input_arucikkek.trim().equals("")&& !input_vegosszeg.trim().equals("")){
            if(fuggvenyek.isInteger(input_id) && fuggvenyek.isInteger(input_vasarlo_id)  ){
                int id = Integer.parseInt(input_id.trim());
                int vasarlo_id = Integer.parseInt(input_vasarlo_id.trim());
                float vegosszeg=Float.parseFloat(input_vegosszeg.trim());
                kosarDAO.updateSzallitasok(id,vasarlo_id,input_cim,input_arucikkek,vegosszeg);

            }

        }

        return "redirect:/transport";
    }
}
