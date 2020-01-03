package com.tmd.xreal.dto;

import com.tmd.xreal.entities.TOrder;

import java.time.LocalDate;
import java.util.List;

/**
 * @author zxw
 * @date 2020-01-03 17:55
 */
public class TEmployContainOrder {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 薪水
     */
    private Double salary;
    private List<TOrder> tOrders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<TOrder> gettOrders() {
        return tOrders;
    }

    public void settOrders(List<TOrder> tOrders) {
        this.tOrders = tOrders;
    }

    @Override
    public String toString() {
        return "TEmployContainOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", tOrders=" + tOrders +
                '}';
    }
}
