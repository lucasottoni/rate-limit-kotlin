package br.com.sky.ratelimit.controller

import br.com.sky.ratelimit.controller.dto.PasswordRequest
import br.com.sky.ratelimit.service.AuthService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(private val authService: AuthService) {

    @PostMapping("/reset-password")
    @Throws(IllegalAccessException::class)
    fun resetPassword(@RequestBody passwordRequest: PasswordRequest) {
        authService.resetPassword(passwordRequest.oldPassword, passwordRequest.newPassword)
    }
}