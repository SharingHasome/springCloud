package com.zm.crm.crmactivity.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zm.crm.crmactivity.other.R;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import com.zm.crm.crmactivity.entity.Activity;
import com.zm.crm.crmactivity.service.IActivityService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 活动管理 前端控制器
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {
    /**
    * 服务对象
    */
    @Resource
    private IActivityService activityService;
    @GetMapping("/selectAll")



    @SentinelResource(value = "activity-selectAll",blockHandler = "handleException")
    public R selectAll() {
        return R.ok(this.activityService.list());
    }

    public R handleException(BlockException ex){
        return R.error("selectAll服务被限流了");
    }

    /**
    * 分页查询所有数据
    *
    * @param page 分页对象
    * @param activity 查询实体
    * @return 所有数据
    */
    @GetMapping
    public R selectAll(Page<Activity> page, Activity activity) {
        return R.ok(this.activityService.page(page, new LambdaQueryWrapper<>(activity)));
    }

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok(this.activityService.getById(id));
    }

    /**
    * 新增数据
    *
    * @param activity 实体对象
    * @return 新增结果
    */
    @PostMapping
    public R insert(@RequestBody Activity activity) {
        return R.ok(this.activityService.save(activity));
    }

    /**
    * 修改数据
    *
    * @param activity 实体对象
    * @return 修改结果
    */
    @PutMapping
    public R update(@RequestBody Activity activity) {
        return R.ok(this.activityService.updateById(activity));
    }

    /**
    * 删除数据
    *
    * @param idList 主键结合
    * @return 删除结果
    */
    @DeleteMapping("{idList}")
    public R delete(@PathVariable("idList") List<Serializable> idList) {
        return R.ok(this.activityService.removeByIds(idList));
    }
}
