package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.Part;

import java.util.List;

public interface PartService {

    List<Part> selectAllParts();

    Part insert(Part part);

    Part update(Part part);

    void delete(Part part);

}
