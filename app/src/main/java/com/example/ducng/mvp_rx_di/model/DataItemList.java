package com.example.ducng.mvp_rx_di.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by ducng on 10/6/2017.
 */
@Generated("org.jsonschema2pojo")
public class DataItemList {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("background")
    @Expose
    private String background;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * the name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * the name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * the description
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * the description
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * the background
     *
     * @return
     */
    public String getBackground() {
        return background;
    }

    /**
     * the background
     *
     * @param background
     */
    public void setBackground(String background) {
        this.background = background;
    }
}
