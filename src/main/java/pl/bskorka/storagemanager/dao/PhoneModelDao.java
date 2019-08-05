package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.PhoneModel;

import java.util.List;

public interface PhoneModelDao extends JpaRepository<PhoneModel, Integer> {

    List<PhoneModel> findAllByMake(Make make);
}
