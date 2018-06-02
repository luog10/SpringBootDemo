package com.pub.app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    public int getSysNo() {
        return SysNo;
    }

    public void setSysNo(int sysNo) {
        SysNo = sysNo;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getPsw() {
        return Psw;
    }

    public void setPsw(String psw) {
        Psw = psw;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Date  getIndate() {
        return  Indate;
    }

    public String  getIndateTxt() {
        return  df.format(Indate);
    }

    public void setIndete(Date indate) {
        Indate = indate;
    }

    public int getInUserSysNo() {
        return InUserSysNo;
    }

    public void setInUserSysNo(int inUserSysNo) {
        InUserSysNo = inUserSysNo;
    }

    public Date getEditDate() {
        return  EditDate;
    }

    public String getEditDateTxt() {
        return  df.format(EditDate);
    }

    public void setEditDate(Date editDate) {
        EditDate = editDate;
    }

    public int getEditUserSysno() {
        return EditUserSysno;
    }

    public void setEditUserSysno(int editUserSysno) {
        EditUserSysno = editUserSysno;
    }

    private int SysNo;
    private String UserName;
    private String UserID;
    private String Psw;
    private int Status;
    private Date Indate;
    private int InUserSysNo;
    private Date EditDate;
    private int EditUserSysno;

    @Override
    public String toString() {
        return "SysNo=" + SysNo +
                "，UserName=" + UserName +
                ", UserID='" + UserID +
                ", Indete=" + Indate.toString();
    }
}
