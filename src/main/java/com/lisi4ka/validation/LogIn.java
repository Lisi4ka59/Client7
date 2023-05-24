package com.lisi4ka.validation;

import com.lisi4ka.utils.PackagedCommand;

import static com.lisi4ka.common.PasswordConverter.convert;
import static com.lisi4ka.utils.Checker.inputStringNotNull;

public class LogIn {
    public PackagedCommand packagedCommand(){
        String login = inputStringNotNull("Enter login: ");
        String password = convert(inputStringNotNull("Enter password: "));
        return new PackagedCommand("login", login + "@" + password);
    }
}
