package com.project.thymeleafhtmxexperiment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ThymeleafHtmxExperimentApplication

fun main(args: Array<String>) {
    runApplication<ThymeleafHtmxExperimentApplication>(*args)
}
