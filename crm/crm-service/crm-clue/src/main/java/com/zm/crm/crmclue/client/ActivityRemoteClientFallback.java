package com.zm.crm.crmclue.client;

import com.zm.crm.crmclue.other.R;
import org.springframework.stereotype.Component;

@Component
public class ActivityRemoteClientFallback implements ActivityClient{
    @Override
    public R selectAll() {
        return R.error("服务正忙，qing稍后再访问<熔断降级>");
    }
}
