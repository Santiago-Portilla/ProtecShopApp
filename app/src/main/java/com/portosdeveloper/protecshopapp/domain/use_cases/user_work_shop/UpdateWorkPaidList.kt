package com.portosdeveloper.protecshopapp.domain.use_cases.user_work_shop

import com.portosdeveloper.protecshopapp.domain.model.UserWorkShop
import com.portosdeveloper.protecshopapp.domain.repository.UserWorkShopRepository
import javax.inject.Inject

class UpdateWorkPaidList @Inject constructor(private val repository: UserWorkShopRepository) {
    suspend operator fun invoke(userWorkShop: UserWorkShop, newItem: String) = repository.updateWorkPaidList(userWorkShop, newItem)
}