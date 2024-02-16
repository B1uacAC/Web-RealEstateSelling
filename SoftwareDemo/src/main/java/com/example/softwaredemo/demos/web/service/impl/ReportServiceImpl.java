package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.mapper.ReportMapper;
import com.example.softwaredemo.demos.web.pojo.Report;
import com.example.softwaredemo.demos.web.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;
    @Override
    public void insertReport(Report report) {
        reportMapper.insertReport(report);
    }
}
