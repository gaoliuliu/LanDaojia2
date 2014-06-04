package edu.fudan.pojo;

/**
 * Moduleinput entity. @author MyEclipse Persistence Tools
 */
public class Moduleinput extends AbstractModuleinput implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Moduleinput() {
	}

	/** full constructor */
	public Moduleinput(String input, String moduleId, String regex) {
		super(input, moduleId, regex);
	}

}
