package homework.aop.controller;

import homework.aop.service.PrintAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/articles")
public class AccessArticleController {
    private PrintAccessService printAccessService;

    @Autowired
    public void setPrintAccess(PrintAccessService printAccessService){
        this.printAccessService = printAccessService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String accessArticle(@PathVariable String id, Model model){
        model.addAttribute("id", id);
        printAccessService.printAccess(id);
        return "article";
    }
}
