package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bskorka.storagemanager.api.PhoneModel;

public interface PhoneModelDao extends JpaRepository<PhoneModel, Integer> {
}
