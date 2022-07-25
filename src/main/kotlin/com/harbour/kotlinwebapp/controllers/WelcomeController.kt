package com.harbour.kotlinwebapp.controllers

import com.harbour.kotlinwebapp.repositories.HostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class WelcomeController {

    @Autowired
    lateinit var repository: HostRepository;

    val HOST_UUID: UUID = UUID.randomUUID()

    @RequestMapping("/")
    fun welcome(): String {
        return "Hello Harbour"
    }

    @GetMapping("/host_id")
    fun getHostId(): String {
        return HOST_UUID.toString()
    }

    @GetMapping("/hosts")
    fun getHosts(): String {
        return repository.findAll().joinToString { h -> h.host }
    }
}
