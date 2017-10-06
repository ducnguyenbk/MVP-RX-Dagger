package com.example.ducng.mvp_rx_di;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.example.ducng.mvp_rx_di.adapter.MainAdapter;
import com.example.ducng.mvp_rx_di.model.ListResponse;
import com.example.ducng.mvp_rx_di.network.DaggerNetComponent;
import com.example.ducng.mvp_rx_di.network.NetComponent;
import com.example.ducng.mvp_rx_di.network.RetrofitModule;
import com.example.ducng.mvp_rx_di.network.ServiceModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private NetComponent netComponent;

    @Inject
    ServiceModel service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        netComponent = DaggerNetComponent
                .builder()
                .retrofitModule(new RetrofitModule())
                .build();
        netComponent.inject(this);

        initView();

        Maipresenter maipresenter = new Maipresenter(this, service);
        maipresenter.getLisResponse();

    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        progressBar = (ProgressBar) findViewById(R.id.progress);
    }

    @Override
    public void showWaiting() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }


    @Override
    public void getListReponse(ListResponse listResponse) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        Log.d("getListReponse ", " " + listResponse.getData());
        MainAdapter mainAdapter = new MainAdapter(this, listResponse.getData());
        recyclerView.setAdapter(mainAdapter);
    }
}
