package homework.aop.controller;

import homework.aop.service.FindElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/element"})
public class FindElementController {
    @Autowired
    FindElementService findElementService;

    @RequestMapping(value = {"/linear/{key}"}, method = RequestMethod.GET)
    public ResponseEntity linearSearch(@PathVariable Integer key){
        return new ResponseEntity(findElementService.linearSearch(key), HttpStatus.OK);
    }

    @RequestMapping(value = {"/binary/{key}"}, method = RequestMethod.GET)
    public ResponseEntity binarySearch(@PathVariable Integer key){
        return new ResponseEntity(findElementService.binarySearch(key), HttpStatus.OK);
    }
}
