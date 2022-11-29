package application.controller;

import application.dao.ArucikkDAO;
import application.model.Arucikk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ArucikkController {

    @Autowired
    private ArucikkDAO arucikkDAO;

    @PostMapping(value = "registarucikk")
    public String registerNewArucikk(@RequestParam("nev") String nev, @RequestParam("ar") String ar_input, @RequestParam("db") String db_input) {
        if(!nev.trim().equals("") && !ar_input.trim().equals("") && !db_input.trim().equals("")){
            if(fuggvenyek.isInteger(ar_input) && fuggvenyek.isInteger(db_input)){
                float ar = Float.parseFloat(ar_input.trim());
                float db = Float.parseFloat(db_input.trim());

                Arucikk aru = new Arucikk(nev,ar,db);
                arucikkDAO.insertArucikk(aru);
            }
        }

        return "redirect:/arucikk_hozzaadasa";
    }

   // @GetMapping("/transport")
  //  public String transport(){
     //   return "transport";
   // }

   @PostMapping(value = "arucikk_hozzaadasa/{id}")
   public String deleteArucikk(@RequestParam("id")String id) {
       if(!id.trim().equals("") &&  fuggvenyek.isInteger(id)) {
           int ide = Integer.parseInt(id.trim());
           arucikkDAO.deleteArucikk(ide);
       }
       return "redirect:/arucikk_hozzaadasa";
   }


    @GetMapping("/arucikk_hozzaadasa")
    public String listArucikk(Model model) {
        model.addAttribute("arucikk",arucikkDAO.listArucikks());
        return "arucikk_hozzaadasa";
    }

    @PostMapping(value = "/arucikk_update/{id}")
    public String updateArucikk(@RequestParam("id") String input_id, @RequestParam("ar") String input_ar, @RequestParam("db") String input_db) {
        if(!input_id.trim().equals("") && !input_ar.trim().equals("") && !input_db.trim().equals("")){
            if(fuggvenyek.isInteger(input_id) && fuggvenyek.isInteger(input_ar) && fuggvenyek.isInteger(input_db)){
                int id = Integer.parseInt(input_id.trim());
                int ar = Integer.parseInt(input_ar.trim());
                int db = Integer.parseInt(input_db.trim());
                arucikkDAO.updateAru(id,ar,db);
            }
        }

        return "redirect:/arucikk_hozzaadasa";
    }
}

