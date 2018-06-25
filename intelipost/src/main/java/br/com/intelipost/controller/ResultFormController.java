package br.com.intelipost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.intelipost.dto.LoginDTO;
import br.com.intelipost.service.LoginService;

@Controller
@RequestMapping("/")
public class ResultFormController
{    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsers() {

        List<LoginDTO> users = loginService.getAllUsers();
        ModelAndView model = new ModelAndView("resultForm");
        model.addObject("users", users);
        return model;
    }

}
