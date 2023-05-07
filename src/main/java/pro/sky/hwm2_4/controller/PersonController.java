package pro.sky.hwm2_4.controller;

import exeption.WrongLoginExeption;
import exeption.WrongPasswordExeption;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hwm2_4.InfoService;

@RestController
public class PersonController {
    @GetMapping("/person")
    public String info() {
        String str = null;
        try {
            InfoService.logIn("my_gmailcom", "123478", "1234");

        } catch (WrongLoginExeption | WrongPasswordExeption e) {
            str = " " + e.getMessage();
        }
        return "" + str + " ";
    }
}
