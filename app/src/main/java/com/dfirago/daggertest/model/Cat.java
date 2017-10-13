package com.dfirago.daggertest.model;

import com.dfirago.daggertest.navigation.NavigationManager;

import javax.inject.Inject;

/**
 * Created by Dmytro Firago (firago94@gmail.com) on 10/10/2017.
 */
public class Cat extends Animal {

    @Inject
    NavigationManager navigationManager;

    @Inject
    public Cat() {
    }

    @Override
    public void doSomething() {
        System.out.println("Meow");
    }
}
