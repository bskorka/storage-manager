package pl.bskorka.storagemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.Part;
import pl.bskorka.storagemanager.dao.PartDao;
import pl.bskorka.storagemanager.spec.PartService;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    private PartDao dao;

    @Autowired
    public PartServiceImpl(PartDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Part> selectAllParts() {
        return dao.findAll();
    }

    @Override
    public Part insert(Part part) {
        return dao.save(part);
    }

    @Override
    public Part update(Part part) {
        return dao.save(part);
    }

    @Override
    public void delete(Part part) {
        dao.delete(part);
    }


}
