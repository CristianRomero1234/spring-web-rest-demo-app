package com.cristianromero.demo.controllers;

import com.cristianromero.demo.datasources.DemoDataAccessObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author cromero
 */
@Controller
public class DemoViewController {

    @Autowired
    private DemoDataAccessObject demoDataAccessObject;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        String result = "hola";
        return result;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("name", demoDataAccessObject.getFirstName());
        return "home.html";
    }
    @RequestMapping(value = "/test_table_crud", method = RequestMethod.GET)
    public String test_table_crud(ModelMap modelMap) {
        return "test_table_crud.html";
    }

}
