package com.project.thymeleafhtmxexperiment.service

import com.project.thymeleafhtmxexperiment.model.User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "externalApi", url = "https://jsonplaceholder.typicode.com")
@Service
interface ExternalApi {
    @GetMapping("/users")
    fun users(): List<User>
}
