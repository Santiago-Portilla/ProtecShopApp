package com.portosdeveloper.protecshopapp.domain.use_cases.utils

import com.portosdeveloper.protecshopapp.domain.repository.UtilsRepository
import javax.inject.Inject

class GetList @Inject constructor(private val repository: UtilsRepository) {
    operator fun invoke(util: String, nameArray: String) = repository.getArray(util,nameArray)
}