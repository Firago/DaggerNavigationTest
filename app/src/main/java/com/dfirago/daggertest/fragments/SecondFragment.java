package com.dfirago.daggertest.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dfirago.daggertest.R;
import com.dfirago.daggertest.mvp.presenters.SecondPresenter;
import com.dfirago.daggertest.mvp.views.SecondView;
import com.dfirago.daggertest.navigation.NavigationManager;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
public class SecondFragment extends BaseFragment implements SecondView {

    @Inject
    SecondPresenter secondPresenter;
    @Inject
    NavigationManager navigationManager;

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondPresenter.itemClicked();
            }
        });
    }

    @Override
    public void showFirstFragment() {
        navigationManager.showFirstFragment();
    }
}
