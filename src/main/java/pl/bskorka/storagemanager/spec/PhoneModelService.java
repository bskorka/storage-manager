package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.PhoneModel;

import java.util.List;

public interface PhoneModelService {

    List<PhoneModel> selectAllPhoneModels();

    List<PhoneModel> selectPhoneModelsByMake(String makeName);

    PhoneModel save(PhoneModel phoneModel);

}
