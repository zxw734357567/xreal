package com.tmd.xreal.entities;

import java.io.Serializable;

/**
 * t_order
 * @author 
 */
public class TOrder implements Serializable {
    private Integer id;

    private Integer tEmployId;

    private String name;

    private Double price;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettEmployId() {
        return tEmployId;
    }

    public void settEmployId(Integer tEmployId) {
        this.tEmployId = tEmployId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TOrder{" +
                "id=" + id +
                ", tEmployId=" + tEmployId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}