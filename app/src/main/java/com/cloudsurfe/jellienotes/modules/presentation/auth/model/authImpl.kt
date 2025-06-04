package com.cloudsurfe.jellienotes.modules.presentation.auth.model


class authImpl: auth {
    override fun createAccount(email: String, password: String) {
        Firebase.auth
    }

    override fun loginAccount(email: String, password: String) {
        TODO("Not yet implemented")
    }
}