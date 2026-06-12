package com.divyansh.wanderpilot.auth

import com.google.firebase.auth.FirebaseAuth

class AuthRepository {

    private val auth = FirebaseAuth.getInstance()

    fun signup(
        email: String,
        password: String,
        onResult: (Boolean, String) -> Unit
    ) {

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {

                if (it.isSuccessful) {
                    onResult(true, "Signup Successful")
                } else {
                    onResult(false, it.exception?.message ?: "Error")
                }
            }
    }

    fun login(
        email: String,
        password: String,
        onResult: (Boolean, String) -> Unit
    ) {

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {

                if (it.isSuccessful) {
                    onResult(true, "Login Successful")
                } else {
                    onResult(false, it.exception?.message ?: "Error")
                }
            }
    }

    fun logout() {
        auth.signOut()
    }
}