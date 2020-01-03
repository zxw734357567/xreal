package com.tmd.xreal.pojo;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author zxw
 * @date 2019-12-27 16:47
 */
@Entity
@Table(name="t_emloyee")
public class TEmployee {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    @Column
    private String address;
    @Column
    private Date birthday;
    @Column
    private Double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
