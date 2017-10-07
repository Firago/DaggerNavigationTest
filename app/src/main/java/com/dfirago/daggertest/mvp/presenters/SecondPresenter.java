package com.dfirago.daggertest.mvp.presenters;

import com.dfirago.daggertest.mvp.views.SecondView;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
public class SecondPresenter {

    private SecondView view;

    @Inject
    public SecondPresenter(SecondView view) {
        this.view = view;
    }

    public void itemClicked() {
        view.showFirstFragment();
    }
}