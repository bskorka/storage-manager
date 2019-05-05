package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bskorka.storagemanager.api.PhoneModel;
import pl.bskorka.storagemanager.spec.MakeService;
import pl.bskorka.storagemanager.spec.PhoneModelService;

import javax.validation.Valid;
import java.util.List;

import static pl.bskorka.storagemanager.api.enums.PartCategory.PHONE;

@Controller
@RequestMapping("/phoneModels")
public class PhoneModelsViewController {

    private PhoneModelService service;

    private MakeService makeService;

    @Autowired
    public PhoneModelsViewController(PhoneModelService service,
                                     MakeService makeService) {
        this.service = service;
        this.makeService = makeService;
    }

    @GetMapping("/all")
    public String listAll(Model model) {
        return getAllPhoneModelsView(model);
    }

    @GetMapping("/add-phoneModel")
    public String addPhoneModel(PhoneModel phoneModel, Model model) {
        model.addAttribute("phoneMakes", makeService.selectMakesByPartCategory(PHONE));

        return "phoneModels/add-phoneModel";
    }

    @PostMapping("/")
    public String addPhoneModel(@Valid PhoneModel phoneModel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
                System.out.println(error.getObjectName() + " - " + error.getDefaultMessage());
            }

            return "phoneModels/add-phoneModel";
        }

        service.save(phoneModel);

        return getAllPhoneModelsView(model);
    }

    private String getAllPhoneModelsView(Model model) {
        model.addAttribute("phoneModels", service.selectAllPhoneModels());

        return "phoneModels/phoneModels";
    }

}
