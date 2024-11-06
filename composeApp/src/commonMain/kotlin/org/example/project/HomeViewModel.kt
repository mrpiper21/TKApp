package org.example.project

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.example.project.data.product


class HomeViewModel : ViewModel() {
    private val _products = MutableStateFlow<List<product>>(listOf())
    val products = _products.asStateFlow()

    private val homeRepository = Homerepository()

    init {
        viewModelScope.launch {
            homeRepository.getProduct().collect {products ->
                _products.update { it + _products.value }
            }

        }
    }
}