package com.example.ducng.mvp_rx_di.network;

import android.util.Log;

import com.example.ducng.mvp_rx_di.model.ListResponse;

import dagger.Module;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ducng on 10/6/2017.
 */


public class ServiceModel {
    private NetworkService mNetworkService;

    public ServiceModel(NetworkService networkService) {
        mNetworkService = networkService;
    }

    public Subscription getListResponse(final getDataResponse getDataResponse) {
        return mNetworkService.getListResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ListResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(ListResponse listResponse) {
                        Log.d("onNext", "111111");
                        getDataResponse.onSuccess(listResponse);
                    }
                });
    }

    public interface getDataResponse {
        void onSuccess(ListResponse listResponse);
    }

}
