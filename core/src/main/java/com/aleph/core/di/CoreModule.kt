package com.aleph.core.di

import android.content.Context
import com.aleph.core.network.NetworkHelper
import com.aleph.core.preference.AndroidPreferenceStore
import com.aleph.core.preference.PreferenceStore
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val coreModule = module {
    single { NetworkHelper(androidContext(), true) }
    single<PreferenceStore> {
        AndroidPreferenceStore(
            androidContext().getSharedPreferences("app_pref", Context.MODE_PRIVATE)
        )
    }
}