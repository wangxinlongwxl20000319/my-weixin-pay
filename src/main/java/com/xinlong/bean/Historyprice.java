package com.xinlong.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@TableName("t_historyprice")
public class Historyprice extends Model<Historyprice> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "th_id", type = IdType.AUTO)
    private Long thId;
    private Long pid;
    private BigDecimal price;
    private Date startTime;
    private Date endTime;


    public Long getThId() {
        return thId;
    }

    public void setThId(Long thId) {
        this.thId = thId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.thId;
    }

    @Override
    public String toString() {
        return "Historyprice{" +
        ", thId=" + thId +
        ", pid=" + pid +
        ", price=" + price +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
