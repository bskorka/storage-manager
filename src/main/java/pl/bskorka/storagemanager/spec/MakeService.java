package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.enums.PartCategory;

import java.util.List;

public interface MakeService {

    List<Make> selectAllMakes();

    Make save(Make make);

    List<Make> selectMakesByPartCategory(PartCategory partCategory);

    Make selectMakeByName(String makeName);
}
