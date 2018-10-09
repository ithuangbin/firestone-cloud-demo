package com.firestone.model.es.nest;

public class YearReport {
    //年报-报告期
    private String report_period;
    //年报-社保人数
    private String insuranced;

    public String getReport_period() {
        return report_period;
    }

    public void setReport_period(String report_period) {
        this.report_period = report_period != null? report_period:"";
    }

    public String getInsuranced() {
        return insuranced;
    }

    public void setInsuranced(String insuranced) {
        this.insuranced = insuranced;
    }
}
