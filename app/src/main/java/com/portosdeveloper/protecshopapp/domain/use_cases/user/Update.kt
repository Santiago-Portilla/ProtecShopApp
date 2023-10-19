package com.portosdeveloper.protecshopapp.domain.use_cases.user

import com.portosdeveloper.protecshopapp.domain.model.User
import com.portosdeveloper.protecshopapp.domain.repository.UsersRepository
import javax.inject.Inject

class Update @Inject constructor(private val repository: UsersRepository){
    suspend operator fun invoke(user: User) = repository.update(user)
}