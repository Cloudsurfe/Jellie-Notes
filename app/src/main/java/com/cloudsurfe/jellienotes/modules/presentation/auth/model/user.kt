package com.cloudsurfe.jellienotes.modules.presentation.auth.model



data class user(
    val email: String,
    val authenticated: Boolean = false
)
