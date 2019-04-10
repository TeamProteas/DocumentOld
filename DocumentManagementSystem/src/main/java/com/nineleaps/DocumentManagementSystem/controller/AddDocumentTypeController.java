package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.exceptions.CustomResponse;
import com.nineleaps.DocumentManagementSystem.service.Impl.AddDocumentTypeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@Controller
public class AddDocumentTypeController {
    @Autowired
    AddDocumentTypeImpl addDocumentTypeImpl;

    @PostMapping("v1/doctype/add")
    public ResponseEntity<CustomResponse> getNewDoctype(@RequestParam("fieldType") String fileType, @RequestParam("displayName") String displayName) {
        return addDocumentTypeImpl.addDoctype(fileType, displayName);
    }
}