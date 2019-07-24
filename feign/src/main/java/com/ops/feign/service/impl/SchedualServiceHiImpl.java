package com.ops.feign.service.impl;

import com.ops.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @date: 2019/7/24
 * @description:
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayhiFromClientOne(String name) {
        return "sorry "+name;
    }
}
