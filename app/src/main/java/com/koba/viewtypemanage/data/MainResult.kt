package com.koba.viewtypemanage.data

sealed class MainResult{
    data class Success(val data: Item): MainResult()
    data class Error(val exception: Throwable) : MainResult()
    object InProgress: MainResult()
}

//interface MainResult{
//    data class Success(val data: Item): MainResult
//    data class Error(val exception: Throwable) : MainResult
//    object InProgress: MainResult
//}
