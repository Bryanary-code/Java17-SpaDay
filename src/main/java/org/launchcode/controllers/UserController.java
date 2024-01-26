package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(@ModelAttribute @Valid User user, Errors errors, String verify, Model model) {

        if (errors.hasErrors() || !user.getPassword().equals(verify)) {
        if (!user.getPassword().equals(verify)) {
            model.addAttribute("error", "Password doesn't match."); }
            return "user/add";
        } else {
            return "user/index";
        }
    }


    }
