package pl.bskorka.storagemanager.service;

import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.PhoneModel;
import pl.bskorka.storagemanager.dao.PhoneModelDao;
import pl.bskorka.storagemanager.spec.MakeService;
import pl.bskorka.storagemanager.spec.PhoneModelService;

import java.util.List;

@Service
public class PhoneModelServiceImpl implements PhoneModelService {

    private PhoneModelDao dao;

    private MakeService makeService;

    public PhoneModelServiceImpl(PhoneModelDao dao, MakeService makeService) {
        this.dao = dao;
        this.makeService = makeService;
    }

    @Override
    public List<PhoneModel> selectAllPhoneModels() {
        return dao.findAll();
    }

    @Override
    public List<PhoneModel> selectPhoneModelsByMake(String makeName) {
        Make make = makeService.selectMakeByName(makeName);

        return dao.findAllByMake(make);
    }

    @Override
    public PhoneModel save(PhoneModel phoneModel) {
        return dao.save(phoneModel);
    }
}
