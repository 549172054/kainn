package com.aqhg.openplatform.demo.web.dubbo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.aqhg.openplatform.demo.web.dubbo.provider.ProviderService;

import java.util.Date;


/**
 * @author Kain  <xianren@aiqinhaigou.com>
 * @date 2019/2/13
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String testProvider(String str) {
        return str + new Date().toString();
    }
}
