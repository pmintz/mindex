package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.DirectReports;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService {

    EmployeeRepository employeeRepository;

    private ReportingStructure reportingStructure = new ReportingStructure();

    public ReportingStructureServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }


    @Override
    public ReportingStructure read(String id) {
        List<Employee> employeeList = new ArrayList<>();
        reportingStructure.setEmployees(getDirectReports(id, employeeList));
        reportingStructure.setNumberOfReports(reportingStructure.getEmployees().stream().count());
        return reportingStructure;
    }

    public List<Employee> getDirectReports(String id, List<Employee> employeeList){
        Employee employee = employeeRepository.findByEmployeeId(id);

        if(employee.getDirectReports() == null){
            return employeeList;
        }

        for(DirectReports directReports: employee.getDirectReports()) {
            employeeList.add(employeeRepository.findByEmployeeId(directReports.getEmployeeId()));
            getDirectReports(directReports.getEmployeeId(), employeeList);
        }

        return employeeList;

    }
}
