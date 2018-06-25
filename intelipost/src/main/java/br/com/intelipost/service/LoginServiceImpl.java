package br.com.intelipost.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelipost.converter.LoginConverter;
import br.com.intelipost.dto.LoginDTO;
import br.com.intelipost.entities.LoginEntity;
import br.com.intelipost.repository.LoginRepository;

@Service("loginService")
public class LoginServiceImpl implements LoginService
{
    @Autowired
    private LoginRepository loginRepository;

    @Override
    public LoginDTO getUserById(Integer userId)
    {
        return LoginConverter.entityToDto(loginRepository.getOne(userId));
    }

    @Override
    public LoginDTO findUserByCredential(LoginDTO loginDTO)
    {
        LoginDTO dto = null;
        try
        {
            LoginEntity entity = loginRepository.findByUserAndPassword(loginDTO.getUser(), loginDTO.getPassword());
            if (entity != null)
            {
                dto = LoginConverter.entityToDto(entity);
            }
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        return dto;
    }

    @Override
    public void saveUser(LoginDTO loginDTO)
    {
        loginRepository.save(LoginConverter.dtoToEntity(loginDTO));
    }

    @Override
    public List<LoginDTO> getAllUsers()
    {
        return loginRepository.findAll().stream().map(LoginConverter::entityToDto).collect(Collectors.toList());
    }
}
