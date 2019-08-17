package pl.bskorka.storagemanager.spec;

import pl.bskorka.storagemanager.api.SystemUser;

public interface UserService {

    SystemUser findByLogin(String login);

    SystemUser save(SystemUser systemUser);

}
