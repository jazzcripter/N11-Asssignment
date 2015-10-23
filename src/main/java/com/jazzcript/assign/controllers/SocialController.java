package com.jazzcript.assign.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by rashakol on 21.10.2015.
 */
@Controller
@RequestMapping("/social")
public class SocialController {
@RequestMapping(method = RequestMethod.GET)
    public ModelAndView showSocialInfo(HttpSession session){

        return new ModelAndView("social","socialInfo",InfoWorker.getInstance().getSocialInfo(session));

    }



}
