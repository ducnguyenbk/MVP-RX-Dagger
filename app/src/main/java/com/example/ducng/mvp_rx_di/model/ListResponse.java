package com.example.ducng.mvp_rx_di.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * Created by ducng on 10/6/2017.
 */
@Generated("org.jsonschema2pojo")
public class ListResponse {

    @SerializedName("data")
    @Expose
    private List<DataItemList> data = new ArrayList<>();

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("status")
    @Expose
    private int status;


    /**
     * the data
     *
     * @return
     */

    public List<DataItemList> getData() {
        return data;
    }

    /**
     * the data
     *
     * @param data
     */
    public void setData(List<DataItemList> data) {
        this.data = data;
    }

    /**
     * message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * the message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * the status
     *
     * @return
     */
    public int getStatus() {
        return status;
    }

    /**
     * the status
     *
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
