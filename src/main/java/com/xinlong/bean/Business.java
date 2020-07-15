package com.xinlong.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@TableName("t_business")
public class Business extends Model<Business> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tbs_id", type = IdType.AUTO)
    private Long tbsId;
    private Long bisId;
    private String bisName;
    private String bisTel;
    private Integer bisFlag;
    private String bisEmail;
    private String bisAddr;


    public Long getTbsId() {
        return tbsId;
    }

    public void setTbsId(Long tbsId) {
        this.tbsId = tbsId;
    }

    public Long getBisId() {
        return bisId;
    }

    public void setBisId(Long bisId) {
        this.bisId = bisId;
    }

    public String getBisName() {
        return bisName;
    }

    public void setBisName(String bisName) {
        this.bisName = bisName;
    }

    public String getBisTel() {
        return bisTel;
    }

    public void setBisTel(String bisTel) {
        this.bisTel = bisTel;
    }

    public Integer getBisFlag() {
        return bisFlag;
    }

    public void setBisFlag(Integer bisFlag) {
        this.bisFlag = bisFlag;
    }

    public String getBisEmail() {
        return bisEmail;
    }

    public void setBisEmail(String bisEmail) {
        this.bisEmail = bisEmail;
    }

    public String getBisAddr() {
        return bisAddr;
    }

    public void setBisAddr(String bisAddr) {
        this.bisAddr = bisAddr;
    }

    @Override
    protected Serializable pkVal() {
        return this.tbsId;
    }

    @Override
    public String toString() {
        return "Business{" +
        ", tbsId=" + tbsId +
        ", bisId=" + bisId +
        ", bisName=" + bisName +
        ", bisTel=" + bisTel +
        ", bisFlag=" + bisFlag +
        ", bisEmail=" + bisEmail +
        ", bisAddr=" + bisAddr +
        "}";
    }
}
