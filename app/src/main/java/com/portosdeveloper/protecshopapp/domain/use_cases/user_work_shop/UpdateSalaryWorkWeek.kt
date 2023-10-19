package com.portosdeveloper.protecshopapp.domain.use_cases.user_work_shop

import com.portosdeveloper.protecshopapp.domain.model.UserWorkShop
import com.portosdeveloper.protecshopapp.domain.repository.UserWorkShopRepository
import javax.inject.Inject

class UpdateSalaryWorkWeek @Inject constructor( private val repository: UserWorkShopRepository) {

    suspend operator fun invoke(userWorkShop: UserWorkShop) = repository.updateSalaryWorkWeek(userWorkShop)

}