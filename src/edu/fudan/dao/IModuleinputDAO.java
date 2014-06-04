package edu.fudan.dao;

import java.util.List;

import edu.fudan.pojo.Moduleinput;

public interface IModuleinputDAO {

	public abstract void save(Moduleinput transientInstance);

	public abstract Moduleinput findById(java.lang.Integer id);

	public abstract List findByInput(Object input);

	public abstract List findByModuleId(Object moduleId);

	public abstract List findAll();

}