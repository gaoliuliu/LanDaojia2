/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package edu.fudan.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 05-27-2014
 * 
 * XDoclet definition:
 * @struts.form name="searchImgForm"
 */
public class SearchImgForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** filepath property */
	private String filepath;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the filepath.
	 * @return String
	 */
	public String getFilepath() {
		return filepath;
	}

	/** 
	 * Set the filepath.
	 * @param filepath The filepath to set
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
}