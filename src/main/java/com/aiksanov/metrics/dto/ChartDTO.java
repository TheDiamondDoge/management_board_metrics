package com.aiksanov.metrics.dto;

import java.util.Date;
import java.util.List;

public class ChartDTO {
    private List<Integer> dev;
    private List<Integer> in;
    private List<Integer> labels;
    private List<Integer> newIssues;
    private List<Integer> out;
    private List<Integer> qa;
    private List<Integer> qaDone;
    private Date updatedOn;

    public ChartDTO() {
    }

    public List<Integer> getDev() {
        return dev;
    }

    public ChartDTO setDev(List<Integer> dev) {
        this.dev = dev;
        return this;
    }

    public List<Integer> getIn() {
        return in;
    }

    public ChartDTO setIn(List<Integer> in) {
        this.in = in;
        return this;
    }

    public List<Integer> getLabels() {
        return labels;
    }

    public ChartDTO setLabels(List<Integer> labels) {
        this.labels = labels;
        return this;
    }

    public List<Integer> getNewIssues() {
        return newIssues;
    }

    public ChartDTO setNewIssues(List<Integer> newIssues) {
        this.newIssues = newIssues;
        return this;
    }

    public List<Integer> getOut() {
        return out;
    }

    public ChartDTO setOut(List<Integer> out) {
        this.out = out;
        return this;
    }

    public List<Integer> getQa() {
        return qa;
    }

    public ChartDTO setQa(List<Integer> qa) {
        this.qa = qa;
        return this;
    }

    public List<Integer> getQaDone() {
        return qaDone;
    }

    public ChartDTO setQaDone(List<Integer> qaDone) {
        this.qaDone = qaDone;
        return this;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public ChartDTO setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }
}