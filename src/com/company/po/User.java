package com.company.po;

import java.util.Date;

/**
 * Created by txwhd on 2018/6/24.
 */
public class User {
    private int id;
    private String name;
    private String address;
    private Date birsday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getBirsday() {
        return birsday;
    }

    public void setBirsday(Date birsday) {
        this.birsday = birsday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birsday=" + birsday +
                '}';
    }
}
