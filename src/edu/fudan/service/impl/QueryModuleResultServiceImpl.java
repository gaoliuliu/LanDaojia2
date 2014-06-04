package edu.fudan.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import edu.fudan.dao.impl.ModuleDAO;
import edu.fudan.service.QueryModuleResultService;



public class QueryModuleResultServiceImpl implements QueryModuleResultService{
	
	private ModuleDAO queryModuleDaoImpl;
	
	public ModuleDAO getQueryModuleDaoImpl() {
		return queryModuleDaoImpl;
	}
	
	public void setQueryModuleDaoImpl(ModuleDAO queryModuleDaoImpl) {
		this.queryModuleDaoImpl = queryModuleDaoImpl;
	}

	@Override
	public List<String> getModuleResult(List<List<String>> inputResult,
			String moduleId) {
		// TODO Auto-generated method stub
		String str = queryModuleDaoImpl.findById(moduleId).getModule();
		List<String> result = new ArrayList<String>();
		for(List<String> s :inputResult)
		{
			String strModule = str; 
			for(String tmp:s)
			{
				String sp[] = tmp.split("@");
				strModule = strModule.replaceAll("#"+sp[0]+"#", "'"+sp[1]+"'");
			}
			result.add(strModule);
		}
		return result;
	}

	
	
}
