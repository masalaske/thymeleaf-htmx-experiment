package com.project.thymeleafhtmxexperiment.controller

import com.project.thymeleafhtmxexperiment.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model

@Controller
class UserController(
    private val userService: UserService
) {

    @GetMapping("/users")
    fun users(model: Model): String {
        val users = userService.users()
        model.addAttribute("users", users)
        return "users"
    }
}
