package br.com.intelipost.converter;

import br.com.intelipost.dto.LoginDTO;
import br.com.intelipost.entities.LoginEntity;

public class LoginConverter
{
    public static LoginEntity dtoToEntity(LoginDTO loginDTO)
    {
        LoginEntity entity = new LoginEntity();
        entity.setUser(loginDTO.getUser());
        entity.setPassword(loginDTO.getPassword());
        return entity;
    }

    public static LoginDTO entityToDto(LoginEntity login)
    {
        return new LoginDTO(login.getUser(), login.getPassword());
    }
}
