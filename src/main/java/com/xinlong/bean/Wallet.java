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
@TableName("t_wallet")
public class Wallet extends Model<Wallet> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tuw_id", type = IdType.AUTO)
    private Long tuwId;
    private Long userId;
    private Long erAmount;
    private Long userForzon;


    public Long getTuwId() {
        return tuwId;
    }

    public void setTuwId(Long tuwId) {
        this.tuwId = tuwId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getErAmount() {
        return erAmount;
    }

    public void setErAmount(Long erAmount) {
        this.erAmount = erAmount;
    }

    public Long getUserForzon() {
        return userForzon;
    }

    public void setUserForzon(Long userForzon) {
        this.userForzon = userForzon;
    }

    @Override
    protected Serializable pkVal() {
        return this.tuwId;
    }

    @Override
    public String toString() {
        return "Wallet{" +
        ", tuwId=" + tuwId +
        ", userId=" + userId +
        ", erAmount=" + erAmount +
        ", userForzon=" + userForzon +
        "}";
    }
}
