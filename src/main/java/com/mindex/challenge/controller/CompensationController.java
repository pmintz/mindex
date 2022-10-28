package com.mindex.challenge.controller;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.impl.CompensationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);
    CompensationServiceImpl compensationService;

    public CompensationController(CompensationServiceImpl compensationService){
        this.compensationService = compensationService;
    }


    @GetMapping("/compensation/{id}")
    public Compensation read(@PathVariable String id) {
        LOG.debug("Received employee create request for id [{}]", id);

        return compensationService.read(id);
    }

    @PostMapping("/compensation")
    public Compensation create(@RequestBody Compensation compensation) {
        LOG.debug("Received employee create request for [{}]", compensation);

        return compensationService.create(compensation);
    }
}
