package edu.fudan.pojo;

/**
 * AbstractModule entity provides the base persistence definition of the Module
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractModule implements java.io.Serializable {

	// Fields

	private String moduleId;
	private String detail;
	private String intro;
	private String module;
	private String status;

	// Constructors

	/** default constructor */
	public AbstractModule() {
	}

	/** full constructor */
	public AbstractModule(String detail, String intro, String module,
			String status) {
		this.detail = detail;
		this.intro = intro;
		this.module = module;
		this.status = status;
	}

	// Property accessors

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}