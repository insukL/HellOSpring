package homework.aop.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class FindElementServiceImpl implements FindElementService {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    public FindElementServiceImpl(){
        for(int i = 0; i < 100; i++){
            arr.add(i);
        }
    }

    @Override
    public String linearSearch(int key) {
        return key + " is " + arr.indexOf(key) +"element in List";
    }

    @Override
    public String binarySearch(int key) {
        return key + " is " + Collections.binarySearch(arr, key) +"element in List";
    }
}
