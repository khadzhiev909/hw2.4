package pro.sky.hwm2_4;

import exeption.WrongLoginExeption;
import exeption.WrongPasswordExeption;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    public static void logIn (String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordExeption {
        if (login.length() > 20)
            throw new WrongLoginExeption("Логин слишком длинный");
        if (!login.matches("[a-zA-z0-9_]+"))
            throw new WrongLoginExeption("В логине не допустимые символы");
        if(!password.matches("[a-zA-z0-9_]+") && !confirmPassword.matches("[a-zA-z0-9_]+"))
            throw new WrongPasswordExeption("В пороли не допустимые символы");
        if(password.length() > 20)
            throw new WrongPasswordExeption("Пороль слишком длинный");
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordExeption("Пороли не совпадают");
        }
    }
}
