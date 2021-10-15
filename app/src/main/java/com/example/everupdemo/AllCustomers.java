package com.example.everupdemo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllCustomers {
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("vatNumber")
    @Expose
    public String vatNumber;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("dueDate")
    @Expose
    public String dueDate;
    @SerializedName("user")
    @Expose
    public User user;
    @SerializedName("paymentMethod")
    @Expose
    public String paymentMethod;
    @SerializedName("phoneNumber")
    @Expose
    public String phoneNumber;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("town")
    @Expose
    public String town;
    @SerializedName("periodicity")
    @Expose
    public String periodicity;
    @SerializedName("bankAccount")
    @Expose
    public String[] bankAccount;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("postalCode")
    @Expose
    public String postalCode;
    @SerializedName("province")
    @Expose
    public String province;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String[] getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
