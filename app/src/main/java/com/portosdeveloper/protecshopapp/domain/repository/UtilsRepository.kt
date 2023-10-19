package com.portosdeveloper.protecshopapp.domain.repository

import kotlinx.coroutines.flow.Flow

interface UtilsRepository {
    fun getArray( util: String, nameArray: String ): Flow<List<String>>
}