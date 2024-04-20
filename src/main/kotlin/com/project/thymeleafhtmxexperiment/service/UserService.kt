package com.project.thymeleafhtmxexperiment.service

import com.project.thymeleafhtmxexperiment.model.User
import org.springframework.stereotype.Service

@Service
class UserService(
    private val externalApi: ExternalApi
) {
    fun users(): List<User> {
        return externalApi.users();
    }
}
