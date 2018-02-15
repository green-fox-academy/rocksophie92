package com.sophiecodes.matchmakertinder.models;

import android.media.Image;

/**
 * Created by Admin on 2/13/2018.
 */

public class Apprentice {

    private String name;
    private String language;
    private String cohort;
    private int resId;

    public Apprentice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
