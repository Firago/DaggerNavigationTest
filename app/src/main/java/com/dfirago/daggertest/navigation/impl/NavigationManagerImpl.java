package com.dfirago.daggertest.navigation.impl;

import com.dfirago.daggertest.R;
import com.dfirago.daggertest.fragments.FirstFragment;
import com.dfirago.daggertest.fragments.SecondFragment;
import com.dfirago.daggertest.navigation.FragmentOrchestrator;
import com.dfirago.daggertest.navigation.NavigationManager;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
public class NavigationManagerImpl implements NavigationManager {

    private FragmentOrchestrator fragmentOrchestrator;

    @Inject
    public NavigationManagerImpl(FragmentOrchestrator fragmentOrchestrator) {
        this.fragmentOrchestrator = fragmentOrchestrator;
    }

    @Override
    public void showFirstFragment() {
        FirstFragment firstFragment = FirstFragment.newInstance();
        fragmentOrchestrator.showFragment(R.id.content_container, firstFragment);
    }

    @Override
    public void showSecondFragment() {
        SecondFragment secondFragment = SecondFragment.newInstance();
        fragmentOrchestrator.showFragment(R.id.second_fragment_container, secondFragment);
    }
}