package homework.aop.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleLoginServiceImpl implements SimpleLoginService{
    @Override
    public void login(){System.out.println("로그인 했습니다.");}
    @Override
    public void logout(){System.out.println("로그아웃 했습니다.");}
}
