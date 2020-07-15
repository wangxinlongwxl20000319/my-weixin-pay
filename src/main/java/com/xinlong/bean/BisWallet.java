package com.xinlong.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_bis_wallet")
public class BisWallet extends Model<BisWallet> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "tbw_id", type = IdType.AUTO)
    private Long tbwId;
    private Long disId;
    private BigDecimal disAmount;
    private BigDecimal disFzamount;


    public Long getTbwId() {
        return tbwId;
    }

    public void setTbwId(Long tbwId) {
        this.tbwId = tbwId;
    }

    public Long getDisId() {
        return disId;
    }

    public void setDisId(Long disId) {
        this.disId = disId;
    }

    public BigDecimal getDisAmount() {
        return disAmount;
    }

    public void setDisAmount(BigDecimal disAmount) {
        this.disAmount = disAmount;
    }

    public BigDecimal getDisFzamount() {
        return disFzamount;
    }

    public void setDisFzamount(BigDecimal disFzamount) {
        this.disFzamount = disFzamount;
    }

    @Override
    protected Serializable pkVal() {
        return this.tbwId;
    }

    @Override
    public String toString() {
        return "BisWallet{" +
        ", tbwId=" + tbwId +
        ", disId=" + disId +
        ", disAmount=" + disAmount +
        ", disFzamount=" + disFzamount +
        "}";
    }
}
