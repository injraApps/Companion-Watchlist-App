package com.injirastd.companionwatchlist.di



import com.injirastd.companionwatchlist.data.local.AppDatabase
import com.injirastd.companionwatchlist.repository.WatchListRepository
import com.injirastd.companionwatchlist.viewmodel.WatchListViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


val appModule = module {

single { AppDatabase.getDatabase(get()).watchListDao() }
 single { WatchListRepository(get()) }
viewModel { WatchListViewModel(get()) }

}