package com.zm.crm.crmclue.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zm.crm.crmclue.client.ActivityClient;
import com.zm.crm.crmclue.entity.ActivityVo;
import com.zm.crm.crmclue.entity.Clue;
import com.zm.crm.crmclue.mapper.ClueMapper;
import com.zm.crm.crmclue.other.R;
import com.zm.crm.crmclue.service.IClueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 * 线索 服务实现类
 * </p>
 *
 * @author john.yi@qq.com
 * @since 2022-06-25
 */
@Service
@Slf4j
public class ClueServiceImpl extends ServiceImpl<ClueMapper, Clue> implements IClueService {
    @Autowired
    private RestTemplate restTemplate;
    @Resource
    private ActivityClient activityClient;
    @Override
    public Page<Clue> page(Page<Clue> cluePage, Clue clue) {
        Page page = this.page(cluePage, new LambdaQueryWrapper(clue));
        Map<Long,String> activityMap=getActivityMap(getActivityList());
        setActivityName(cluePage.getRecords(),activityMap);
        return page;
    }

    private void setActivityName(List<Clue> records, Map<Long, String> map) {
        records.forEach(clue->{
            clue.setActivityName(map.get(clue.getActivityId()));
        });
    }

    private Map<Long, String> getActivityMap(List<ActivityVo> activityList) {
        Map<Long,String> map = new HashMap<>();
        activityList.forEach(item->map.put(item.getId(),item.getName()));
        return map;
    }

    private List<ActivityVo> getActivityList() {
        List<ActivityVo> resultList =new ArrayList<>();
//        String url="http://crm-activity/activity/selectAll";
        R r = activityClient.selectAll();
//        Map<String,Object> result =restTemplate.getForObject(url, Map.class);
//        if(log.isDebugEnabled()){
//            log.debug("result:{}",result);
//        }
        String code =String.valueOf(r.getCode());
        if(code.equals("200")){
            List<LinkedHashMap> list = (List<LinkedHashMap>) r.getData();
            for (LinkedHashMap linkedHashMap : list) {
                ActivityVo vo =new ActivityVo();
                vo.setId(Long.valueOf(linkedHashMap.get("id").toString()));
                vo.setName(linkedHashMap.get("name").toString());
                resultList.add(vo);
            }
        }else{
            log.error("请求服务异常：{}",r.getMsg());
        }
        return resultList;
    }
}
