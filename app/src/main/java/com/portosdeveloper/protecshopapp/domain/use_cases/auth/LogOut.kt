package com.portosdeveloper.protecshopapp.domain.use_cases.auth

import com.portosdeveloper.protecshopapp.domain.repository.AuthRepository
import javax.inject.Inject

class LogOut @Inject constructor(private val repository: AuthRepository) {

    operator fun invoke() = repository.logOut()
}