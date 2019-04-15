package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bskorka.storagemanager.api.Part;
import pl.bskorka.storagemanager.spec.PartService;

import javax.validation.Valid;

@Controller
@RequestMapping("/parts")
public class PartsViewController {

    private PartService service;

    @Autowired
    public PartsViewController(PartService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("parts", service.selectAllParts());

        return "parts";
    }

    @GetMapping("/add-part")
    public String addPart(Part part) {
        return "add-part";
    }

    @PostMapping("/")
    public String addUser(@Valid Part user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-part";
        }

        service.save(user);
        model.addAttribute("parts", service.selectAllParts());
        return "parts";
    }

}
