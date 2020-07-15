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
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tu_id", type = IdType.AUTO)
    private Long tuId;
    private Long userId;
    private String userNickna;
    private String userPwd;
    private String userEmail;
    private String userTel;
    private Integer userFlag;


    public Long getTuId() {
        return tuId;
    }

    public void setTuId(Long tuId) {
        this.tuId = tuId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNickna() {
        return userNickna;
    }

    public void setUserNickna(String userNickna) {
        this.userNickna = userNickna;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Integer getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(Integer userFlag) {
        this.userFlag = userFlag;
    }

    @Override
    protected Serializable pkVal() {
        return this.tuId;
    }

    @Override
    public String toString() {
        return "User{" +
        ", tuId=" + tuId +
        ", userId=" + userId +
        ", userNickna=" + userNickna +
        ", userPwd=" + userPwd +
        ", userEmail=" + userEmail +
        ", userTel=" + userTel +
        ", userFlag=" + userFlag +
        "}";
    }
}
