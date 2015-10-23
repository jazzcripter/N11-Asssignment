package com.jazzcript.assign.models;

import java.io.Serializable;

/**
 * Created by rashakol on 21.10.2015.
 */
public class SocialInfo implements Serializable {


    private String fbProfile="";
    private String gplusProfile="";
    private String linkedinProfile="";
    private String instagramProfile="";

    public String getFbProfile() {
        return fbProfile;
    }

    public void setFbProfile(String fbProfile) {
        this.fbProfile = fbProfile;
    }

    public String getGplusProfile() {
        return gplusProfile;
    }

    public void setGplusProfile(String gplusProfile) {
        this.gplusProfile = gplusProfile;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    public String getInstagramProfile() {
        return instagramProfile;
    }

    public void setInstagramProfile(String instagramProfile) {
        this.instagramProfile = instagramProfile;
    }



}
