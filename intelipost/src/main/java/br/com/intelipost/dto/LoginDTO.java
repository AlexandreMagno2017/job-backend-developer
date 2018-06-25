package br.com.intelipost.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginDTO
{
    @NotBlank(message = "user can't left blank")
    @Size(min = 2, max = 20, message = "name must have min length of 2, and max of 20")
    @Pattern(regexp = "^[\\p{Alnum}\\s]+$", message = "name can only contain alpha numeric characters and spaces")
    private String user;

    @NotBlank(message = "user can't left blank")
    @Size(min = 2, max = 20, message = "name must have min length of 2, and max of 20")
    @Pattern(regexp = "^[\\p{Alnum}\\s]+$", message = "name can only contain alpha numeric characters and spaces")
    private String password;

    public LoginDTO()
    {
        // TODO Auto-generated constructor stub
    }
    /**
     * @param user
     * @param password
     */
    public LoginDTO(String user, String password)
    {
        setUser(user);
        setPassword(password);
    }

    /**
     * @return the user
     */
    public String getUser()
    {
        return user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(String user)
    {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
}
