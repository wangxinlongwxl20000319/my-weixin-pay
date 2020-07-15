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
@TableName("t_useradd")
public class Useradd extends Model<Useradd> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tua_id", type = IdType.AUTO)
    private Long tuaId;
    private Long userId;
    private String userAdd;


    public Long getTuaId() {
        return tuaId;
    }

    public void setTuaId(Long tuaId) {
        this.tuaId = tuaId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    @Override
    protected Serializable pkVal() {
        return this.tuaId;
    }

    @Override
    public String toString() {
        return "Useradd{" +
        ", tuaId=" + tuaId +
        ", userId=" + userId +
        ", userAdd=" + userAdd +
        "}";
    }
}
