package br.com.sky.ratelimit.controller.dto

data class PasswordRequest(
    val oldPassword: String,
    val newPassword: String
)