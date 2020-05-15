package com.aiksanov.metrics.data.mappedSuperclasses;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class JiraExtendedFields extends JiraIssueFieldsMain{
    @Column(name = "assignee")
    private String assignee;

    @Column(name = "reporter")
    private String reporter;

    @Column(name = "outstate")
    private String outState;

    @Column(name = "resolution")
    private String resolution;

    @Column(name = "isduplicate")
    private String isDuplicate;

    @Column(name = "priority")
    private String priority;

    @Column(name = "queststatus")
    private String questStatus;

    @Column(name = "state")
    private String state;

    @Column(name = "proposedaction")
    private String proposedAction;

    @Column(name = "tsrefbridge")
    private String tsRefBridge;

    @Column(name = "tsref")
    private String tsRef;

    @Column(name = "summary")
    private String summary;

    @Column(name = "howfound")
    private String howFound;

    @Column(name = "rejected")
    private String rejected;

    @Column(name = "regression")
    private String regression;

    @Column(name = "tsaccount")
    private String tsAccount;

    @Column(name = "tsassociatedaccount")
    private String tsAssociatedAccount;

    @Column(name = "recomputedon")
    private Date recomputedOn;

    public JiraExtendedFields() {
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getOutState() {
        return outState;
    }

    public void setOutState(String outState) {
        this.outState = outState;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getIsDuplicate() {
        return isDuplicate;
    }

    public void setIsDuplicate(String isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getQuestStatus() {
        return questStatus;
    }

    public void setQuestStatus(String questStatus) {
        this.questStatus = questStatus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProposedAction() {
        return proposedAction;
    }

    public void setProposedAction(String proposedAction) {
        this.proposedAction = proposedAction;
    }

    public String getTsRefBridge() {
        return tsRefBridge;
    }

    public void setTsRefBridge(String TSrefBridge) {
        this.tsRefBridge = TSrefBridge;
    }

    public String getTsRef() {
        return tsRef;
    }

    public void setTsRef(String TSref) {
        this.tsRef = TSref;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getHowFound() {
        return howFound;
    }

    public void setHowFound(String howFound) {
        this.howFound = howFound;
    }

    public String getRejected() {
        return rejected;
    }

    public void setRejected(String rejected) {
        this.rejected = rejected;
    }

    public String getRegression() {
        return regression;
    }

    public void setRegression(String regression) {
        this.regression = regression;
    }

    public String getTsAccount() {
        return tsAccount;
    }

    public void setTsAccount(String TSaccount) {
        this.tsAccount = TSaccount;
    }

    public String getTsAssociatedAccount() {
        return tsAssociatedAccount;
    }

    public void setTsAssociatedAccount(String TSassociatedAccount) {
        this.tsAssociatedAccount = TSassociatedAccount;
    }

    public Date getRecomputedOn() {
        return recomputedOn;
    }

    public void setRecomputedOn(Date recomputedOn) {
        this.recomputedOn = recomputedOn;
    }
}
