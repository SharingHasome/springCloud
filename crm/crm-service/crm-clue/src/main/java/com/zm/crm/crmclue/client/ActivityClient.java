package com.zm.crm.crmclue.client;

import com.zm.crm.crmclue.other.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "crm-activity",fallback = ActivityRemoteClientFallback.class)
public interface ActivityClient {
    @GetMapping(value = "/activity/selectAll")
    R selectAll();
}
