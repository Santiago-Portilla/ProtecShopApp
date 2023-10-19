package com.portosdeveloper.protecshopapp.domain.use_cases.user

import com.portosdeveloper.protecshopapp.domain.repository.UsersRepository
import javax.inject.Inject

class GetUserById @Inject constructor(private val repository: UsersRepository) {
    operator fun invoke(id : String) = repository.getUserById(id)
}