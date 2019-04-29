package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bskorka.storagemanager.api.Make;

public interface MakeDao extends JpaRepository<Make, Integer> {
}
