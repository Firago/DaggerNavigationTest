package com.dfirago.daggertest.dagger.components;

import android.app.Application;

import com.dfirago.daggertest.DaggerApplication;
import com.dfirago.daggertest.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        ApplicationComponent build();
    }

    void inject(DaggerApplication application);
}