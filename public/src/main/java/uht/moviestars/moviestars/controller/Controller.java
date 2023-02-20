package uht.moviestars.moviestars.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class Controller {
    
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }
    
}

