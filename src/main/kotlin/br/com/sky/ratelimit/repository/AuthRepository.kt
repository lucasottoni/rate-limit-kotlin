package br.com.sky.ratelimit.repository

import br.com.sky.ratelimit.domain.User
import org.springframework.stereotype.Repository
import java.util.HashMap



@Repository
class AuthRepository {
    private val fakeUserDB = HashMap<String, String>()

    init {
        //fake repository
        fakeUserDB["fake-admin"] = "admin123"
        fakeUserDB["foo"] = "bar"
    }

    fun findByUsername(username: String): User? {
        return fakeUserDB[username]?.let {
            User(username, it)
        }
    }

    fun saveNewPassword(user: User, newPassword: String) {
        fakeUserDB[user.username] = newPassword
    }
}