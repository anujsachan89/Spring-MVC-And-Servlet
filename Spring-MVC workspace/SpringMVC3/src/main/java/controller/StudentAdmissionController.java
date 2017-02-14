package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController {


	@RequestMapping(value ="admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() 
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	@RequestMapping(value = "submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> reqPar)
	{
		String name = reqPar.get("studentName");
		String hobby = reqPar.get("studentHobby");

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details Submitted by you :: name: "+name+",Hobby:" +hobby);
		return model;
	}
}
