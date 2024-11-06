package org.example.project

import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.flow
import org.example.project.apiClient.httpClient

class Homerepository {
    suspend fun getProductApi(){
        val response = httpClient.get("https://fakestoreapi.com/products")
        return response.body()
    }

    fun getProduct()= flow {
        emit(getProductApi())
    }
}