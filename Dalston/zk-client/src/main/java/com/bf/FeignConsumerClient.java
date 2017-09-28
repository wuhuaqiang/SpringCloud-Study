package com.bf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yangzengsen on 2017/9/27.
 */
@Component
@FeignClient(value="zk-service2",fallback=FeignConsumerClientHystrix.class)
public interface FeignConsumerClient {

    @RequestMapping(method = RequestMethod.POST, value = "/show")
    public String getUser(@RequestParam(value = "id") Long id);

}
