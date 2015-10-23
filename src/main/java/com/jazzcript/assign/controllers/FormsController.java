package com.jazzcript.assign.controllers;

import com.jazzcript.assign.models.ResumeInfo;
import com.jazzcript.assign.models.SocialInfo;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.CookieGenerator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by rashakol on 21.10.2015.
 */
@Controller
@RequestMapping("/forms")
public class FormsController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showForms(HttpServletRequest request,HttpSession session){


        return new ModelAndView("forms","allInfo",InfoWorker.getInstance().getAllInfo(request, session));

    }


    @RequestMapping(value="/saveResume",method = RequestMethod.POST)
    public ModelAndView saveResumeData(ResumeInfo resumeInfo,
                                       HttpServletRequest request,
                                       HttpServletResponse response,
                                       HttpSession session){

        String message="Resume data saved successfully";

        shortCookie(response,"skills",resumeInfo.getSkills());
        shortCookie(response,"experiences",resumeInfo.getExperiences());
        shortCookie(response,"education",resumeInfo.getEducation());
        shortCookie(response,"additional",resumeInfo.getAdditional());



        return new ModelAndView("forms","allInfo",InfoWorker.getInstance().getAllInfo(resumeInfo, session, message));

    }



    @RequestMapping(value="/saveSocial",method = RequestMethod.POST)
    public ModelAndView saveSocialData(SocialInfo socialInfo,HttpServletRequest request,HttpSession session){

        String message="Social data saved successfully";

        session.setAttribute("socials",socialInfo);



        return new ModelAndView("forms","allInfo",InfoWorker.getInstance().getAllInfo(request, session, message));

    }


    private void shortCookie(HttpServletResponse response,String name,String value) {


        CookieGenerator cookieGenerator=new CookieGenerator();

        cookieGenerator.setCookieName(name);
        cookieGenerator.setCookieMaxAge(3600*24*30);
        cookieGenerator.addCookie(response,value);

    }





}
