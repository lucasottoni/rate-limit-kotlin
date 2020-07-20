package br.com.sky.ratelimit.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class OpenSeaController {
    @GetMapping
    fun helloWorld(): String {
        return "Helo World"
    }
}