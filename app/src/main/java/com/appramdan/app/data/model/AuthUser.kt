package com.appramdan.app.data.model

import java.net.PasswordAuthentication

data class AuthUser(
    val id: Int = 0,
    val email: String = "",
    val password: String = "",
    val fullName: String = ""
)
