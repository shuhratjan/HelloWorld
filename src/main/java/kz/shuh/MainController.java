package kz.shuh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Shuhratjan Nizamov
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String view(){
        return "index";
    }
}
