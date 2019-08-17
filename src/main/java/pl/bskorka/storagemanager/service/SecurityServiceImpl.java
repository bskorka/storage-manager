package pl.bskorka.storagemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.bskorka.storagemanager.api.SystemUser;
import pl.bskorka.storagemanager.spec.SecurityService;
import pl.bskorka.storagemanager.spec.UserService;

import static java.util.Objects.isNull;
import static pl.bskorka.storagemanager.api.SystemUser.parseFromSystemUser;

@Service
public class SecurityServiceImpl implements SecurityService {

    private UserService userService;

    @Autowired
    public SecurityServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        SystemUser systemUser = userService.findByLogin(login);

        if (isNull(systemUser))
            throw new UsernameNotFoundException("User with provided login doesn't exists!");

        return parseFromSystemUser(systemUser);
    }

}
