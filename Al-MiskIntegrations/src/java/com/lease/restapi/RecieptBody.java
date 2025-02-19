/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lease.restapi;

/**
 *
 * @author Prasenjit
 */
public class RecieptBody {
    
    private String amount;
    private String currencyCode;
    private String glDate;
    private String maturityDate;
    private String orgId;
    private String customerId;
    private String receiptDate;
    private String receiptMethodId;
    private String receiptNumber;
    private String leaseNumber;
    private String bookingNumber;
    private String building;
    private String unit;
    private String environment;
    private String chequeNo;
    private String comments;
//    private String receiptRef;//check before prod move
    private String landlordName;
//    private String remtBnkAcctUseId;

//    public void setRemtBnkAcctUseId(String remtBnkAcctUseId) {
//        this.remtBnkAcctUseId = remtBnkAcctUseId;
//    }
//
//    public String getRemtBnkAcctUseId() {
//        return remtBnkAcctUseId;
//    }
    
    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getGlDate() {
        return glDate;
    }

    public void setGlDate(String glDate) {
        this.glDate = glDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getReceiptMethodId() {
        return receiptMethodId;
    }

    public void setReceiptMethodId(String receiptMethodId) {
        this.receiptMethodId = receiptMethodId;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
//    public String getReceiptRef() {
//        return receiptRef;
//    }
//
//    public void setReceiptRef(String receiptRef) {
//        this.receiptRef = receiptRef;
//    }
    public String getLandlordName() {
        return this.landlordName;
    }
    
    public void setLandlordName(final String landlordName) {
        this.landlordName = landlordName;
    }
    
}
