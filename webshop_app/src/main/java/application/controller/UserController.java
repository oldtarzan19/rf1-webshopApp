package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import application.dao.UserDAO;
import application.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

  @Autowired
  private UserDAO userDAO;

  @GetMapping("/register")
  public String register() {
    return "register";
  }

  @GetMapping("/index")
  public String index() {
    return "redirect:/";
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping("/cart")
  public String cart(){return "cart";};

  @GetMapping("/felhasznalok_kezelese")
  public String felhasznalok_kezelese(Model model){
    model.addAttribute("user",userDAO.listUsers());

    return "felhasznalok_kezelese";
  }

  @PostMapping(value = "/registeruser")
  public String registerUser(@RequestParam("felhasznalonev") String felhasznalonev,@RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("cim") String cim) {
    User user = new User(felhasznalonev,email, password, cim);
    userDAO.insertUser(user);

    return "redirect:/";
  }

  @GetMapping("/husegpontok")
  public String husegpontok(Model model){
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String currentPrincipalName = authentication.getName();
    User currentUser = userDAO.getUserByEmail(currentPrincipalName);
    model.addAttribute("husegpontok",currentUser.getFelhasznalhato_keret());
    return "husegpontok";
  }

  @PostMapping(value = "/felhasznalok_kezelese_torles/{id}")
  public String deleteUser(@RequestParam("id")String id) {
    if(!id.trim().equals("") &&  fuggvenyek.isInteger(id)) {
      int ide = Integer.parseInt(id.trim());
      userDAO.deleteUser(ide);
    }
    return "redirect:/felhasznalok_kezelese";
  }

  @PostMapping(value = "/felhasznalok_kezelese_modosit/{id}")
  public String updateUser(@RequestParam("id") String input_id,@RequestParam("felhnev") String input_felhnev , @RequestParam("email") String input_email, @RequestParam("cim") String input_cim) {
    if(!input_id.trim().equals("") && !input_felhnev.trim().equals("") && !input_email.trim().equals("") && !input_cim.trim().equals("")){
      if(fuggvenyek.isInteger(input_id)){
        int id = Integer.parseInt(input_id);
        userDAO.updateUser(id,input_felhnev,input_email,input_cim);
      }
    }
    return "redirect:/felhasznalok_kezelese";
  }

  @GetMapping("/premium")
  public String premium(Model model){
    model.addAttribute("premiumUsers",listPremiumUsers());
    return "premium";
  }

  public List<User> listPremiumUsers(){
    List<User> input_usert = userDAO.listUsers();
    List<User> premiumUsers = new ArrayList<User>();

    for (int i = 0; i < input_usert.size(); i++) {
      if (input_usert.get(i).getFelhasznalhato_keret()>150){
        premiumUsers.add(input_usert.get(i));
      }
    }

    return premiumUsers;
  }


}