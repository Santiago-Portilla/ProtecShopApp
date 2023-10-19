package com.portosdeveloper.protecshopapp.domain.use_cases.user_work_shop

import com.portosdeveloper.protecshopapp.domain.model.UserWorkShop
import com.portosdeveloper.protecshopapp.domain.repository.UserWorkShopRepository
import javax.inject.Inject

class UpdateSalaryWorkMonth @Inject constructor(private val repository: UserWorkShopRepository) {

    suspend operator fun invoke(userWorkShop: UserWorkShop, newDate: String) = repository.updateSalaryWorkMonth(userWorkShop, newDate)

}