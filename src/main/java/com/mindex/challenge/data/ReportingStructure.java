package com.mindex.challenge.data;


import java.util.List;

public class ReportingStructure {

    long numberOfReports;
    List<Employee> employees;
    public long getNumberOfReports() {
        return numberOfReports;
    }

    public void setNumberOfReports(long numberOfReports) {
        this.numberOfReports = numberOfReports;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
