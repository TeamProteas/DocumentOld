package com.nineleaps.DocumentManagementSystem.controller;


import com.nineleaps.DocumentManagementSystem.dto.SigninResponseData;
import com.nineleaps.DocumentManagementSystem.dto.TokenData;
import com.nineleaps.DocumentManagementSystem.service.Impl.SigninServiceImpl;


import java.io.IOException;
import java.text.ParseException;


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

}}







