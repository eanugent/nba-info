package com.csreview.nbainfo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbaInfoController {
  
  @RequestMapping("/test")
  public String TestAction(){
    return "I am testing it";
  }
}
