package com.dfirago.daggertest.dagger.modules;

import com.dfirago.daggertest.MainActivity;
import com.dfirago.daggertest.dagger.scopes.ActivityScope;
import com.dfirago.daggertest.dagger.scopes.FragmentScope;
import com.dfirago.daggertest.fragments.FirstFragment;
import com.dfirago.daggertest.fragments.SecondFragment;
import com.dfirago.daggertest.navigation.FragmentOrchestrator;
import com.dfirago.daggertest.navigation.NavigationManager;
import com.dfirago.daggertest.navigation.impl.NavigationManagerImpl;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
@Module
public interface MainActivityModule {

    @ActivityScope
    @Binds
    NavigationManager navigationManager(NavigationManagerImpl navigationManager);

    @ActivityScope
    @Binds
    FragmentOrchestrator fragmentOrchestrator(MainActivity mainActivity);

    @FragmentScope
    @ContributesAndroidInjector(modules = {FirstFragmentModule.class})
    FirstFragment firstFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = {SecondFragmentModule.class})
    SecondFragment secondFragment();
}
