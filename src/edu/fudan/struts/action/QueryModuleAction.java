/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package edu.fudan.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;




import edu.fudan.pojo.Module;
import edu.fudan.pojo.Moduleinput;
import edu.fudan.service.QueryInputService;
import edu.fudan.struts.form.QueryModuleForm;

/** 
 * MyEclipse Struts
 * Creation date: 05-25-2014
 * 
 * XDoclet definition:
 * @struts.action path="/queryModule" name="queryModuleForm" input="/queryModule.jsp" scope="request" validate="true"
 */
public class QueryModuleAction extends BaseAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		QueryModuleForm queryModuleForm = (QueryModuleForm) form;
		String moduleId = queryModuleForm.getQueryId();
		//String password = loginForm.getPassword();
		ActionForward forward = mapping.getInputForward();
		QueryInputService service = (QueryInputService) getBean("QueryInputService");
		List<Moduleinput> moduleIdFromDB = service.getModuleInput(moduleId);
		for(Moduleinput sc:moduleIdFromDB)
		{
			System.out.println(sc.getInput());
		}
		request.setAttribute("inputlist", moduleIdFromDB); 
		request.setAttribute("moduleId", moduleId); 
		//User userFromDB = service.getUserByUsername(username);
		//if (userFromDB.getPassword().equals(password)) {
			forward = mapping.findForward("suc");
		//}
		return forward;

	}
}