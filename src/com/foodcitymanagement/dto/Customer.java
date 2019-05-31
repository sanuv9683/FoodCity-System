/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodcitymanagement.dto;

/**
 *
 * @author Sanu Vithanage
 */
public class Customer {

    private String cusId;
    private String name;
    private String address;
    private String tpNo;

    public Customer() {
    }

    public Customer(String cusId, String name, String address, String tpNo) {
        this.cusId = cusId;
        this.name = name;
        this.address = address;
        this.tpNo = tpNo;
    }

    /**
     * @return the cusId
     */
    public String getCusId() {
        return cusId;
    }

    /**
     * @param cusId the cusId to set
     */
    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the tpNo
     */
    public String getTpNo() {
        return tpNo;
    }

    /**
     * @param tpNo the tpNo to set
     */
    public void setTpNo(String tpNo) {
        this.tpNo = tpNo;
    }

}
