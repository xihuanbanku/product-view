package com.xjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private IUserService userService;

    @RequestMapping("/select")
    public String selectUser() throws Exception {
        ModelAndView mv = new ModelAndView();
//        User user = userService.selectUser(1);
//        mv.addObject("user", user);
//        mv.setViewName("user");
        System.out.println("ok");
        return "user";
    }

    @RequestMapping("/use")
    @ResponseBody
    public String sUser() throws Exception {
        ModelAndView mv = new ModelAndView();
//        User user = userService.selectUser(1);
//        mv.addObject("user", user);
//        mv.setViewName("user");
        System.out.println("use");
        return "xxxx";
    }
}
