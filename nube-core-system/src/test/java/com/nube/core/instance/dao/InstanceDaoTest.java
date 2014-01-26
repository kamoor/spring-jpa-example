package com.nube.core.instance.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.nube.core.instance.dto.Instance;
import com.nube.core.instance.repository.InstanceRepository;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@ActiveProfiles("default")
// @Ignore
public class InstanceDaoTest {

	@Configuration
	@ImportResource(value = "classpath*:test-config.xml")
	static class ContextConfiguration {
	}

	@Autowired
	InstanceDao instanceDao;

	/**
	 * Test Instance.Save Option
	 */
	@Test
	@Transactional
	public void testSystemInsert() {

		Instance data = new Instance("test.key.1", "test.value.2");

		instanceDao.save(data);

	}

	

}
