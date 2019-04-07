package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pl.javastart.data.SklepRepository;
import pl.javastart.model.Sklep;

import java.util.List;

@Controller
@RequestMapping("/sklep")
public class SklepDetailsController {
    private SklepRepository sklepRepository;

    @Autowired
    public SklepDetailsController(SklepRepository sklepRepository) {
        this.sklepRepository = sklepRepository;
    }

    @RequestMapping(value="{id}")
    public String saveSklep(Model model, @PathVariable Long id) {
        Sklep test = sklepRepository.getOne(id);
        model.addAttribute(test);
        return "szczegoly";
    }

}
