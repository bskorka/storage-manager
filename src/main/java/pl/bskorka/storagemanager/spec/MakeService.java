package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.Make;

import java.util.List;

public interface MakeService {

    List<Make> selectAllMakes();

    Make save(Make make);

}
