package com.avenue.core.presentation.state


sealed class PrimaryViewState {
    object Loading: PrimaryViewState()
    object Data: PrimaryViewState()
    object Success: PrimaryViewState()
    data class Error(val error: String): PrimaryViewState()
}
