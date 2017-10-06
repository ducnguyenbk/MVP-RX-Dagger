package com.example.ducng.mvp_rx_di.network;

import com.example.ducng.mvp_rx_di.model.ListResponse;


import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ducng on 10/6/2017.
 */

public interface NetworkService {
    @GET("v1/city")
    Observable<ListResponse> getListResponse();
}
