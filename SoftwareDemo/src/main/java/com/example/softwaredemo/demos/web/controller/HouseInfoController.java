package com.example.softwaredemo.demos.web.controller;

import com.example.softwaredemo.demos.web.pojo.House;
import com.example.softwaredemo.demos.web.pojo.HouseInfo;
import com.example.softwaredemo.demos.web.service.HouseInfoService;
import com.example.softwaredemo.demos.web.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/houseInfo")
public class HouseInfoController {
    @Autowired
    private HouseInfoService houseInfoService;

    @GetMapping("/{houseId}")
    public ResponseEntity<HouseInfo> getHouseInfoById(@PathVariable int houseId) {
        HouseInfo houseInfo = houseInfoService.getHouseInfoById(houseId);
        if (houseInfo != null) {
            return new ResponseEntity<>(houseInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/insert")
    public ResponseEntity<Void> insertHouseInfo(@RequestBody HouseInfo houseInfo) {
        houseInfoService.insertHouseInfo(houseInfo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateHouseInfo(@RequestBody HouseInfo houseInfo) {
        houseInfoService.updateHouseInfo(houseInfo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{houseId}")
    public ResponseEntity<Void> deleteHouseInfo(@PathVariable int houseId) {
        houseInfoService.deleteHouseInfo(houseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<HouseInfo>> getHouseInfoByConditions(@RequestParam Map<String, Object> conditions) {
        List<HouseInfo> houseInfoList = houseInfoService.getHouseInfoByConditions(conditions);
        if (houseInfoList != null && !houseInfoList.isEmpty()) {
            return new ResponseEntity<>(houseInfoList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
