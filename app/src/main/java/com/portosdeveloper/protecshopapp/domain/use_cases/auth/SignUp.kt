package com.portosdeveloper.protecshopapp.domain.use_cases.auth

import com.portosdeveloper.protecshopapp.domain.model.User
import com.portosdeveloper.protecshopapp.domain.repository.AuthRepository
import javax.inject.Inject

class SignUp @Inject constructor(private val repository: AuthRepository) {
    suspend operator fun invoke(user : User) = repository.signUp(user)
}