package com.aleph.domain.di

import com.aleph.data.di.dataModule
import org.koin.dsl.module

val domainModule = module {
    includes(dataModule)
}