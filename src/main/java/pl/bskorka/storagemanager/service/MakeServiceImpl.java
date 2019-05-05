package pl.bskorka.storagemanager.service;

import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.enums.PartCategory;
import pl.bskorka.storagemanager.dao.MakeDao;
import pl.bskorka.storagemanager.spec.MakeService;

import java.util.List;

@Service
public class MakeServiceImpl implements MakeService {

    private MakeDao dao;

    public MakeServiceImpl(MakeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Make> selectAllMakes() {
        return dao.findAll();
    }

    @Override
    public Make save(Make make) {
        return dao.save(make);
    }

    @Override
    public List<Make> selectMakesByPartCategory(PartCategory partCategory) {
        return dao.findAllByPartCategoryEquals(partCategory);
    }

}
