package com.example.administrator.safecook.domain;

import cn.bmob.v3.BmobInstallation;

/**
 * Created by Administrator on 2016/7/27.
 */
public class MyInstallation extends BmobInstallation{
    String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
