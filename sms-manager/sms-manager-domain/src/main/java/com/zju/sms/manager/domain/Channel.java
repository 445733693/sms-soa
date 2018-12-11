package com.zju.sms.manager.domain;

import java.io.Serializable;

public class Channel implements Serializable {
    private Integer id;

    private String name;

    private String costNumber;

    private String uid;

    private String pwd;

    private String url;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCostNumber() {
        return costNumber;
    }

    public void setCostNumber(String costNumber) {
        this.costNumber = costNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}