package com.ritesh.countries.di

import com.ritesh.countries.model.CountriesService
import com.ritesh.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}