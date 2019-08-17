package pl.bskorka.storagemanager.api;

import lombok.Data;
import org.springframework.security.core.userdetails.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

@Data
@Entity
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String login;

    @NotEmpty
    private String password;

    public static User parseFromSystemUser(SystemUser systemUser) {
        return new User(systemUser.getLogin(), systemUser.getPassword(), new ArrayList<>());
    }

}
