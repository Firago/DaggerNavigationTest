package com.dfirago.daggertest.dagger.modules;

import com.dfirago.daggertest.fragments.FirstFragment;
import com.dfirago.daggertest.mvp.views.FirstView;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
@Module
public interface FirstFragmentModule {

    @Binds
    FirstView firstView(FirstFragment firstFragment);
}
