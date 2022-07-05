package com.zm.crm.crmcourse.controller;

import com.zm.crm.crmcourse.other.R;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import com.zm.crm.crmcourse.entity.Course;
import com.zm.crm.crmcourse.service.ICourseService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程管理 前端控制器
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@RestController
@RequestMapping("/course")
public class CourseController {
    /**
    * 服务对象
    */
    @Resource
    private ICourseService courseService;

    /**
    * 分页查询所有数据
    *
    * @param page 分页对象
    * @param course 查询实体
    * @return 所有数据
    */
    @GetMapping
    public R selectAll(Page<Course> page, Course course) {
        return R.ok(this.courseService.page(page, new LambdaQueryWrapper<>(course)));
    }

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok(this.courseService.getById(id));
    }

    /**
    * 新增数据
    *
    * @param course 实体对象
    * @return 新增结果
    */
    @PostMapping
    public R insert(@RequestBody Course course) {
        return R.ok(this.courseService.save(course));
    }

    /**
    * 修改数据
    *
    * @param course 实体对象
    * @return 修改结果
    */
    @PutMapping
    public R update(@RequestBody Course course) {
        return R.ok(this.courseService.updateById(course));
    }

    /**
    * 删除数据
    *
    * @param idList 主键结合
    * @return 删除结果
    */
    @DeleteMapping("{idList}")
    public R delete(@PathVariable("idList") List<Serializable> idList) {
        return R.ok(this.courseService.removeByIds(idList));
    }
}
