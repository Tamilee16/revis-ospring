package appspring.controllers; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
importorg.springframework.ui.model;

@Controller 
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "Olá Mundo!!!");
        return "/home/index";
    }
}




