package com.zm.crm.crmbusiness.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商机表
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@TableName("tb_business")
@ApiModel(value = "Business对象", description = "商机表")
public class Business implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商机id")
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

    @ApiModelProperty("省")
    private String provinces;

    @ApiModelProperty("区")
    private String city;

    @ApiModelProperty("性别")
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

    @ApiModelProperty("课程")
    private Long courseId;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("职业")
    private String occupation;

    @ApiModelProperty("学历")
    private String education;

    @ApiModelProperty("在职情况")
    private String job;

    @ApiModelProperty("薪资")
    private String salary;

    @ApiModelProperty("专业")
    private String major;

    @ApiModelProperty("希望薪资")
    private String expectedSalary;

    @ApiModelProperty("学习原因")
    private String reasons;

    @ApiModelProperty("职业计划")
    private String plan;

    @ApiModelProperty("计划时间")
    private LocalDateTime planTime;

    @ApiModelProperty("其他意向")
    private String otherIntention;

    @ApiModelProperty("状态(已分配1  进行中2  回收3)")
    private String status;

    @ApiModelProperty("下次跟进时间")
    private LocalDateTime nextTime;

    @ApiModelProperty("最后更新时间")
    private LocalDateTime lastUpdateTime;

    @ApiModelProperty("线索ID")
    private Long clueId;

    @ApiModelProperty("是否转派")
    private String transfer;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("回收时间")
    private LocalDateTime endTime;

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
    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public String getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }
    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
    public LocalDateTime getPlanTime() {
        return planTime;
    }

    public void setPlanTime(LocalDateTime planTime) {
        this.planTime = planTime;
    }
    public String getOtherIntention() {
        return otherIntention;
    }

    public void setOtherIntention(String otherIntention) {
        this.otherIntention = otherIntention;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getNextTime() {
        return nextTime;
    }

    public void setNextTime(LocalDateTime nextTime) {
        this.nextTime = nextTime;
    }
    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public Long getClueId() {
        return clueId;
    }

    public void setClueId(Long clueId) {
        this.clueId = clueId;
    }
    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Business{" +
            "id=" + id +
            ", name=" + name +
            ", phone=" + phone +
            ", channel=" + channel +
            ", activityId=" + activityId +
            ", provinces=" + provinces +
            ", city=" + city +
            ", sex=" + sex +
            ", age=" + age +
            ", weixin=" + weixin +
            ", qq=" + qq +
            ", level=" + level +
            ", subject=" + subject +
            ", courseId=" + courseId +
            ", createBy=" + createBy +
            ", createTime=" + createTime +
            ", occupation=" + occupation +
            ", education=" + education +
            ", job=" + job +
            ", salary=" + salary +
            ", major=" + major +
            ", expectedSalary=" + expectedSalary +
            ", reasons=" + reasons +
            ", plan=" + plan +
            ", planTime=" + planTime +
            ", otherIntention=" + otherIntention +
            ", status=" + status +
            ", nextTime=" + nextTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", clueId=" + clueId +
            ", transfer=" + transfer +
            ", remark=" + remark +
            ", endTime=" + endTime +
        "}";
    }
}
