package com.square.employeeconnect

import dagger.Module
import dagger.Provides

@Module
class BaseActivityModule {
    @Provides
    fun provideMainActivityPresenter(): BaseActivityContract.Presenter {
        return BaseActivityPresenter()
    }
}