package com.bf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yangzengsen on 2017/9/27.
 */
@RestController
public class ClientController {

    @Autowired
    private FeignConsumerClient feignConsumerClient;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam(value = "id") Long id) {
        return feignConsumerClient.getUser(id);
    }
}
