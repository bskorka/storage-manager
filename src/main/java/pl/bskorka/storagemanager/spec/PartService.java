package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.Part;

import java.util.List;

public interface PartService {

    List<Part> selectAllParts();

    Part selectPartById(Integer partId);

    Part save(Part part);

    void deleteById(Integer partId);

}
