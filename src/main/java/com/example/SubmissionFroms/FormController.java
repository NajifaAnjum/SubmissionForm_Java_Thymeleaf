package com.example.SubmissionFroms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/edureka")
    public String edureka(){
        return "edureka";
    }

    //edureka.html submitted information passing to ViewCustomers.html page
    @PostMapping("/details")
    public String viewdetails(@RequestParam("cid") String cid, @RequestParam("cname")String cname,
                              @RequestParam("cemail") String cemail, ModelMap modelMap)                //requesting the data
    {
        modelMap.put("cid", cid);                                                               //cid must be stored in cid
        modelMap.put("cname", cname);
        modelMap.put("cemail", cemail);
        return "ViewCustomers";
    }
}
