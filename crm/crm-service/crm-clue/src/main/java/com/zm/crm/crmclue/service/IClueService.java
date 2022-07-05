package com.zm.crm.crmclue.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zm.crm.crmclue.entity.Clue;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zm.crm.crmclue.other.R;

/**
 * <p>
 * 线索 服务类
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
public interface IClueService extends IService<Clue> {
    Page<Clue>  page(Page<Clue> page,Clue clue);
}
