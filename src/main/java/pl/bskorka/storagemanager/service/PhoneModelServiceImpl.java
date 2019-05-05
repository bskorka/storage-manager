package pl.bskorka.storagemanager.service;

import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.PhoneModel;
import pl.bskorka.storagemanager.dao.PhoneModelDao;
import pl.bskorka.storagemanager.spec.PhoneModelService;

import java.util.List;

@Service
public class PhoneModelServiceImpl implements PhoneModelService {

    private PhoneModelDao dao;

    public PhoneModelServiceImpl(PhoneModelDao dao) {
        this.dao = dao;
    }

    @Override
    public List<PhoneModel> selectAllPhoneModels() {
        return dao.findAll();
    }

    @Override
    public PhoneModel save(PhoneModel phoneModel) {
        return dao.save(phoneModel);
    }
}
