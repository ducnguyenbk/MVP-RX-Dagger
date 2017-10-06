package com.example.ducng.mvp_rx_di;

import android.util.Log;

import com.example.ducng.mvp_rx_di.model.ListResponse;
import com.example.ducng.mvp_rx_di.network.ServiceModel;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by ducng on 10/6/2017.
 */


public class Maipresenter {
    private MainView mMainView;
    private ServiceModel mServiceModle;
    private CompositeSubscription compositeSubscription;

    public Maipresenter(MainView mainView, ServiceModel serviceModle) {
        mMainView = mainView;
        mServiceModle = serviceModle;
        compositeSubscription = new CompositeSubscription();
    }

    public void getLisResponse() {
        Log.d("getListReponse ", "11111111 ");
        mMainView.showWaiting();
        Subscription subscription = mServiceModle.getListResponse(new ServiceModel.getDataResponse() {
            @Override
            public void onSuccess(ListResponse listResponse) {
                mMainView.removeWait();
                Log.d("getListReponse ", "11111111 ");
                mMainView.getListReponse(listResponse);
            }
        });

        compositeSubscription.add(subscription);
    }


}
