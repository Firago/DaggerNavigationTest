package com.dfirago.daggertest.dagger.modules;

import com.dfirago.daggertest.fragments.SecondFragment;
import com.dfirago.daggertest.mvp.views.SecondView;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
@Module
public interface SecondFragmentModule {

    @Binds
    SecondView secondView(SecondFragment firstFragment);
}
