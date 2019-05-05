package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bskorka.storagemanager.api.Make;
import pl.bskorka.storagemanager.api.enums.PartCategory;

import java.util.List;

public interface MakeDao extends JpaRepository<Make, Integer> {

    List<Make> findAllByPartCategoryEquals(PartCategory partCategory);

}
