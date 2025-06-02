package com.cloudsurfe.jellienotes.modules.presentation.auth.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cloudsurfe.jellienotes.modules.Login
import com.cloudsurfe.jellienotes.modules.Register
import com.cloudsurfe.jellienotes.ui.theme.JellyNotesTheme

@Composable
fun login(
    navController: NavController
){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Text("Login")
        Spacer(modifier = Modifier.padding(15.dp))
        OutlinedTextField(email, onValueChange = {
            value->
            email = value
        },placeholder = {
            Text("Email")
        })
        Spacer(modifier = Modifier.padding(15.dp))
        OutlinedTextField(placeholder = {
            Text("Password")
        }, value = password, onValueChange = {
                value->
            password = value
        })
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "REGISTER", modifier = Modifier.clickable { navController.navigate(Register) },)
        Button(
            onClick ={

            }
        ) {
            Text("Login")
        }
    }
}

@Composable
fun register(navController: NavController){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Register")
        Spacer(modifier = Modifier.padding(15.dp))
        OutlinedTextField(email, onValueChange = {
                value->
            email = value
        },placeholder = {
            Text("Email")
        })
        Spacer(modifier = Modifier.padding(15.dp))
        OutlinedTextField(placeholder = {
            Text("Password")
        }, value = password, onValueChange = {
                value->
            password = value
        })
        Spacer(modifier = Modifier.padding(10.dp))
        Text(text = "Login", modifier = Modifier.clickable { navController.navigate(Login) },)
        Button(
            onClick ={
            }
        ) {
            Text("Login")
        }
    }
}

@Composable
@Preview
fun authPreview(){
    JellyNotesTheme(
        darkMode = false
    ) {

    }
}