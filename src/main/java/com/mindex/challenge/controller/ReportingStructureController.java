package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ReportingStructureController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);


    ReportingStructureService reportingStructureService;

    public ReportingStructureController(ReportingStructureService reportingStructureService){
        this.reportingStructureService = reportingStructureService;
    }

    @GetMapping("/reporting/structure/{id}")
    public ReportingStructure read(@PathVariable String id) {
        LOG.debug("Received employee create request for id [{}]", id);

        return reportingStructureService.read(id);
    }
}
