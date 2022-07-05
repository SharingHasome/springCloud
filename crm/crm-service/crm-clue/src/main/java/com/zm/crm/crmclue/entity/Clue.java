package com.zm.crm.crmclue.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 线索
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@TableName("tb_clue")
@ApiModel(value = "Clue对象", description = "线索")
public class Clue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("线索id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("客户姓名")
    private String name;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("渠道")
    private String channel;

    @ApiModelProperty("活动id")
    private Long activityId;

    @ApiModelProperty("1 男 0 女")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("微信")
    private String weixin;

    @ApiModelProperty("qq")
    private String qq;

    @ApiModelProperty("意向等级")
    private String level;

    @ApiModelProperty("意向学科")
    private String subject;

    @ApiModelProperty("状态(已分配1  进行中2  回收3  伪线索4)")
    private String status;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("伪线索失败次数(最大数3次)")
    private Integer falseCount;

    private LocalDateTime nextTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("是否转派")
    private String transfer;

    @ApiModelProperty("线索失效时间")
    private LocalDateTime endTime;
    @TableField(exist = false)
    private String activityName;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

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
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public Integer getFalseCount() {
        return falseCount;
    }

    public void setFalseCount(Integer falseCount) {
        this.falseCount = falseCount;
    }
    public LocalDateTime getNextTime() {
        return nextTime;
    }

    public void setNextTime(LocalDateTime nextTime) {
        this.nextTime = nextTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Clue{" +
            "id=" + id +
            ", name=" + name +
            ", phone=" + phone +
            ", channel=" + channel +
            ", activityId=" + activityId +
            ", sex=" + sex +
            ", age=" + age +
            ", weixin=" + weixin +
            ", qq=" + qq +
            ", level=" + level +
            ", subject=" + subject +
            ", status=" + status +
            ", createTime=" + createTime +
            ", createBy=" + createBy +
            ", falseCount=" + falseCount +
            ", nextTime=" + nextTime +
            ", updateTime=" + updateTime +
            ", transfer=" + transfer +
            ", endTime=" + endTime +
        "}";
    }
}
