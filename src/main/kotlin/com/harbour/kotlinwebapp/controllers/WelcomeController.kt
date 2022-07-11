package com.harbour.kotlinwebapp.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class WelcomeController {

    val HOST_UUID: UUID = UUID.randomUUID()

    @RequestMapping("/")
    fun welcome(): String {
        return "Hello Harbour"
    }

    @GetMapping("/host_id")
    fun getHostId(): String {
        return HOST_UUID.toString()
    }
}
