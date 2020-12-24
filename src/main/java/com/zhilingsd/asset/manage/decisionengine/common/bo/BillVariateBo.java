/*
 * Software License Declaration.
 *
 * zhilingsd.com, Co,. Ltd.
 * Copyright © 2016 All Rights Reserved.
 *
 * Copyright Notice
 * This documents is provided to zhilingsd contracting agent or authorized programmer only.
 * This source code is written and edited by zhilingsd Co,.Ltd Inc specially for financial
 * business contracting agent or authorized cooperative company, in order to help them to
 * install, programme or central control in certain project by themselves independently.
 *
 * Disclaimer
 * If this source code is needed by the one neither contracting agent nor authorized programmer
 * during the use of the code, should contact to zhilingsd Co,. Ltd Inc, and get the confirmation
 * and agreement of three departments managers  - Research Department, Marketing Department and
 * Production Department.Otherwise zhilingsd will charge the fee according to the programme itself.
 *
 * Any one,including contracting agent and authorized programmer,cannot share this code to
 * the third party without the agreement of zhilingsd. If Any problem cannot be solved in the
 * procedure of programming should be feedback to zhilingsd Co,. Ltd Inc in time, Thank you!
 */
package com.zhilingsd.asset.manage.decisionengine.common.bo;

import java.math.BigDecimal;


/**
 * @author zhaotianhao
 * @version 1.0
 * @className BillVariateBo.java
 * @date 2020/12/2 13:55
 */
public class BillVariateBo {

    private Long billId;

    private String queueNumber;

    private Long id;
    private String productPrice;
    private String highProductType;
    
    private String billSource;
    
    private Integer lostContactTimes;
    
    private BigDecimal minimumPayment;
    
    private String outHandType;
    
    private Integer billDay;
    
    private Integer repayDay;
    
    private String historyLeastCallResult;
    
    private String historyBestCollectionResult;
    
    private String collectionStatus;
    
    private String outStatus;
    
    private String outType;
    
    private String leastCallResult;
    
    private String bestCollectionResult;
    
    private String currPromiseRepay;
    
    private String isPromiseRepayDay;
    
    private String inCollectionReason;
    
    private String repayCustomer;

    
    private String customerNo;
    
    private String historyHighOverdueStage;
    
    private String customType;
    
    private String isFirstOverdue;
    
    private String overdueStage;
    
    private BigDecimal generalCreditUseRate;
    
    private BigDecimal generalCredit;
    
    private BigDecimal totalDebt;
    
    private BigDecimal overdueMoney;
    
    private String registeredProvince;
    
    private String registeredCity;
    
    private String liveProvince;
    
    private String liveCity;
    
    private Integer historyHighOverdueDays;
    
    private Integer overdueDays;
    
    private String collectionRiskLevel;
    
    private String telephoneProvider;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(String queueNumber) {
        this.queueNumber = queueNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getHighProductType() {
        return highProductType;
    }

    public void setHighProductType(String highProductType) {
        this.highProductType = highProductType;
    }

    public String getBillSource() {
        return billSource;
    }

    public void setBillSource(String billSource) {
        this.billSource = billSource;
    }

    public Integer getLostContactTimes() {
        return lostContactTimes;
    }

    public void setLostContactTimes(Integer lostContactTimes) {
        this.lostContactTimes = lostContactTimes;
    }

    public BigDecimal getMinimumPayment() {
        return minimumPayment;
    }

    public void setMinimumPayment(BigDecimal minimumPayment) {
        this.minimumPayment = minimumPayment;
    }

    public String getOutHandType() {
        return outHandType;
    }

    public void setOutHandType(String outHandType) {
        this.outHandType = outHandType;
    }

    public Integer getBillDay() {
        return billDay;
    }

    public void setBillDay(Integer billDay) {
        this.billDay = billDay;
    }

    public Integer getRepayDay() {
        return repayDay;
    }

    public void setRepayDay(Integer repayDay) {
        this.repayDay = repayDay;
    }

    public String getHistoryLeastCallResult() {
        return historyLeastCallResult;
    }

    public void setHistoryLeastCallResult(String historyLeastCallResult) {
        this.historyLeastCallResult = historyLeastCallResult;
    }

    public String getHistoryBestCollectionResult() {
        return historyBestCollectionResult;
    }

    public void setHistoryBestCollectionResult(String historyBestCollectionResult) {
        this.historyBestCollectionResult = historyBestCollectionResult;
    }

    public String getCollectionStatus() {
        return collectionStatus;
    }

    public void setCollectionStatus(String collectionStatus) {
        this.collectionStatus = collectionStatus;
    }

    public String getOutStatus() {
        return outStatus;
    }

    public void setOutStatus(String outStatus) {
        this.outStatus = outStatus;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    public String getLeastCallResult() {
        return leastCallResult;
    }

    public void setLeastCallResult(String leastCallResult) {
        this.leastCallResult = leastCallResult;
    }

    public String getBestCollectionResult() {
        return bestCollectionResult;
    }

    public void setBestCollectionResult(String bestCollectionResult) {
        this.bestCollectionResult = bestCollectionResult;
    }

    public String getCurrPromiseRepay() {
        return currPromiseRepay;
    }

    public void setCurrPromiseRepay(String currPromiseRepay) {
        this.currPromiseRepay = currPromiseRepay;
    }

    public String getIsPromiseRepayDay() {
        return isPromiseRepayDay;
    }

    public void setIsPromiseRepayDay(String isPromiseRepayDay) {
        this.isPromiseRepayDay = isPromiseRepayDay;
    }

    public String getInCollectionReason() {
        return inCollectionReason;
    }

    public void setInCollectionReason(String inCollectionReason) {
        this.inCollectionReason = inCollectionReason;
    }

    public String getRepayCustomer() {
        return repayCustomer;
    }

    public void setRepayCustomer(String repayCustomer) {
        this.repayCustomer = repayCustomer;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getHistoryHighOverdueStage() {
        return historyHighOverdueStage;
    }

    public void setHistoryHighOverdueStage(String historyHighOverdueStage) {
        this.historyHighOverdueStage = historyHighOverdueStage;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    public String getIsFirstOverdue() {
        return isFirstOverdue;
    }

    public void setIsFirstOverdue(String isFirstOverdue) {
        this.isFirstOverdue = isFirstOverdue;
    }

    public String getOverdueStage() {
        return overdueStage;
    }

    public void setOverdueStage(String overdueStage) {
        this.overdueStage = overdueStage;
    }

    public BigDecimal getGeneralCreditUseRate() {
        return generalCreditUseRate;
    }

    public void setGeneralCreditUseRate(BigDecimal generalCreditUseRate) {
        this.generalCreditUseRate = generalCreditUseRate;
    }

    public BigDecimal getGeneralCredit() {
        return generalCredit;
    }

    public void setGeneralCredit(BigDecimal generalCredit) {
        this.generalCredit = generalCredit;
    }

    public BigDecimal getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(BigDecimal totalDebt) {
        this.totalDebt = totalDebt;
    }

    public BigDecimal getOverdueMoney() {
        return overdueMoney;
    }

    public void setOverdueMoney(BigDecimal overdueMoney) {
        this.overdueMoney = overdueMoney;
    }

    public String getRegisteredProvince() {
        return registeredProvince;
    }

    public void setRegisteredProvince(String registeredProvince) {
        this.registeredProvince = registeredProvince;
    }

    public String getRegisteredCity() {
        return registeredCity;
    }

    public void setRegisteredCity(String registeredCity) {
        this.registeredCity = registeredCity;
    }

    public String getLiveProvince() {
        return liveProvince;
    }

    public void setLiveProvince(String liveProvince) {
        this.liveProvince = liveProvince;
    }

    public String getLiveCity() {
        return liveCity;
    }

    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity;
    }

    public Integer getHistoryHighOverdueDays() {
        return historyHighOverdueDays;
    }

    public void setHistoryHighOverdueDays(Integer historyHighOverdueDays) {
        this.historyHighOverdueDays = historyHighOverdueDays;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getCollectionRiskLevel() {
        return collectionRiskLevel;
    }

    public void setCollectionRiskLevel(String collectionRiskLevel) {
        this.collectionRiskLevel = collectionRiskLevel;
    }

    public String getTelephoneProvider() {
        return telephoneProvider;
    }

    public void setTelephoneProvider(String telephoneProvider) {
        this.telephoneProvider = telephoneProvider;
    }
}
