package com.aiksanov.metrics.service;

import com.aiksanov.metrics.data.ChartData;
import com.aiksanov.metrics.data.repository.ChartRepo;
import com.aiksanov.metrics.dto.ChartDTO;
import com.aiksanov.metrics.util.enums.ChartTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChartService {
    private final ChartRepo chartRepo;

    @Autowired
    public ChartService(ChartRepo chartRepo) {
        this.chartRepo = chartRepo;
    }

    public ChartDTO getChartDto(int projectId, ChartTypes type) {
        List<Integer> dev = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> labels = new ArrayList<>();
        List<Integer> newIssues = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        List<Integer> qa = new ArrayList<>();
        List<Integer> qaDone = new ArrayList<>();
        List<ChartData> chartData = this.chartRepo.findByProjectIdAndMetricsType(projectId, type);
        chartData.forEach(chart -> {
            labels.add(chart.getWeek());
            newIssues.add(chart.getBl1());

            int development = chart.getBl2() + chart.getBl3();
            dev.add(development);
            qa.add(chart.getBl4());
            qaDone.add(chart.getBl5());
            in.add(chart.getIn1());
            out.add(chart.getOut1());
        });

        return new ChartDTO()
                .setDev(dev)
                .setIn(in)
                .setLabels(labels)
                .setNewIssues(newIssues)
                .setOut(out)
                .setQa(qa)
                .setQaDone(qaDone)
                .setUpdatedOn(new Date());
    }
}
