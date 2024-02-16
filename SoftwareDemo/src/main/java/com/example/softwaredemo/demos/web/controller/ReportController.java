package com.example.softwaredemo.demos.web.controller;

import com.example.softwaredemo.demos.web.pojo.HouseInfo;
import com.example.softwaredemo.demos.web.pojo.Report;
import com.example.softwaredemo.demos.web.service.HouseInfoService;
import com.example.softwaredemo.demos.web.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping("/insert")
    public ResponseEntity<Void> insertHouseInfo(
            @RequestParam(name="userId") int userId,
            @RequestParam(name = "houseId") int houseId,
            @RequestParam(name = "type") String type,
            @RequestParam(name = "content") String content) {

        Report report = new Report();
        report.setUserId(userId);
        report.setHouseId(houseId);
        report.setType(type);
        report.setContent(content);

        reportService.insertReport(report);
        System.out.println("111");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
