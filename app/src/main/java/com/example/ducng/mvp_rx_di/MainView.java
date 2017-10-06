package com.example.ducng.mvp_rx_di;

import com.example.ducng.mvp_rx_di.model.ListResponse;

/**
 * Created by ducng on 10/6/2017.
 */

public interface MainView {
    void showWaiting();

    void removeWait();

    void getListReponse(ListResponse listResponse);
}
