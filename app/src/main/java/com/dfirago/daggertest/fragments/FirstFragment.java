package com.dfirago.daggertest.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dfirago.daggertest.R;
import com.dfirago.daggertest.mvp.presenters.FirstPresenter;
import com.dfirago.daggertest.mvp.views.FirstView;
import com.dfirago.daggertest.navigation.NavigationManager;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/7/2017.
 */
public class FirstFragment extends BaseFragment implements FirstView {

    @Inject
    FirstPresenter firstPresenter;
    @Inject
    NavigationManager navigationManager;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstPresenter.itemClicked();
            }
        });
    }

    @Override
    public void showSecondFragment() {
        navigationManager.showSecondFragment();
    }
}
