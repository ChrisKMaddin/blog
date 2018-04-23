package com.example.blog.controllers;



import com.example.blog.models.User;
import com.example.blog.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UsersRepository usersRepository;
    private PasswordEncoder encoder;

    public UserController(UsersRepository usersRepository, PasswordEncoder passwordEncoder ) {
        this.usersRepository = usersRepository;
        this.encoder = encoder;
    }

    @GetMapping("/users/sign-up")
    public String showSignUpForm(Model viewAndModel) {
        viewAndModel.addAttribute("user", new User());
        return "users/sign-up";
    }

    @PostMapping("/sign-up")
    public String singUpNewUser(@ModelAttribute User user) {
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        usersRepository.save(user);
        return "redirect:/login";
    }
}