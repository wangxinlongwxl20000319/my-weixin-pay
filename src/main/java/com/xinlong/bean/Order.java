package com.xinlong.bean;

import com.baomidou.mybatisplus.annotation.*;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@Data
@TableName("t_order")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "to_id", type = IdType.AUTO)
    private Long toId;
    private Long orderId;
    private Long userId;
    private Long orderPrice;
    private Long orderFlag;
    private String orderUser;
    private String orderTel;
    private String orderAddr;
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;
     @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;
     @Version
     private Long version;
     @TableLogic
     private Long deleted;



    @Override
    protected Serializable pkVal() {
        return this.toId;
    }

}
