package com.bf;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yangzengsen on 2017/9/27.
 */
@Component
public class FeignConsumerClientHystrix implements FeignConsumerClient{

    @Override
    public String getUser(@RequestParam("id") Long id) {
        return "error";
    }
}
