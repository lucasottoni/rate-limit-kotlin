package br.com.sky.ratelimit.service

import br.com.sky.ratelimit.repository.AuthRepository
import org.springframework.stereotype.Service

@Service
class AuthService(
    val authRepository: AuthRepository
) {

    fun resetPassword(oldPassword: String, newPassword: String) {
        authRepository.findByUsername(getCurrentAuthUserInSession())
            ?.takeIf { it.password == oldPassword }
            ?.also { authRepository.saveNewPassword(it, newPassword) }
            ?: throw IllegalAccessException()
    }

    fun getCurrentAuthUserInSession(): String {
        return "fake-admin"
    }
}