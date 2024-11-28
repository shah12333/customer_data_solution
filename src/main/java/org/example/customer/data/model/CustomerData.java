package org.example.customer.data.model;

public class CustomerData {

    String customerId;
    String contractId;
    String geoZone;
    String teamCode;
    String projectCode;
    String buildDuration;

    public CustomerData(String customerId, String contractId, String geoZone, String teamCode, String projectCode, String buildDuration) {
        this.customerId = customerId;
        this.contractId = contractId;
        this.geoZone = geoZone;
        this.teamCode = teamCode;
        this.projectCode = projectCode;
        this.buildDuration = buildDuration;
    }

    public String  getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String  customerId) {
        this.customerId = customerId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getGeoZone() {
        return geoZone;
    }

    public void setGeoZone(String geoZone) {
        this.geoZone = geoZone;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(String buildDuration) {
        this.buildDuration = buildDuration;
    }
}
