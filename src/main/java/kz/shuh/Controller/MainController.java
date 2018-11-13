package kz.shuh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Shuhratjan Nizamov
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String view(Model model){
        model.addAttribute("msg","Shuhratjan Nizamov");
        return "index";
    }
}
