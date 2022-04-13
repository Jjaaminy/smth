package ch.bbw.jokebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
public class MainController {

    @Autowired
    private Jokerepo jokerepository;

    @GetMapping("") // http://localhost:8080
    public String home(Model model){

        List<Joke> jokelist = StreamSupport.stream(
                         jokerepository
                        .findAll()
                        .spliterator(), false)
                        .collect(Collectors.toList());

        model.addAttribute("jokes", jokelist);
        return "index";
    }
}
