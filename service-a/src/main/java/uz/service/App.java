package uz.service;

import uz.common.lib.dto.PersonDto;
import uz.common.lib.util.PasswordUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PersonDto person = new PersonDto(
                18,
                "John",
                "john@gmail.com",
                "hashPassword"
        );

        String decodedPassword = PasswordUtil.decodePassword(person.getPassword());
    }
}
