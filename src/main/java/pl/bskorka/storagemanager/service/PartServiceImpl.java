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
    public Part selectPartById(Integer partId) {
        return dao.findById(partId).orElse(null);
    }

    @Override
    public Part save(Part part) {
        return dao.save(part);
    }

    @Override
    public void deleteById(Integer partId) {
        dao.deleteById(partId);
    }


}
