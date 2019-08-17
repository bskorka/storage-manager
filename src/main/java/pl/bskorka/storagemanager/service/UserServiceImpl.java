package pl.bskorka.storagemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.SystemUser;
import pl.bskorka.storagemanager.dao.UserDao;
import pl.bskorka.storagemanager.spec.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserDao dao;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserDao dao,
                           PasswordEncoder passwordEncoder) {
        this.dao = dao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public SystemUser findByLogin(String login) {
        return dao.findUserByLogin(login);
    }

    @Override
    public SystemUser save(SystemUser systemUser) {
        systemUser.setPassword(passwordEncoder.encode(systemUser.getPassword()));

        return dao.save(systemUser);
    }

}
