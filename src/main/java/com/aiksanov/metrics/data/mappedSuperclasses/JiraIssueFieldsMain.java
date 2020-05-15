package com.aiksanov.metrics.data.mappedSuperclasses;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class JiraIssueFieldsMain {
    @Column(name = "synctime")
    private Date synctime;

    @Column(name = "week")
    private String week;

    @Column(name = "crid")
    private String crId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "releasename")
    private String releaseName;

    @Column(name = "component")
    private String component;

    @Column(name = "item")
    private String item;

    @Column(name = "instate")
    private String inState;

    @Column(name = "created")
    private String created;

    public JiraIssueFieldsMain() {
    }

    public Date getSynctime() {
        return synctime;
    }

    public void setSynctime(Date synctime) {
        this.synctime = synctime;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getCrId() {
        return crId;
    }

    public void setCrId(String crId) {
        this.crId = crId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getInState() {
        return inState;
    }

    public void setInState(String inState) {
        this.inState = inState;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
