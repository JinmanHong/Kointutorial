package com.example.kointutorial

import com.example.kointutorial.koinguide.MyApi

class MainRepositoryImpl(
    private val api: MyApi
): MainRepository {



    override fun doNetworkCall() {
        api.callApi()
    }
}