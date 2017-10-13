package com.dfirago.daggertest.dagger.modules;

import com.dfirago.daggertest.MainActivity;
import com.dfirago.daggertest.dagger.scopes.ActivityScope;
import com.dfirago.daggertest.model.Animal;
import com.dfirago.daggertest.model.AnimalKey;
import com.dfirago.daggertest.model.Cat;
import com.dfirago.daggertest.model.Dog;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.multibindings.IntoMap;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
@Module(includes = {AndroidSupportInjectionModule.class})
public abstract class ApplicationModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity mainActivityInjector();

    @Binds
    @IntoMap
    @AnimalKey(Cat.class)
    abstract Animal provideCat(Cat cat);

    @Binds
    @IntoMap
    @AnimalKey(Dog.class)
    abstract Animal provideDog(Dog dog);
}
