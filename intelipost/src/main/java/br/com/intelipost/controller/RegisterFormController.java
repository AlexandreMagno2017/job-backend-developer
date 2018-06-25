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
public class RegisterFormController
{
    private static final String MODEL_ATTRIBUTE = "loginDTO";

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public String newUser(Model model)
    {
        model.addAttribute(MODEL_ATTRIBUTE, new LoginDTO());
        return PagesConstants.REGISTER_FORM;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String access(@Valid @ModelAttribute(MODEL_ATTRIBUTE) LoginDTO loginDTO, BindingResult results)
    {
        if (results.hasErrors())
            return PagesConstants.REGISTER_FORM;
        else
        {
            try
            {
                loginService.saveUser(loginDTO);
                return PagesConstants.SAVED_SUCCESS;
            }
            catch (Exception e)
            {
                return PagesConstants.ERROR;
            }
        }
    }
}
