package com.portosdeveloper.protecshopapp.domain.use_cases.user

data class UserUseCases (
    val create: Create,
    val getUserById: GetUserById,
    val update: Update,
    val saveImage: SaveImage
    )