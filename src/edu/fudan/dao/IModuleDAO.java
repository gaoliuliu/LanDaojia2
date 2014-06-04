package edu.fudan.dao;

import java.util.List;

import edu.fudan.pojo.Module;

public interface IModuleDAO {

	public abstract void save(Module transientInstance);

	public abstract Module findById(java.lang.String id);

	public abstract List findAll();

}