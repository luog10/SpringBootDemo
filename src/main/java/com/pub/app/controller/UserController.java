package com.pub.app.controller;

import com.pub.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("User")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value={"/GetAllUser"},method= RequestMethod.GET)
    public String selectUser(Model model) {
        model.addAttribute("users",userService.selectAllUser());
        return "user/list";
    }

    @RequestMapping(value={"/GetUserBySysNo"},method= RequestMethod.GET)
    public String selectUserById(int sysno,Model model) {
        model.addAttribute("user",userService.selectUserbyUserSysNo(sysno));
        return "user/detail";
    }
}
