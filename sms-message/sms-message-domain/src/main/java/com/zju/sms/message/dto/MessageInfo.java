package com.zju.sms.message.dto;


import java.io.Serializable;
import java.util.Date;


public class MessageInfo implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String content;
    private String phone;
    private Integer number;
    private Date date;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
