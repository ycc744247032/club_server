package com.sshy.club.entity.RYTreasure;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohualuo
 * @since 2019-12-19
 */
public class ConfineAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址字符
     */
    private String AddrString;
    /**
     * 限制登陆
     */
    private Boolean EnjoinLogon;
    /**
     * 过期时间
     */
    private Date EnjoinOverDate;
    /**
     * 收集日期
     */
    private Date CollectDate;
    /**
     * 输入备注
     */
    private String CollectNote;


    public String getAddrString() {
        return AddrString;
    }

    public void setAddrString(String AddrString) {
        this.AddrString = AddrString;
    }

    public Boolean getEnjoinLogon() {
        return EnjoinLogon;
    }

    public void setEnjoinLogon(Boolean EnjoinLogon) {
        this.EnjoinLogon = EnjoinLogon;
    }

    public Date getEnjoinOverDate() {
        return EnjoinOverDate;
    }

    public void setEnjoinOverDate(Date EnjoinOverDate) {
        this.EnjoinOverDate = EnjoinOverDate;
    }

    public Date getCollectDate() {
        return CollectDate;
    }

    public void setCollectDate(Date CollectDate) {
        this.CollectDate = CollectDate;
    }

    public String getCollectNote() {
        return CollectNote;
    }

    public void setCollectNote(String CollectNote) {
        this.CollectNote = CollectNote;
    }

    @Override
    public String toString() {
        return "ConfineAddress{" +
        ", AddrString=" + AddrString +
        ", EnjoinLogon=" + EnjoinLogon +
        ", EnjoinOverDate=" + EnjoinOverDate +
        ", CollectDate=" + CollectDate +
        ", CollectNote=" + CollectNote +
        "}";
    }
}
