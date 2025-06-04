package com.cloudsurfe.jellienotes.modules.presentation.auth.model

interface auth {
    fun createAccount(email:String,password:String,onResult:(Throwable?)->Unit)
    fun loginAccount(email:String,password:String,onResult:(Throwable?)->Unit)
}