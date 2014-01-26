package com.nube.core.instance.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nube.core.instance.dto.Instance;
import com.nube.core.instance.repository.InstanceRepository;

/**
 * Instance DAO to get/save/delete to INSTANCE table
 * @author kamoorr
 *
 */
@Component
public class InstanceDao {
	
	@Autowired
	InstanceRepository instanceRepository;
	
	
	public Instance getInstance(String key){
		List<Instance> allRows=  instanceRepository.findAll();
		int index = allRows.indexOf(new Instance(key, null));
		if(index > -1){
			return allRows.get(index);
		}
		return null;
	}
	
	public List<Instance> getInstances(){
		return instanceRepository.findAll();
	}
	
	public Instance save(Instance instance){
		return instanceRepository.save(instance);
	}
	
	public void delete(Instance instance){
		instanceRepository.delete(instance);
	}

}
