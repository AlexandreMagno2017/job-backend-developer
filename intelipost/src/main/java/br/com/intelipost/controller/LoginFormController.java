package br.com.intelipost.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.intelipost.constants.PagesConstants;
import br.com.intelipost.dto.LoginDTO;
import br.com.intelipost.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginFormController
{
    @Autowired
    private LoginService loginService;

    private static final String MODEL_ATTRIBUTE = "loginDTO";

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String newUser(Model model)
    {
        model.addAttribute(MODEL_ATTRIBUTE, new LoginDTO());
        return PagesConstants.LOGIN_FORM;
    }

    @RequestMapping(value = "/access", method = RequestMethod.POST)
    public String access(@Valid @ModelAttribute(MODEL_ATTRIBUTE) LoginDTO loginDTO, BindingResult results)
    {
        try
        {
            if (results.hasErrors())
                return PagesConstants.LOGIN_FORM;
            else
            {
                LoginDTO found = null;
                found = loginService.findUserByCredential(loginDTO);
                String redirect = (found != null) ? PagesConstants.RESULT : PagesConstants.ERROR_LOGIN;
                return redirect;
            }
        }
        catch (Exception e)
        {
            return PagesConstants.ERROR;
        }

    }
}
