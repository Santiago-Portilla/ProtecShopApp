package com.portosdeveloper.protecshopapp.domain.use_cases.user_work_shop

import com.portosdeveloper.protecshopapp.domain.repository.UserWorkShopRepository
import javax.inject.Inject

class GetCutUserWorkShop @Inject constructor(private val repository: UserWorkShopRepository) {
    operator fun invoke()= repository.getCutUserWorShop()
}