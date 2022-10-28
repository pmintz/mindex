package com.mindex.challenge.service;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;

import java.util.List;

public interface ReportingStructureService {
    ReportingStructure read(String id);

    public List<Employee> getDirectReports(String id, List<Employee> employeeList);
}
