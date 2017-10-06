package com.example.ducng.mvp_rx_di.network;

import com.example.ducng.mvp_rx_di.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by ducng on 10/6/2017.
 */


@Singleton
@Component(modules = {RetrofitModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}

