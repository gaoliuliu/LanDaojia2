package edu.fudan.service;

import java.util.List;

public interface QueryModuleResultService {

	public List<String> getModuleResult(List<List<String>> inputResult,String moduleId);
}
