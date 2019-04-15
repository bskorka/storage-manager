package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.bskorka.storagemanager.api.Part;
import pl.bskorka.storagemanager.service.PartServiceImpl;

import java.util.List;

//@RestController
//@RequestMapping("/parts")
public class PartController {

    private PartServiceImpl service;

    @Autowired
    public PartController(PartServiceImpl service) {
        this.service = service;
    }
//
//    @GetMapping
//    public List<Part> getParts() {
//        return service.selectAllParts();
//    }
//
//    @PostMapping
//    public Part insertPart(@RequestBody Part part) {
//        return service.insert(part);
//    }
//
//    @PutMapping
//    public Part updatePart(@RequestBody Part part) {
//        return service.update(part);
//    }
//
//    @DeleteMapping
//    public void deletePart(@RequestBody Part part) {
//        service.delete(part);
//    }


}
