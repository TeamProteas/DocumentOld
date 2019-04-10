package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.service.Impl.DigitalSignImpl;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin
@RestController
public class DigitalSignController {

    @Autowired
    DigitalSignImpl digitalSignImpl;

    @PostMapping("/v1/dsign")
    public void digitalSign(@RequestParam("signeeEmailId") String signeeEmailId, @RequestParam("signeeName") String signeeName, @RequestParam("name")String name, @RequestParam("file") MultipartFile file, @RequestParam("documentName")String documentName) throws IOException, ParseException {
        try {
            digitalSignImpl.sendSignRequest(signeeEmailId,signeeName,name,file,documentName);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
