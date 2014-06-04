package edu.fudan.pojo;

/**
 * Module entity. @author MyEclipse Persistence Tools
 */
public class Module extends AbstractModule implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Module() {
	}

	/** full constructor */
	public Module(String detail, String intro, String module, String status) {
		super(detail, intro, module, status);
	}

}
