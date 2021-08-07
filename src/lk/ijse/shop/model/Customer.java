/*
 *  ---------------------------------------------------------------------------------------------
 *  Copyright (c) 2021 - present IJSE. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  --------------------------------------------------------------------------------------------
 */

package lk.ijse.shop.model;
/**
 * @author Dinuka Nimesh <nimeshdwejerathna2020@gmail.com>
 * @since {8/7/2021}
 */

public class Customer {
    private String name;
    private String address;
    private String telephone;
    private String dOb;

    public Customer(String name, String address, String telephone, String dOb) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.dOb = dOb;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getdOb() {
        return dOb;
    }

    public void setdOb(String dOb) {
        this.dOb = dOb;
    }
}
