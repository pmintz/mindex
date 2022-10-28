package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.springframework.stereotype.Service;

@Service
public class CompensationServiceImpl implements CompensationService {

     CompensationRepository compensationRepository;

    public CompensationServiceImpl(CompensationRepository compensationRepository){
        this.compensationRepository = compensationRepository;
    }
    @Override
    public Compensation create(Compensation compensation) {
        return compensationRepository.save(compensation);
    }

    @Override
    public Compensation read(String id) {
        return compensationRepository.findByEmployee_EmployeeId(id);
    }
}
