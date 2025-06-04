package com.cloudsurfe.jellienotes.modules.presentation.auth.model

import com.google.firebase.Firebase
import com.google.firebase.auth.auth


class authImpl: auth {
    override fun createAccount(email: String, password: String,onResult:(Throwable?)->Unit) {
        Firebase.auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
            onResult(it.exception)
        }
    }

    override fun loginAccount(email: String, password: String,onResult:(Throwable?)->Unit) {
        Firebase.auth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
            onResult(it.exception)
        }
    }
}