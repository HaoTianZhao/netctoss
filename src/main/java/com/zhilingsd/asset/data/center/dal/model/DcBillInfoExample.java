package com.zhilingsd.asset.data.center.dal.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DcBillInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcBillInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("CUSTOMER_NO =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("CUSTOMER_NO <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("CUSTOMER_NO >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("CUSTOMER_NO <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("CUSTOMER_NO like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("CUSTOMER_NO not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("CUSTOMER_NO in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("CUSTOMER_NO not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeIsNull() {
            addCriterion("HIGH_PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeIsNotNull() {
            addCriterion("HIGH_PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeEqualTo(String value) {
            addCriterion("HIGH_PRODUCT_TYPE =", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeNotEqualTo(String value) {
            addCriterion("HIGH_PRODUCT_TYPE <>", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeGreaterThan(String value) {
            addCriterion("HIGH_PRODUCT_TYPE >", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HIGH_PRODUCT_TYPE >=", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeLessThan(String value) {
            addCriterion("HIGH_PRODUCT_TYPE <", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeLessThanOrEqualTo(String value) {
            addCriterion("HIGH_PRODUCT_TYPE <=", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeLike(String value) {
            addCriterion("HIGH_PRODUCT_TYPE like", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeNotLike(String value) {
            addCriterion("HIGH_PRODUCT_TYPE not like", value, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeIn(List<String> values) {
            addCriterion("HIGH_PRODUCT_TYPE in", values, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeNotIn(List<String> values) {
            addCriterion("HIGH_PRODUCT_TYPE not in", values, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeBetween(String value1, String value2) {
            addCriterion("HIGH_PRODUCT_TYPE between", value1, value2, "highProductType");
            return (Criteria) this;
        }

        public Criteria andHighProductTypeNotBetween(String value1, String value2) {
            addCriterion("HIGH_PRODUCT_TYPE not between", value1, value2, "highProductType");
            return (Criteria) this;
        }

        public Criteria andBillSourceIsNull() {
            addCriterion("BILL_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andBillSourceIsNotNull() {
            addCriterion("BILL_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andBillSourceEqualTo(String value) {
            addCriterion("BILL_SOURCE =", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotEqualTo(String value) {
            addCriterion("BILL_SOURCE <>", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceGreaterThan(String value) {
            addCriterion("BILL_SOURCE >", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_SOURCE >=", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLessThan(String value) {
            addCriterion("BILL_SOURCE <", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLessThanOrEqualTo(String value) {
            addCriterion("BILL_SOURCE <=", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceLike(String value) {
            addCriterion("BILL_SOURCE like", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotLike(String value) {
            addCriterion("BILL_SOURCE not like", value, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceIn(List<String> values) {
            addCriterion("BILL_SOURCE in", values, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotIn(List<String> values) {
            addCriterion("BILL_SOURCE not in", values, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceBetween(String value1, String value2) {
            addCriterion("BILL_SOURCE between", value1, value2, "billSource");
            return (Criteria) this;
        }

        public Criteria andBillSourceNotBetween(String value1, String value2) {
            addCriterion("BILL_SOURCE not between", value1, value2, "billSource");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("OVERDUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("OVERDUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Integer value) {
            addCriterion("OVERDUE_DAYS >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Integer value) {
            addCriterion("OVERDUE_DAYS <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("OVERDUE_DAYS <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Integer> values) {
            addCriterion("OVERDUE_DAYS in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Integer> values) {
            addCriterion("OVERDUE_DAYS not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_DAYS between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERDUE_DAYS not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonIsNull() {
            addCriterion("IN_COLLECTION_REASON is null");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonIsNotNull() {
            addCriterion("IN_COLLECTION_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonEqualTo(String value) {
            addCriterion("IN_COLLECTION_REASON =", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonNotEqualTo(String value) {
            addCriterion("IN_COLLECTION_REASON <>", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonGreaterThan(String value) {
            addCriterion("IN_COLLECTION_REASON >", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonGreaterThanOrEqualTo(String value) {
            addCriterion("IN_COLLECTION_REASON >=", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonLessThan(String value) {
            addCriterion("IN_COLLECTION_REASON <", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonLessThanOrEqualTo(String value) {
            addCriterion("IN_COLLECTION_REASON <=", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonLike(String value) {
            addCriterion("IN_COLLECTION_REASON like", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonNotLike(String value) {
            addCriterion("IN_COLLECTION_REASON not like", value, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonIn(List<String> values) {
            addCriterion("IN_COLLECTION_REASON in", values, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonNotIn(List<String> values) {
            addCriterion("IN_COLLECTION_REASON not in", values, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonBetween(String value1, String value2) {
            addCriterion("IN_COLLECTION_REASON between", value1, value2, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andInCollectionReasonNotBetween(String value1, String value2) {
            addCriterion("IN_COLLECTION_REASON not between", value1, value2, "inCollectionReason");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(String value) {
            addCriterion("PRODUCT_PRICE =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(String value) {
            addCriterion("PRODUCT_PRICE >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(String value) {
            addCriterion("PRODUCT_PRICE <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PRICE <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLike(String value) {
            addCriterion("PRODUCT_PRICE like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotLike(String value) {
            addCriterion("PRODUCT_PRICE not like", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<String> values) {
            addCriterion("PRODUCT_PRICE in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<String> values) {
            addCriterion("PRODUCT_PRICE not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesIsNull() {
            addCriterion("LOST_CONTACT_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesIsNotNull() {
            addCriterion("LOST_CONTACT_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesEqualTo(Integer value) {
            addCriterion("LOST_CONTACT_TIMES =", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesNotEqualTo(Integer value) {
            addCriterion("LOST_CONTACT_TIMES <>", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesGreaterThan(Integer value) {
            addCriterion("LOST_CONTACT_TIMES >", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOST_CONTACT_TIMES >=", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesLessThan(Integer value) {
            addCriterion("LOST_CONTACT_TIMES <", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesLessThanOrEqualTo(Integer value) {
            addCriterion("LOST_CONTACT_TIMES <=", value, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesIn(List<Integer> values) {
            addCriterion("LOST_CONTACT_TIMES in", values, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesNotIn(List<Integer> values) {
            addCriterion("LOST_CONTACT_TIMES not in", values, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesBetween(Integer value1, Integer value2) {
            addCriterion("LOST_CONTACT_TIMES between", value1, value2, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andLostContactTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("LOST_CONTACT_TIMES not between", value1, value2, "lostContactTimes");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentIsNull() {
            addCriterion("MINIMUM_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentIsNotNull() {
            addCriterion("MINIMUM_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT =", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentNotEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT <>", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentGreaterThan(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT >", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT >=", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentLessThan(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT <", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MINIMUM_PAYMENT <=", value, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_PAYMENT in", values, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentNotIn(List<BigDecimal> values) {
            addCriterion("MINIMUM_PAYMENT not in", values, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_PAYMENT between", value1, value2, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andMinimumPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MINIMUM_PAYMENT not between", value1, value2, "minimumPayment");
            return (Criteria) this;
        }

        public Criteria andBillDayIsNull() {
            addCriterion("BILL_DAY is null");
            return (Criteria) this;
        }

        public Criteria andBillDayIsNotNull() {
            addCriterion("BILL_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andBillDayEqualTo(Integer value) {
            addCriterion("BILL_DAY =", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotEqualTo(Integer value) {
            addCriterion("BILL_DAY <>", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayGreaterThan(Integer value) {
            addCriterion("BILL_DAY >", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILL_DAY >=", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayLessThan(Integer value) {
            addCriterion("BILL_DAY <", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayLessThanOrEqualTo(Integer value) {
            addCriterion("BILL_DAY <=", value, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayIn(List<Integer> values) {
            addCriterion("BILL_DAY in", values, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotIn(List<Integer> values) {
            addCriterion("BILL_DAY not in", values, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayBetween(Integer value1, Integer value2) {
            addCriterion("BILL_DAY between", value1, value2, "billDay");
            return (Criteria) this;
        }

        public Criteria andBillDayNotBetween(Integer value1, Integer value2) {
            addCriterion("BILL_DAY not between", value1, value2, "billDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayIsNull() {
            addCriterion("REPAY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andRepayDayIsNotNull() {
            addCriterion("REPAY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDayEqualTo(Integer value) {
            addCriterion("REPAY_DAY =", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotEqualTo(Integer value) {
            addCriterion("REPAY_DAY <>", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayGreaterThan(Integer value) {
            addCriterion("REPAY_DAY >", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAY_DAY >=", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayLessThan(Integer value) {
            addCriterion("REPAY_DAY <", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayLessThanOrEqualTo(Integer value) {
            addCriterion("REPAY_DAY <=", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayIn(List<Integer> values) {
            addCriterion("REPAY_DAY in", values, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotIn(List<Integer> values) {
            addCriterion("REPAY_DAY not in", values, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_DAY between", value1, value2, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_DAY not between", value1, value2, "repayDay");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultIsNull() {
            addCriterion("LEAST_CALL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultIsNotNull() {
            addCriterion("LEAST_CALL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultEqualTo(String value) {
            addCriterion("LEAST_CALL_RESULT =", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultNotEqualTo(String value) {
            addCriterion("LEAST_CALL_RESULT <>", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultGreaterThan(String value) {
            addCriterion("LEAST_CALL_RESULT >", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultGreaterThanOrEqualTo(String value) {
            addCriterion("LEAST_CALL_RESULT >=", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultLessThan(String value) {
            addCriterion("LEAST_CALL_RESULT <", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultLessThanOrEqualTo(String value) {
            addCriterion("LEAST_CALL_RESULT <=", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultLike(String value) {
            addCriterion("LEAST_CALL_RESULT like", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultNotLike(String value) {
            addCriterion("LEAST_CALL_RESULT not like", value, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultIn(List<String> values) {
            addCriterion("LEAST_CALL_RESULT in", values, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultNotIn(List<String> values) {
            addCriterion("LEAST_CALL_RESULT not in", values, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultBetween(String value1, String value2) {
            addCriterion("LEAST_CALL_RESULT between", value1, value2, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andLeastCallResultNotBetween(String value1, String value2) {
            addCriterion("LEAST_CALL_RESULT not between", value1, value2, "leastCallResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultIsNull() {
            addCriterion("BEST_COLLECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultIsNotNull() {
            addCriterion("BEST_COLLECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultEqualTo(String value) {
            addCriterion("BEST_COLLECTION_RESULT =", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultNotEqualTo(String value) {
            addCriterion("BEST_COLLECTION_RESULT <>", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultGreaterThan(String value) {
            addCriterion("BEST_COLLECTION_RESULT >", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("BEST_COLLECTION_RESULT >=", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultLessThan(String value) {
            addCriterion("BEST_COLLECTION_RESULT <", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultLessThanOrEqualTo(String value) {
            addCriterion("BEST_COLLECTION_RESULT <=", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultLike(String value) {
            addCriterion("BEST_COLLECTION_RESULT like", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultNotLike(String value) {
            addCriterion("BEST_COLLECTION_RESULT not like", value, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultIn(List<String> values) {
            addCriterion("BEST_COLLECTION_RESULT in", values, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultNotIn(List<String> values) {
            addCriterion("BEST_COLLECTION_RESULT not in", values, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultBetween(String value1, String value2) {
            addCriterion("BEST_COLLECTION_RESULT between", value1, value2, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andBestCollectionResultNotBetween(String value1, String value2) {
            addCriterion("BEST_COLLECTION_RESULT not between", value1, value2, "bestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayIsNull() {
            addCriterion("CURR_PROMISE_REPAY is null");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayIsNotNull() {
            addCriterion("CURR_PROMISE_REPAY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayEqualTo(String value) {
            addCriterion("CURR_PROMISE_REPAY =", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayNotEqualTo(String value) {
            addCriterion("CURR_PROMISE_REPAY <>", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayGreaterThan(String value) {
            addCriterion("CURR_PROMISE_REPAY >", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayGreaterThanOrEqualTo(String value) {
            addCriterion("CURR_PROMISE_REPAY >=", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayLessThan(String value) {
            addCriterion("CURR_PROMISE_REPAY <", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayLessThanOrEqualTo(String value) {
            addCriterion("CURR_PROMISE_REPAY <=", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayLike(String value) {
            addCriterion("CURR_PROMISE_REPAY like", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayNotLike(String value) {
            addCriterion("CURR_PROMISE_REPAY not like", value, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayIn(List<String> values) {
            addCriterion("CURR_PROMISE_REPAY in", values, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayNotIn(List<String> values) {
            addCriterion("CURR_PROMISE_REPAY not in", values, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayBetween(String value1, String value2) {
            addCriterion("CURR_PROMISE_REPAY between", value1, value2, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andCurrPromiseRepayNotBetween(String value1, String value2) {
            addCriterion("CURR_PROMISE_REPAY not between", value1, value2, "currPromiseRepay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayIsNull() {
            addCriterion("IS_PROMISE_REPAY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayIsNotNull() {
            addCriterion("IS_PROMISE_REPAY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayEqualTo(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY =", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayNotEqualTo(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY <>", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayGreaterThan(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY >", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY >=", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayLessThan(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY <", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayLessThanOrEqualTo(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY <=", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayLike(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY like", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayNotLike(String value) {
            addCriterion("IS_PROMISE_REPAY_DAY not like", value, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayIn(List<String> values) {
            addCriterion("IS_PROMISE_REPAY_DAY in", values, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayNotIn(List<String> values) {
            addCriterion("IS_PROMISE_REPAY_DAY not in", values, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayBetween(String value1, String value2) {
            addCriterion("IS_PROMISE_REPAY_DAY between", value1, value2, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andIsPromiseRepayDayNotBetween(String value1, String value2) {
            addCriterion("IS_PROMISE_REPAY_DAY not between", value1, value2, "isPromiseRepayDay");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultIsNull() {
            addCriterion("HISTORY_LEAST_CALL_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultIsNotNull() {
            addCriterion("HISTORY_LEAST_CALL_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultEqualTo(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT =", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultNotEqualTo(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT <>", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultGreaterThan(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT >", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT >=", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultLessThan(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT <", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT <=", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultLike(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT like", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultNotLike(String value) {
            addCriterion("HISTORY_LEAST_CALL_RESULT not like", value, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultIn(List<String> values) {
            addCriterion("HISTORY_LEAST_CALL_RESULT in", values, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultNotIn(List<String> values) {
            addCriterion("HISTORY_LEAST_CALL_RESULT not in", values, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultBetween(String value1, String value2) {
            addCriterion("HISTORY_LEAST_CALL_RESULT between", value1, value2, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryLeastCallResultNotBetween(String value1, String value2) {
            addCriterion("HISTORY_LEAST_CALL_RESULT not between", value1, value2, "historyLeastCallResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultIsNull() {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultIsNotNull() {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultEqualTo(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT =", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultNotEqualTo(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT <>", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultGreaterThan(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT >", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT >=", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultLessThan(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT <", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT <=", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultLike(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT like", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultNotLike(String value) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT not like", value, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultIn(List<String> values) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT in", values, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultNotIn(List<String> values) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT not in", values, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultBetween(String value1, String value2) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT between", value1, value2, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andHistoryBestCollectionResultNotBetween(String value1, String value2) {
            addCriterion("HISTORY_BEST_COLLECTION_RESULT not between", value1, value2, "historyBestCollectionResult");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIsNull() {
            addCriterion("COLLECTION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIsNotNull() {
            addCriterion("COLLECTION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusEqualTo(String value) {
            addCriterion("COLLECTION_STATUS =", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotEqualTo(String value) {
            addCriterion("COLLECTION_STATUS <>", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusGreaterThan(String value) {
            addCriterion("COLLECTION_STATUS >", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION_STATUS >=", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusLessThan(String value) {
            addCriterion("COLLECTION_STATUS <", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION_STATUS <=", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusLike(String value) {
            addCriterion("COLLECTION_STATUS like", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotLike(String value) {
            addCriterion("COLLECTION_STATUS not like", value, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusIn(List<String> values) {
            addCriterion("COLLECTION_STATUS in", values, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotIn(List<String> values) {
            addCriterion("COLLECTION_STATUS not in", values, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusBetween(String value1, String value2) {
            addCriterion("COLLECTION_STATUS between", value1, value2, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andCollectionStatusNotBetween(String value1, String value2) {
            addCriterion("COLLECTION_STATUS not between", value1, value2, "collectionStatus");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNull() {
            addCriterion("OUT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNotNull() {
            addCriterion("OUT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOutTypeEqualTo(String value) {
            addCriterion("OUT_TYPE =", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotEqualTo(String value) {
            addCriterion("OUT_TYPE <>", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThan(String value) {
            addCriterion("OUT_TYPE >", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE >=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThan(String value) {
            addCriterion("OUT_TYPE <", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE <=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLike(String value) {
            addCriterion("OUT_TYPE like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotLike(String value) {
            addCriterion("OUT_TYPE not like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeIn(List<String> values) {
            addCriterion("OUT_TYPE in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotIn(List<String> values) {
            addCriterion("OUT_TYPE not in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeBetween(String value1, String value2) {
            addCriterion("OUT_TYPE between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotBetween(String value1, String value2) {
            addCriterion("OUT_TYPE not between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeIsNull() {
            addCriterion("OUT_HAND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeIsNotNull() {
            addCriterion("OUT_HAND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeEqualTo(String value) {
            addCriterion("OUT_HAND_TYPE =", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeNotEqualTo(String value) {
            addCriterion("OUT_HAND_TYPE <>", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeGreaterThan(String value) {
            addCriterion("OUT_HAND_TYPE >", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_HAND_TYPE >=", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeLessThan(String value) {
            addCriterion("OUT_HAND_TYPE <", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeLessThanOrEqualTo(String value) {
            addCriterion("OUT_HAND_TYPE <=", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeLike(String value) {
            addCriterion("OUT_HAND_TYPE like", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeNotLike(String value) {
            addCriterion("OUT_HAND_TYPE not like", value, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeIn(List<String> values) {
            addCriterion("OUT_HAND_TYPE in", values, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeNotIn(List<String> values) {
            addCriterion("OUT_HAND_TYPE not in", values, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeBetween(String value1, String value2) {
            addCriterion("OUT_HAND_TYPE between", value1, value2, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutHandTypeNotBetween(String value1, String value2) {
            addCriterion("OUT_HAND_TYPE not between", value1, value2, "outHandType");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNull() {
            addCriterion("OUT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNotNull() {
            addCriterion("OUT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOutStatusEqualTo(String value) {
            addCriterion("OUT_STATUS =", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotEqualTo(String value) {
            addCriterion("OUT_STATUS <>", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThan(String value) {
            addCriterion("OUT_STATUS >", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_STATUS >=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThan(String value) {
            addCriterion("OUT_STATUS <", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThanOrEqualTo(String value) {
            addCriterion("OUT_STATUS <=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLike(String value) {
            addCriterion("OUT_STATUS like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotLike(String value) {
            addCriterion("OUT_STATUS not like", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusIn(List<String> values) {
            addCriterion("OUT_STATUS in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotIn(List<String> values) {
            addCriterion("OUT_STATUS not in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusBetween(String value1, String value2) {
            addCriterion("OUT_STATUS between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotBetween(String value1, String value2) {
            addCriterion("OUT_STATUS not between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerIsNull() {
            addCriterion("REPAY_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerIsNotNull() {
            addCriterion("REPAY_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerEqualTo(String value) {
            addCriterion("REPAY_CUSTOMER =", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerNotEqualTo(String value) {
            addCriterion("REPAY_CUSTOMER <>", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerGreaterThan(String value) {
            addCriterion("REPAY_CUSTOMER >", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_CUSTOMER >=", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerLessThan(String value) {
            addCriterion("REPAY_CUSTOMER <", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerLessThanOrEqualTo(String value) {
            addCriterion("REPAY_CUSTOMER <=", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerLike(String value) {
            addCriterion("REPAY_CUSTOMER like", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerNotLike(String value) {
            addCriterion("REPAY_CUSTOMER not like", value, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerIn(List<String> values) {
            addCriterion("REPAY_CUSTOMER in", values, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerNotIn(List<String> values) {
            addCriterion("REPAY_CUSTOMER not in", values, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerBetween(String value1, String value2) {
            addCriterion("REPAY_CUSTOMER between", value1, value2, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andRepayCustomerNotBetween(String value1, String value2) {
            addCriterion("REPAY_CUSTOMER not between", value1, value2, "repayCustomer");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNull() {
            addCriterion("COLLECTION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIsNotNull() {
            addCriterion("COLLECTION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNumEqualTo(Integer value) {
            addCriterion("COLLECTION_NUM =", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotEqualTo(Integer value) {
            addCriterion("COLLECTION_NUM <>", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThan(Integer value) {
            addCriterion("COLLECTION_NUM >", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLLECTION_NUM >=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThan(Integer value) {
            addCriterion("COLLECTION_NUM <", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumLessThanOrEqualTo(Integer value) {
            addCriterion("COLLECTION_NUM <=", value, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumIn(List<Integer> values) {
            addCriterion("COLLECTION_NUM in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotIn(List<Integer> values) {
            addCriterion("COLLECTION_NUM not in", values, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumBetween(Integer value1, Integer value2) {
            addCriterion("COLLECTION_NUM between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andCollectionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COLLECTION_NUM not between", value1, value2, "collectionNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("PHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("PHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(Integer value) {
            addCriterion("PHONE_NUM =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(Integer value) {
            addCriterion("PHONE_NUM <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(Integer value) {
            addCriterion("PHONE_NUM >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PHONE_NUM >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(Integer value) {
            addCriterion("PHONE_NUM <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(Integer value) {
            addCriterion("PHONE_NUM <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<Integer> values) {
            addCriterion("PHONE_NUM in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<Integer> values) {
            addCriterion("PHONE_NUM not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(Integer value1, Integer value2) {
            addCriterion("PHONE_NUM between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PHONE_NUM not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumIsNull() {
            addCriterion("JUSTICE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andJusticeNumIsNotNull() {
            addCriterion("JUSTICE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andJusticeNumEqualTo(Integer value) {
            addCriterion("JUSTICE_NUM =", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumNotEqualTo(Integer value) {
            addCriterion("JUSTICE_NUM <>", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumGreaterThan(Integer value) {
            addCriterion("JUSTICE_NUM >", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("JUSTICE_NUM >=", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumLessThan(Integer value) {
            addCriterion("JUSTICE_NUM <", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumLessThanOrEqualTo(Integer value) {
            addCriterion("JUSTICE_NUM <=", value, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumIn(List<Integer> values) {
            addCriterion("JUSTICE_NUM in", values, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumNotIn(List<Integer> values) {
            addCriterion("JUSTICE_NUM not in", values, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumBetween(Integer value1, Integer value2) {
            addCriterion("JUSTICE_NUM between", value1, value2, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andJusticeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("JUSTICE_NUM not between", value1, value2, "justiceNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("VISIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("VISIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Integer value) {
            addCriterion("VISIT_NUM =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Integer value) {
            addCriterion("VISIT_NUM <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Integer value) {
            addCriterion("VISIT_NUM >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NUM >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Integer value) {
            addCriterion("VISIT_NUM <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NUM <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Integer> values) {
            addCriterion("VISIT_NUM in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Integer> values) {
            addCriterion("VISIT_NUM not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NUM between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NUM not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumIsNull() {
            addCriterion("SMS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSmsNumIsNotNull() {
            addCriterion("SMS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNumEqualTo(Integer value) {
            addCriterion("SMS_NUM =", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotEqualTo(Integer value) {
            addCriterion("SMS_NUM <>", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumGreaterThan(Integer value) {
            addCriterion("SMS_NUM >", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SMS_NUM >=", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumLessThan(Integer value) {
            addCriterion("SMS_NUM <", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumLessThanOrEqualTo(Integer value) {
            addCriterion("SMS_NUM <=", value, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumIn(List<Integer> values) {
            addCriterion("SMS_NUM in", values, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotIn(List<Integer> values) {
            addCriterion("SMS_NUM not in", values, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumBetween(Integer value1, Integer value2) {
            addCriterion("SMS_NUM between", value1, value2, "smsNum");
            return (Criteria) this;
        }

        public Criteria andSmsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SMS_NUM not between", value1, value2, "smsNum");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNull() {
            addCriterion("CUSTOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNotNull() {
            addCriterion("CUSTOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeEqualTo(String value) {
            addCriterion("CUSTOM_TYPE =", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <>", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThan(String value) {
            addCriterion("CUSTOM_TYPE >", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE >=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThan(String value) {
            addCriterion("CUSTOM_TYPE <", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_TYPE <=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLike(String value) {
            addCriterion("CUSTOM_TYPE like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotLike(String value) {
            addCriterion("CUSTOM_TYPE not like", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIn(List<String> values) {
            addCriterion("CUSTOM_TYPE in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotIn(List<String> values) {
            addCriterion("CUSTOM_TYPE not in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_TYPE not between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueIsNull() {
            addCriterion("IS_FIRST_OVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueIsNotNull() {
            addCriterion("IS_FIRST_OVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueEqualTo(String value) {
            addCriterion("IS_FIRST_OVERDUE =", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueNotEqualTo(String value) {
            addCriterion("IS_FIRST_OVERDUE <>", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueGreaterThan(String value) {
            addCriterion("IS_FIRST_OVERDUE >", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FIRST_OVERDUE >=", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueLessThan(String value) {
            addCriterion("IS_FIRST_OVERDUE <", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueLessThanOrEqualTo(String value) {
            addCriterion("IS_FIRST_OVERDUE <=", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueLike(String value) {
            addCriterion("IS_FIRST_OVERDUE like", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueNotLike(String value) {
            addCriterion("IS_FIRST_OVERDUE not like", value, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueIn(List<String> values) {
            addCriterion("IS_FIRST_OVERDUE in", values, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueNotIn(List<String> values) {
            addCriterion("IS_FIRST_OVERDUE not in", values, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueBetween(String value1, String value2) {
            addCriterion("IS_FIRST_OVERDUE between", value1, value2, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andIsFirstOverdueNotBetween(String value1, String value2) {
            addCriterion("IS_FIRST_OVERDUE not between", value1, value2, "isFirstOverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueStageIsNull() {
            addCriterion("OVERDUE_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andOverdueStageIsNotNull() {
            addCriterion("OVERDUE_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueStageEqualTo(String value) {
            addCriterion("OVERDUE_STAGE =", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageNotEqualTo(String value) {
            addCriterion("OVERDUE_STAGE <>", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageGreaterThan(String value) {
            addCriterion("OVERDUE_STAGE >", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUE_STAGE >=", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageLessThan(String value) {
            addCriterion("OVERDUE_STAGE <", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageLessThanOrEqualTo(String value) {
            addCriterion("OVERDUE_STAGE <=", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageLike(String value) {
            addCriterion("OVERDUE_STAGE like", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageNotLike(String value) {
            addCriterion("OVERDUE_STAGE not like", value, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageIn(List<String> values) {
            addCriterion("OVERDUE_STAGE in", values, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageNotIn(List<String> values) {
            addCriterion("OVERDUE_STAGE not in", values, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageBetween(String value1, String value2) {
            addCriterion("OVERDUE_STAGE between", value1, value2, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andOverdueStageNotBetween(String value1, String value2) {
            addCriterion("OVERDUE_STAGE not between", value1, value2, "overdueStage");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateIsNull() {
            addCriterion("GENERAL_CREDIT_USE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateIsNotNull() {
            addCriterion("GENERAL_CREDIT_USE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE =", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateNotEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE <>", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateGreaterThan(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE >", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE >=", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateLessThan(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE <", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT_USE_RATE <=", value, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateIn(List<BigDecimal> values) {
            addCriterion("GENERAL_CREDIT_USE_RATE in", values, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateNotIn(List<BigDecimal> values) {
            addCriterion("GENERAL_CREDIT_USE_RATE not in", values, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERAL_CREDIT_USE_RATE between", value1, value2, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditUseRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERAL_CREDIT_USE_RATE not between", value1, value2, "generalCreditUseRate");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditIsNull() {
            addCriterion("GENERAL_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditIsNotNull() {
            addCriterion("GENERAL_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT =", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditNotEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT <>", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditGreaterThan(BigDecimal value) {
            addCriterion("GENERAL_CREDIT >", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT >=", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditLessThan(BigDecimal value) {
            addCriterion("GENERAL_CREDIT <", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GENERAL_CREDIT <=", value, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditIn(List<BigDecimal> values) {
            addCriterion("GENERAL_CREDIT in", values, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditNotIn(List<BigDecimal> values) {
            addCriterion("GENERAL_CREDIT not in", values, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERAL_CREDIT between", value1, value2, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andGeneralCreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENERAL_CREDIT not between", value1, value2, "generalCredit");
            return (Criteria) this;
        }

        public Criteria andTotalDebtIsNull() {
            addCriterion("TOTAL_DEBT is null");
            return (Criteria) this;
        }

        public Criteria andTotalDebtIsNotNull() {
            addCriterion("TOTAL_DEBT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDebtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT =", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT <>", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_DEBT >", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT >=", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtLessThan(BigDecimal value) {
            addCriterion("TOTAL_DEBT <", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT <=", value, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEBT in", values, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEBT not in", values, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEBT between", value1, value2, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andTotalDebtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEBT not between", value1, value2, "totalDebt");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyIsNull() {
            addCriterion("OVERDUE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyIsNotNull() {
            addCriterion("OVERDUE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyEqualTo(BigDecimal value) {
            addCriterion("OVERDUE_MONEY =", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyNotEqualTo(BigDecimal value) {
            addCriterion("OVERDUE_MONEY <>", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyGreaterThan(BigDecimal value) {
            addCriterion("OVERDUE_MONEY >", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERDUE_MONEY >=", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyLessThan(BigDecimal value) {
            addCriterion("OVERDUE_MONEY <", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERDUE_MONEY <=", value, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyIn(List<BigDecimal> values) {
            addCriterion("OVERDUE_MONEY in", values, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyNotIn(List<BigDecimal> values) {
            addCriterion("OVERDUE_MONEY not in", values, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERDUE_MONEY between", value1, value2, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andOverdueMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERDUE_MONEY not between", value1, value2, "overdueMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelIsNull() {
            addCriterion("COLLECTION_RISK_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelIsNotNull() {
            addCriterion("COLLECTION_RISK_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelEqualTo(String value) {
            addCriterion("COLLECTION_RISK_LEVEL =", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelNotEqualTo(String value) {
            addCriterion("COLLECTION_RISK_LEVEL <>", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelGreaterThan(String value) {
            addCriterion("COLLECTION_RISK_LEVEL >", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTION_RISK_LEVEL >=", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelLessThan(String value) {
            addCriterion("COLLECTION_RISK_LEVEL <", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("COLLECTION_RISK_LEVEL <=", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelLike(String value) {
            addCriterion("COLLECTION_RISK_LEVEL like", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelNotLike(String value) {
            addCriterion("COLLECTION_RISK_LEVEL not like", value, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelIn(List<String> values) {
            addCriterion("COLLECTION_RISK_LEVEL in", values, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelNotIn(List<String> values) {
            addCriterion("COLLECTION_RISK_LEVEL not in", values, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelBetween(String value1, String value2) {
            addCriterion("COLLECTION_RISK_LEVEL between", value1, value2, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andCollectionRiskLevelNotBetween(String value1, String value2) {
            addCriterion("COLLECTION_RISK_LEVEL not between", value1, value2, "collectionRiskLevel");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderIsNull() {
            addCriterion("TELEPHONE_PROVIDER is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderIsNotNull() {
            addCriterion("TELEPHONE_PROVIDER is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderEqualTo(String value) {
            addCriterion("TELEPHONE_PROVIDER =", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderNotEqualTo(String value) {
            addCriterion("TELEPHONE_PROVIDER <>", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderGreaterThan(String value) {
            addCriterion("TELEPHONE_PROVIDER >", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE_PROVIDER >=", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderLessThan(String value) {
            addCriterion("TELEPHONE_PROVIDER <", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE_PROVIDER <=", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderLike(String value) {
            addCriterion("TELEPHONE_PROVIDER like", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderNotLike(String value) {
            addCriterion("TELEPHONE_PROVIDER not like", value, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderIn(List<String> values) {
            addCriterion("TELEPHONE_PROVIDER in", values, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderNotIn(List<String> values) {
            addCriterion("TELEPHONE_PROVIDER not in", values, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderBetween(String value1, String value2) {
            addCriterion("TELEPHONE_PROVIDER between", value1, value2, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andTelephoneProviderNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE_PROVIDER not between", value1, value2, "telephoneProvider");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysIsNull() {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysIsNotNull() {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysEqualTo(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS =", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysNotEqualTo(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS <>", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysGreaterThan(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS >", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS >=", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysLessThan(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS <", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS <=", value, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysIn(List<Integer> values) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS in", values, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysNotIn(List<Integer> values) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS not in", values, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS between", value1, value2, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("HISTORY_HIGH_OVERDUE_DAYS not between", value1, value2, "historyHighOverdueDays");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageIsNull() {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageIsNotNull() {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageEqualTo(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE =", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageNotEqualTo(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE <>", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageGreaterThan(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE >", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE >=", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageLessThan(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE <", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageLessThanOrEqualTo(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE <=", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageLike(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE like", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageNotLike(String value) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE not like", value, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageIn(List<String> values) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE in", values, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageNotIn(List<String> values) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE not in", values, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageBetween(String value1, String value2) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE between", value1, value2, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andHistoryHighOverdueStageNotBetween(String value1, String value2) {
            addCriterion("HISTORY_HIGH_OVERDUE_STAGE not between", value1, value2, "historyHighOverdueStage");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtIsNull() {
            addCriterion("remain_principal_amt is null");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtIsNotNull() {
            addCriterion("remain_principal_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtEqualTo(BigDecimal value) {
            addCriterion("remain_principal_amt =", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtNotEqualTo(BigDecimal value) {
            addCriterion("remain_principal_amt <>", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtGreaterThan(BigDecimal value) {
            addCriterion("remain_principal_amt >", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_principal_amt >=", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtLessThan(BigDecimal value) {
            addCriterion("remain_principal_amt <", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remain_principal_amt <=", value, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtIn(List<BigDecimal> values) {
            addCriterion("remain_principal_amt in", values, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtNotIn(List<BigDecimal> values) {
            addCriterion("remain_principal_amt not in", values, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_principal_amt between", value1, value2, "remainPrincipalAmt");
            return (Criteria) this;
        }

        public Criteria andRemainPrincipalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remain_principal_amt not between", value1, value2, "remainPrincipalAmt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}