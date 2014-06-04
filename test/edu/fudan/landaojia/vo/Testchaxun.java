package edu.fudan.landaojia.vo;



import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.fudan.service.QueryInputService;
import edu.fudan.service.QueryModuleResultService;





public class Testchaxun extends TestCase{

	public void Test1()
	{
		System.out.println("¿ªÊ¼");
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("/WEB-INF/applicationContext.xml");
		QueryModuleResultService mDao = (QueryModuleResultService)ctx.getBean("queryModuleResultServiceImpl");
		QueryInputService iService = (QueryInputService)ctx.getBean("queryInputServiceImpl");
		String moduleId = "C0001";
		List<String> s1 = new ArrayList<String>();
		s1.add("policyno@01234565778898");
		s1.add("modno@90132132134144");
		
		List<String> s2 = new ArrayList<String>();
		s2.add("policyno@01234565778899");
		s2.add("modno@90132132134145");
		
		
		List<List<String>> ne = new ArrayList<List<String>>();
		ne.add(s1);
		ne.add(s2);
		
		List<String> moduleInput = iService.getModuleInput(moduleId);
		
		List<String> moduleResult = mDao.getModuleResult(ne, moduleId);
		System.out.println(moduleResult);
		System.out.println(moduleInput);
		
	}
}
