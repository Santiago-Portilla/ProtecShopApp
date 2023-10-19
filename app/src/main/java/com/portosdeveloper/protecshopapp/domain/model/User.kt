package com.portosdeveloper.protecshopapp.domain.model

data class User(
    var id: String = "",
    var image : String = "",
    var name: String = "",
    var surName: String = "",
    var email: String = "",
    var birthday: String = "",
    var identificationType: String = "",
    var identificationNumber: String = "",
    var password: String = ""
)
