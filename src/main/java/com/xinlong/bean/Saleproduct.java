package com.xinlong.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@TableName("t_saleproduct")
public class Saleproduct extends Model<Saleproduct> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tbs_id", type = IdType.AUTO)
    private Long tbsId;
    private Long pid;
    private String pname;
    private BigDecimal price;
    private Long salecount;
    private Long saingprice;


    public Long getTbsId() {
        return tbsId;
    }

    public void setTbsId(Long tbsId) {
        this.tbsId = tbsId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSalecount() {
        return salecount;
    }

    public void setSalecount(Long salecount) {
        this.salecount = salecount;
    }

    public Long getSaingprice() {
        return saingprice;
    }

    public void setSaingprice(Long saingprice) {
        this.saingprice = saingprice;
    }

    @Override
    protected Serializable pkVal() {
        return this.tbsId;
    }

    @Override
    public String toString() {
        return "Saleproduct{" +
        ", tbsId=" + tbsId +
        ", pid=" + pid +
        ", pname=" + pname +
        ", price=" + price +
        ", salecount=" + salecount +
        ", saingprice=" + saingprice +
        "}";
    }
}
