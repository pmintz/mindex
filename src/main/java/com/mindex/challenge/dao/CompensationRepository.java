package com.mindex.challenge.dao;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.data.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository//"2022-10-28T12:00:00Z"
public interface CompensationRepository extends MongoRepository<Compensation, String> {
    Compensation findByEmployee_EmployeeId(String id);
}
