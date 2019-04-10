package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.service.Impl.CheckStatusImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
public class CheckStatusController {

    @Autowired
    CheckStatusImpl checkStatusImpl;

    @RequestMapping("/v1/chkstatus")
    public String status(@RequestParam("name")String name, @RequestParam("documentname")String documentname) throws IOException, ParseException {
        return checkStatusImpl.checkStatus(name,documentname);
    }
}
