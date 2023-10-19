package com.portosdeveloper.protecshopapp.domain.use_cases.auth

import com.portosdeveloper.protecshopapp.domain.repository.AuthRepository
import javax.inject.Inject

class Login @Inject constructor(private val repository: AuthRepository) {

    suspend operator fun invoke(email: String, password : String) = repository.login(email, password)

}