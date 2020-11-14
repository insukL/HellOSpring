package homework.aop.controller;

import homework.aop.service.SimpleLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleLoginController {
    private SimpleLoginService simpleLoginService;

    @Autowired
    public void setSimpleLoginService(SimpleLoginService simpleLoginService){
        this.simpleLoginService = simpleLoginService;
    }

    @RequestMapping("/login")
    public String login(){
        simpleLoginService.login();
        return "login";
    }
    @RequestMapping("/logout")
    public String logout(){
        simpleLoginService.logout();
        return "logout";
    }

}
