package com.jazzcript.assign.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class BioController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printBioAndResume(HttpServletRequest request) {

		return new ModelAndView("bio","resumeInfo",InfoWorker.getInstance().getResumeInfo(request));

	}



}