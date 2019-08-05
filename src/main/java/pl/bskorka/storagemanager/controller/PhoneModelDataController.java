package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bskorka.storagemanager.api.PhoneModel;
import pl.bskorka.storagemanager.spec.PhoneModelService;

import java.util.List;

@RestController
@RequestMapping("/phoneModelsData")
public class PhoneModelDataController {

    private PhoneModelService service;

    @Autowired
    public PhoneModelDataController(PhoneModelService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<PhoneModel> getPhoneModels() {
        return service.selectAllPhoneModels();
    }

    @GetMapping("/make/{makeName}")
    public List<PhoneModel> getPhoneModelsByMake(@PathVariable("makeName") String makeName) {
        return service.selectPhoneModelsByMake(makeName);
    }


}
