package edu.fudan.pojo;

/**
 * AbstractModuleinput entity provides the base persistence definition of the
 * Moduleinput entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractModuleinput implements java.io.Serializable {

	// Fields

	private Integer seq;
	private String input;
	private String moduleId;
	private String regex;

	// Constructors

	/** default constructor */
	public AbstractModuleinput() {
	}

	/** full constructor */
	public AbstractModuleinput(String input, String moduleId, String regex) {
		this.input = input;
		this.moduleId = moduleId;
		this.regex = regex;
	}

	// Property accessors

	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getRegex() {
		return this.regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

}