package com.zm.crm.crmclue.controller;

import com.zm.crm.crmclue.other.R;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import com.zm.crm.crmclue.entity.Clue;
import com.zm.crm.crmclue.service.IClueService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 线索 前端控制器
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@RestController
@RequestMapping("/clue")
public class ClueController {
    /**
    * 服务对象
    */
    @Resource
    private IClueService clueService;

    /**
    * 分页查询所有数据
    *
    * @param page 分页对象
    * @param clue 查询实体
    * @return 所有数据
    */
    @GetMapping
    public  R selectAll(Page<Clue> page, Clue clue) {
        return R.ok(this.clueService.page(page,clue));
    }

    /**
    * 通过主键查询单条数据
    *
    * @param id 主键
    * @return 单条数据
    */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return R.ok(this.clueService.getById(id));
    }

    /**
    * 新增数据
    *
    * @param clue 实体对象
    * @return 新增结果
    */
    @PostMapping
    public R insert(@RequestBody Clue clue) {
        return R.ok(this.clueService.save(clue));
    }

    /**
    * 修改数据
    *
    * @param clue 实体对象
    * @return 修改结果
    */
    @PutMapping
    public R update(@RequestBody Clue clue) {
        return R.ok(this.clueService.updateById(clue));
    }

    /**
    * 删除数据
    *
    * @param idList 主键结合
    * @return 删除结果
    */
    @DeleteMapping("{idList}")
    public R delete(@PathVariable("idList") List<Serializable> idList) {
        return R.ok(this.clueService.removeByIds(idList));
    }
}
