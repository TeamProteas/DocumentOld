package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.service.Impl.GetFileImpl;
import okio.ByteString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@CrossOrigin
@RestController
public class GetFileController {

    @Autowired
    GetFileImpl getFileImpl;

    @RequestMapping("/v1/getFile")
    public ByteString getFile(@RequestParam("name")String name, @RequestParam("documentname")String documentname) throws IOException {

        getFileImpl.getFile(name,documentname);
        return null;
    }

}
