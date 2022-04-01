package com.ch.controller;

import com.ch.service.UserService;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@Controller("transferController")
public class TransferController {
        @Resource(name = "userService")
        private UserService userService;
        public void transfer(){
                userService.transfer("tom","lucy",500.0);
        }


}
