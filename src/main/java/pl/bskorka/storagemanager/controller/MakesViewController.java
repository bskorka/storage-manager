package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.enums.PartCategory;
import pl.bskorka.storagemanager.spec.MakeService;

import javax.validation.Valid;

@Controller
@RequestMapping("/makes")
public class MakesViewController {

    private MakeService service;

    @Autowired
    public MakesViewController(MakeService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("makes", service.selectAllMakes());

        return "makes/makes";
    }

    @GetMapping("/add-make")
    public String addMake(Make make, Model model) {
        model.addAttribute("partCategoryComboValues", PartCategory.getComboTextForEnum());

        return "makes/add-make";
    }

    @PostMapping("/")
    public String addMake(@Valid Make make, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "makes/add-make";
        }

        service.save(make);
        model.addAttribute("makes", service.selectAllMakes());
        return "makes/makes";
    }

}
