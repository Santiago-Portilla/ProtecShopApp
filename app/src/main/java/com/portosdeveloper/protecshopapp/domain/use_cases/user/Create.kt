package com.portosdeveloper.protecshopapp.domain.use_cases.user

import com.portosdeveloper.protecshopapp.domain.model.User
import com.portosdeveloper.protecshopapp.domain.repository.UsersRepository
import javax.inject.Inject

class Create @Inject constructor(private val repository: UsersRepository) {

    suspend operator fun invoke(user : User) = repository.create(user)

}