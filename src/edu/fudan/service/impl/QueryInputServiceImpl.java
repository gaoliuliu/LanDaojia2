package edu.fudan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import edu.fudan.dao.impl.ModuleinputDAO;
import edu.fudan.pojo.Module;
import edu.fudan.pojo.Moduleinput;
import edu.fudan.service.QueryInputService;


public class QueryInputServiceImpl implements QueryInputService{

	private ModuleinputDAO queryModuleInputDaoImpl;
	
	public ModuleinputDAO getQueryModuleInputDaoImpl() {
		return queryModuleInputDaoImpl;
	}
	
	public void setQueryModuleInputDaoImpl(ModuleinputDAO queryModuleInputDaoImpl) {
		this.queryModuleInputDaoImpl = queryModuleInputDaoImpl;
	}

	@Override
	public List<Moduleinput> getModuleInput(String moduleId) {
		// TODO Auto-generated method stub
		return queryModuleInputDaoImpl.findByModuleId(moduleId);
	}

}
