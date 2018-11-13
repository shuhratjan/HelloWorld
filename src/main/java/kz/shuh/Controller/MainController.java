package kz.shuh.Controller;

import kz.shuh.Service.MyDb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

/**
 * @author Shuhratjan Nizamov
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String view(Model model){
        MyDb myDb=new MyDb();
        myDb.connection();
        String text="Up's can't connect";
        try {
            text = myDb.getWelcomeText();
        }catch (SQLException e){
            e.printStackTrace();
        }

        model.addAttribute("msg",text);
        return "index";
    }
}
