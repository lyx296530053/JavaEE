package cn.lyx.controller;

import cn.lyx.service.impl.AccountServiceImply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource(name = "accountService")
    private AccountServiceImply serviceImply;
    @RequestMapping("/findAll")
    public String findAll() {
        serviceImply.findAll();
        return "success";
    }
}
