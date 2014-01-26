package com.nube.core.instance.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.Repository;

import com.nube.core.instance.dto.Instance;

/**
 * Store Instance specific data. Basically this will be a key value pair
 * 
 * @author kamoorr
 * 
 */

@Transactional
public interface InstanceRepository extends Repository<Instance, String> {

	@Cacheable("Instances")
	List<Instance> findAll();

	@CacheEvict("Instances")
	void delete(Instance instance);

	@CacheEvict("Instances")
	Instance save(Instance instance);

}
