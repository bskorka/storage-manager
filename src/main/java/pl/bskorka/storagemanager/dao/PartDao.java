package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bskorka.storagemanager.api.Part;

@Repository
public interface PartDao extends JpaRepository<Part, Integer> {

}
