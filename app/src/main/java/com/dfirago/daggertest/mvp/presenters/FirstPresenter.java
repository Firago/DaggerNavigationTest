package com.dfirago.daggertest.mvp.presenters;

import com.dfirago.daggertest.mvp.views.FirstView;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
public class FirstPresenter {

    private FirstView view;

    @Inject
    public FirstPresenter(FirstView view) {
        this.view = view;
    }

    public void itemClicked() {
        view.showSecondFragment();
    }
}