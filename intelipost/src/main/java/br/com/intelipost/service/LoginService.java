package br.com.intelipost.service;

import java.util.List;

import br.com.intelipost.dto.LoginDTO;

public interface LoginService
{
    LoginDTO getUserById(Integer userId);

    LoginDTO findUserByCredential(LoginDTO loginDTO);

    void saveUser(LoginDTO loginDTO);

    List<LoginDTO> getAllUsers();
}
