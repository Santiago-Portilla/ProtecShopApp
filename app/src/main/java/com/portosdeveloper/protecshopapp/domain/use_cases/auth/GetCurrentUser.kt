package com.portosdeveloper.protecshopapp.domain.use_cases.auth

import com.portosdeveloper.protecshopapp.domain.repository.AuthRepository
import javax.inject.Inject

class GetCurrentUser @Inject constructor(private val repository: AuthRepository) {

    operator fun invoke() = repository.currentUser

}