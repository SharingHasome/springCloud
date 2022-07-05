package com.zm.crm.crmactivity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 活动管理
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@TableName("tb_activity")
@ApiModel(value = "Activity对象", description = "活动管理")
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("活动名称")
    private String name;

    @ApiModelProperty("渠道来源")
    private String channel;

    @ApiModelProperty("活动简介")
    private String info;

    @ApiModelProperty("活动类型1折扣2代金券")
    private String type;

    @ApiModelProperty("折扣")
    private Float discount;

    @ApiModelProperty("课程代金券")
    private Integer vouchers;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("开始时间")
    private LocalDateTime beginTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("活动编码")
    private String code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
    public Integer getVouchers() {
        return vouchers;
    }

    public void setVouchers(Integer vouchers) {
        this.vouchers = vouchers;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Activity{" +
            "id=" + id +
            ", name=" + name +
            ", channel=" + channel +
            ", info=" + info +
            ", type=" + type +
            ", discount=" + discount +
            ", vouchers=" + vouchers +
            ", status=" + status +
            ", beginTime=" + beginTime +
            ", endTime=" + endTime +
            ", createTime=" + createTime +
            ", code=" + code +
        "}";
    }
}
