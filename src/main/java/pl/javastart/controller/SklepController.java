package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pl.javastart.data.SklepRepository;
import pl.javastart.model.Sklep;

import java.util.List;

@Controller
public class SklepController {
    private SklepRepository sklepRepository;

    @Autowired
    public SklepController(SklepRepository sklepRepository) {
        this.sklepRepository = sklepRepository;
    }

    @PostMapping("/save")
    public String saveSklep(@ModelAttribute Sklep sklep) {
        sklepRepository.save(sklep);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showAll(Model model) {
        List<Sklep> wszystkieSklepy = sklepRepository.findAll();
        model.addAttribute("wszystkieSklepy", wszystkieSklepy);
        return "showall";
    }
}
