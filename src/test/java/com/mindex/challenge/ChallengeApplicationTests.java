package com.mindex.challenge;

import com.mindex.challenge.config.MongoConfig;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.impl.ReportingStructureServiceImpl;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ReportingStructureServiceImpl reportingStructureService;


	@Test
	public void lennonHasFourReports(){

		reportingStructureService = new ReportingStructureServiceImpl(employeeRepository);
		ReportingStructure reportingStructure =
				reportingStructureService.read("16a596ae-edd3-4847-99fe-c4518e82c86f");

		assertTrue(reportingStructure.getNumberOfReports() == 4);

	}
}
