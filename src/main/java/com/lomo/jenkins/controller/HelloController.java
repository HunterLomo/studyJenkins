package com.lomo.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lomo
 **/
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

  @ResponseBody
  @RequestMapping(value = "/{name}")
  public String hello(@PathVariable(value = "name") String name) {
    System.out.println("=============");
    System.out.println(name);
    return String.format("Hello,%s",name);
  }
}
