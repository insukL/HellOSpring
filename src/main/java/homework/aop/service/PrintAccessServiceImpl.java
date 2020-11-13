package homework.aop.service;

import org.springframework.stereotype.Service;

@Service
public class PrintAccessServiceImpl implements PrintAccessService {
    @Override
    public void printAccess(Object id){
        System.out.println(id + "번 게시물에 접근");
    }
}
