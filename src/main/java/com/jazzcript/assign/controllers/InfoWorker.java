package com.jazzcript.assign.controllers;

import com.jazzcript.assign.models.ResumeInfo;
import com.jazzcript.assign.models.SocialInfo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created by rashakol on 22.10.2015.
 */
public class InfoWorker {

    private static volatile InfoWorker instance;


    public InfoWorker()  {

        if(instance!=null)
            try {
                throw new Exception("call getInstance()");
            } catch (Exception e) {
                e.printStackTrace();
            }


        instance=this;
    }

    public static InfoWorker getInstance() {
        if(instance==null)
            instance=new InfoWorker();

        return instance;

    }


    public HashMap<String, Object> getAllInfo(HttpServletRequest request,HttpSession session) {
        HashMap<String,Object> allInfo=new HashMap<String, Object>();



        allInfo.put("socialInfo",getSocialInfo(session));

        allInfo.put("resumeInfo",getResumeInfo(request));



        return allInfo;
    }


    public HashMap<String, Object> getAllInfo(HttpServletRequest request,HttpSession session,String message) {
        HashMap<String,Object> allInfo=new HashMap<String, Object>();


        allInfo.put("socialInfo",getSocialInfo(session));

        allInfo.put("resumeInfo",getResumeInfo(request));

        allInfo.put("message",message);



        return allInfo;
    }

    public HashMap<String, Object> getAllInfo(ResumeInfo resumeInfo,HttpSession session,String message) {
        HashMap<String,Object> allInfo=new HashMap<String, Object>();



        allInfo.put("socialInfo",getSocialInfo(session));

        allInfo.put("resumeInfo",resumeInfo);

        allInfo.put("message",message);



        return allInfo;
    }


    public ResumeInfo getResumeInfo(HttpServletRequest request) {

        ResumeInfo resumeInfo=new ResumeInfo();

        Cookie[] cookies= request.getCookies();

        for(Cookie cookie:cookies){

            if(cookie.getName().equals("skills"))
                resumeInfo.setSkills(cookie.getValue());
            else  if(cookie.getName().equals("experiences"))
                resumeInfo.setExperiences(cookie.getValue());
            else  if(cookie.getName().equals("education"))
                resumeInfo.setEducation(cookie.getValue());
            else  if(cookie.getName().equals("additional"))
                resumeInfo.setAdditional(cookie.getValue());


        }



        return resumeInfo;
    }

    public SocialInfo getSocialInfo(HttpSession session) {

        SocialInfo socialInfo=(SocialInfo) session.getAttribute("socials");

        if(socialInfo==null)
            socialInfo=new SocialInfo();

        return socialInfo;
    }
}
