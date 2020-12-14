package com.zhilingsd.qi.business.storage.mysql.model;

import java.util.Date;

public class QiRuleScoreRules {
    private Long id;

    private String name;

    private Long classifyId;

    private String qiTarget;

    private Integer sort;

    private String meaningType;

    private String description;

    private Long merchantId;

    private Date created;

    private Date updated;

    private Long creator;

    private Long modifier;

    private String deleted;

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

    public Long getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }

    public String getQiTarget() {
        return qiTarget;
    }

    public void setQiTarget(String qiTarget) {
        this.qiTarget = qiTarget;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getMeaningType() {
        return meaningType;
    }

    public void setMeaningType(String meaningType) {
        this.meaningType = meaningType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}