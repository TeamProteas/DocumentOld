package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.dao.DocumentType;
import com.nineleaps.DocumentManagementSystem.service.Impl.DocumentTypeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class DocumentTypeController {

    @Autowired
    DocumentTypeImpl documentTypeImpl;

    @ResponseBody
    @GetMapping("/v1/doctype")
    public List<DocumentType> getTypes() {
        System.out.println("DOCUMENTTYPE:");

        return documentTypeImpl.fetchTypeOfDocument();
    }
}
