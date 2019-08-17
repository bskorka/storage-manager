package pl.bskorka.storagemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bskorka.storagemanager.api.SystemUser;
import pl.bskorka.storagemanager.spec.UserService;

import javax.validation.Valid;

import static java.util.Objects.nonNull;

@Controller
@RequestMapping("/")
public class SystemController {

    private UserService userService;

    @Autowired
    public SystemController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/register")
    public String getRegisterForm(SystemUser systemUser, Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid SystemUser systemUser, BindingResult result, Model model) {
        SystemUser existingUser = userService.findByLogin(systemUser.getLogin());
        if (nonNull(existingUser))
            result.rejectValue("login", null, "There is already an account registered with that login");

        if (result.hasErrors())
            return "register";

        userService.save(systemUser);
        return "redirect:/?registerSuccess";
    }

}
