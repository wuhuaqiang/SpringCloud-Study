package com.bf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by yangzengsen on 2017/9/27.
 */

@Slf4j
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/show", method = {RequestMethod.POST})
    @ResponseBody
    public UserDao show(@RequestParam(value="id") Long id) {
        System.out.println("====" + id + "====");
        ServiceInstance instance = client.getLocalServiceInstance();
        UserDao dao = new UserDao();
        dao.setId(id);
        dao.setName("scott");
        dao.setBirthday(new Date());
        return dao;
    }
}
