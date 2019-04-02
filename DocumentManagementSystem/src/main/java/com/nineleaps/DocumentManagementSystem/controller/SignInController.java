package com.nineleaps.DocumentManagementSystem.controller;


import com.nineleaps.DocumentManagementSystem.dto.SigninResponseData;
import com.nineleaps.DocumentManagementSystem.service.Impl.SigninServiceImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@CrossOrigin
@Controller
public class SignInController {
    @Autowired
    SigninServiceImpl impl;


    @ResponseBody
    @PostMapping("/v1/signin")
    public SigninResponseData signInRequest(@RequestBody String tokenData) throws IOException, ParseException {
        System.out.println("mukul");
        System.out.println("mukesh");
        return impl.tokenValidationreq(tokenData);

    }
}







