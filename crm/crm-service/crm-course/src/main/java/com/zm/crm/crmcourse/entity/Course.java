package com.zm.crm.crmcourse.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 课程管理
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@TableName("tb_course")
@ApiModel(value = "Course对象", description = "课程管理")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("课程id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("代码")
    private String code;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("学科")
    private String subject;

    @ApiModelProperty("价格")
    private Integer price;

    @ApiModelProperty("适应人群")
    private String applicablePerson;

    @ApiModelProperty("课程描述信息")
    private String info;

    private LocalDateTime createTime;

    @ApiModelProperty("是否删除 1 是")
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getApplicablePerson() {
        return applicablePerson;
    }

    public void setApplicablePerson(String applicablePerson) {
        this.applicablePerson = applicablePerson;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Course{" +
            "id=" + id +
            ", code=" + code +
            ", name=" + name +
            ", subject=" + subject +
            ", price=" + price +
            ", applicablePerson=" + applicablePerson +
            ", info=" + info +
            ", createTime=" + createTime +
            ", isDelete=" + isDelete +
        "}";
    }
}
