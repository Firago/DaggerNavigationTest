package com.dfirago.daggertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dfirago.daggertest.navigation.FragmentOrchestrator;
import com.dfirago.daggertest.navigation.NavigationManager;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector, FragmentOrchestrator {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;
    @Inject
    NavigationManager navigationManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        navigationManager.showFirstFragment();
    }

    @Override
    public void showFragment(int containerViewId, Fragment fragment) {
        if (findViewById(containerViewId) != null) {
            replace(containerViewId, fragment);
        } else {
            showFragment(fragment);
        }
    }

    @Override
    public void showFragment(Fragment fragment) {
        replace(R.id.content_container, fragment);
    }

    private void replace(int containerViewId, Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(containerViewId, fragment)
                .commit();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}
