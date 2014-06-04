package edu.fudan.service;

import java.util.List;

import edu.fudan.pojo.Module;
import edu.fudan.pojo.Moduleinput;

public interface QueryInputService {

	public List<Moduleinput> getModuleInput(String moduleId);
}
