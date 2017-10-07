package com.dfirago.daggertest.navigation;

import android.support.v4.app.Fragment;

/**
 * Created by Dmytro Firago on 14/07/2017.
 */
public interface FragmentOrchestrator {

    void showFragment(int id, Fragment fragment);

    void showFragment(Fragment fragment);
}
