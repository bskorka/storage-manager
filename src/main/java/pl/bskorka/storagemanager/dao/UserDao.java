package pl.bskorka.storagemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bskorka.storagemanager.api.SystemUser;

public interface UserDao extends JpaRepository<SystemUser, Integer> {

    SystemUser findUserByLogin(String login);

}
