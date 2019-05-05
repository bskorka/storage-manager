package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.PhoneModel;

import java.util.List;

public interface PhoneModelService {

    List<PhoneModel> selectAllPhoneModels();

    PhoneModel save(PhoneModel phoneModel);

}
