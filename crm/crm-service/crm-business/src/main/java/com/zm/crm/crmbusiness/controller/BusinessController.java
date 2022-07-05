package com.zm.crm.crmbusiness.controller;

import com.zm.crm.crmbusiness.other.R;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import com.zm.crm.crmbusiness.entity.Business;
import com.zm.crm.crmbusiness.service.IBusinessService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商机表 前端控制器
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@RestController
@RequestMapping("/business")
public class BusinessController {
    /**
    * 服务对象
    */
    @Resource
    private IBusinessService businessService;

    /**
    * 分页查询所有数据
    *
    * @param page 分页对象
    * @param business 查询实体
    * @return 所有数据
    */
    @GetMapping
    public R selectAll(Page<Business> page, Business business) {
        return R.ok(this.businessService.page(page, new LambdaQueryWrapper<>(business)));
    }

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok(this.businessService.getById(id));
    }

    /**
    * 新增数据
    *
    * @param business 实体对象
    * @return 新增结果
    */
    @PostMapping
    public R insert(@RequestBody Business business) {
        return R.ok(this.businessService.save(business));
    }

    /**
    * 修改数据
    *
    * @param business 实体对象
    * @return 修改结果
    */
    @PutMapping
    public R update(@RequestBody Business business) {
        return R.ok(this.businessService.updateById(business));
    }

    /**
    * 删除数据
    *
    * @param idList 主键结合
    * @return 删除结果
    */
    @DeleteMapping("{idList}")
    public R delete(@PathVariable("idList") List<Serializable> idList) {
        return R.ok(this.businessService.removeByIds(idList));
    }
}
