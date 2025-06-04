package com.cloudsurfe.jellienotes.modules.presentation.auth.model

interface auth {
    fun createAccount(email:String,password:String)
    fun loginAccount(email:String,password:String)
}