package application.controller;

import application.dao.PanaszDAO;
import application.dao.UserDAO;
import application.model.Panasz;
import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class PanaszController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private PanaszDAO panaszDAO;

    @GetMapping(value="/panaszbenyujtas")
    public String panaszbenyujtas(){
        return "panaszbenyujtas";
    }

    @PostMapping(value="/panaszKuldes")
    public String panaszKuldes(@RequestParam("uzenet") String uzenet){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        User currentUser = userDAO.getUserByEmail(currentPrincipalName);
        String timeStamp = (new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss")
                .format(Calendar.getInstance().getTime()))
                .replace("_", " ");

        Panasz ujPanasz = new Panasz(currentUser.getId(), timeStamp,uzenet,"defaultTermek");

        panaszDAO.insertPanasz(ujPanasz);
        return "panaszbenyujtas";
    }
}
