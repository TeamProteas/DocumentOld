package com.nineleaps.DocumentManagementSystem.controller;

import com.nineleaps.DocumentManagementSystem.dto.StatusTableData;
import com.nineleaps.DocumentManagementSystem.service.Impl.StatusTableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatusTableController {
    @Autowired
    StatusTableImpl statusTableImpl;

    @GetMapping("v1/table")
    @ResponseBody
    public List<StatusTableData> getstatus() {
        System.out.println("StatusTable");
        return statusTableImpl.getTableData();
    }
}
