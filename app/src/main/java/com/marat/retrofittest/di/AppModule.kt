package com.marat.retrofittest.di

import com.marat.retrofittest.ui.fragments.listfragment.CharactersListViewModel
import com.marat.retrofittest.ui.fragments.searchfragment.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        CharactersListViewModel( get())
    }
    viewModel {
        SearchViewModel( get())
    }
}