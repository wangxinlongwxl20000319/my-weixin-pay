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
@TableName("t_orderinfo")
public class Orderinfo extends Model<Orderinfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "toi_id", type = IdType.AUTO)
    private Long toiId;
    private Long orderId;
    private Long proId;


    public Long getToiId() {
        return toiId;
    }

    public void setToiId(Long toiId) {
        this.toiId = toiId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    @Override
    protected Serializable pkVal() {
        return this.toiId;
    }

    @Override
    public String toString() {
        return "Orderinfo{" +
        ", toiId=" + toiId +
        ", orderId=" + orderId +
        ", proId=" + proId +
        "}";
    }
}
