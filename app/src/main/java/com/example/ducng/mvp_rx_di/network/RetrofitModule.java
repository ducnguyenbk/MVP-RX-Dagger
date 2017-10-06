package com.example.ducng.mvp_rx_di.network;

import com.example.ducng.mvp_rx_di.ultis.Keys;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by ducng on 10/6/2017.
 */

@Module
public class RetrofitModule {
    public RetrofitModule(){

    }

    @Provides
    @Singleton
    Retrofit providesCall() {
        return new Retrofit.Builder()
                .baseUrl(Keys.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    NetworkService providesNetworkService(Retrofit retrofit) {
        return retrofit.create(NetworkService.class);
    }

    @Provides
    @Singleton
    ServiceModel providesService(NetworkService networkService) {
        return new ServiceModel(networkService);
    }
}
