package com.jazzcript.assign.models;

import java.io.Serializable;

/**
 * Created by rashakol on 21.10.2015.
 */
public class ResumeInfo implements Serializable {

    private String skills="";
    private String experiences="";
    private String education="";
    private String additional="";


    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }




}
