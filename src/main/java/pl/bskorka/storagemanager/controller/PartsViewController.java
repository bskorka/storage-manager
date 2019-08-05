package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bskorka.storagemanager.api.Part;
import pl.bskorka.storagemanager.api.enums.PartCategory;
import pl.bskorka.storagemanager.api.enums.State;
import pl.bskorka.storagemanager.api.enums.Type;
import pl.bskorka.storagemanager.spec.MakeService;
import pl.bskorka.storagemanager.spec.PartService;

import javax.validation.Valid;

import java.util.Objects;

import static java.util.Objects.nonNull;
import static pl.bskorka.storagemanager.api.enums.PartCategory.PHONE;

@Controller
@RequestMapping("/parts")
public class PartsViewController {

    private PartService service;

    private MakeService makeService;

    @Autowired
    public PartsViewController(PartService service,
                               MakeService makeService) {
        this.service = service;
        this.makeService = makeService;
    }

    @GetMapping("/all")
    public String listAll(Model model) {
        model.addAttribute("parts", service.selectAllParts());

        return "parts/parts";
    }

    @GetMapping("/add-part")
    public String addPart(Part part, Model model) {
        prepareAddPartModel(model, null);

        return "parts/add-part";
    }

    @GetMapping("/edit/{partId}")
    public String editPart(@PathVariable Integer partId, Model model) {
        Part part = service.selectPartById(partId);

        prepareAddPartModel(model, part);

        return "parts/add-part";
    }

    @PostMapping("/")
    public String addPart(@Valid Part part, BindingResult result, Model model) {
        if (result.hasErrors()) {
            prepareAddPartModel(model, part);

            return "parts/add-part";
        }

        service.save(part);
        model.addAttribute("parts", service.selectAllParts());
        return "parts/parts";
    }

    public Model prepareAddPartModel(Model model, Part part) {
        model.addAttribute("stateComboValues", State.getComboTextForEnum());
        model.addAttribute("typeComboValues", Type.getComboTextForEnum());
        model.addAttribute("phoneMakes", makeService.selectMakesByPartCategory(PHONE));

        if (nonNull(part)) {
            model.addAttribute("part", part);
        }

        return model;
    }

}
