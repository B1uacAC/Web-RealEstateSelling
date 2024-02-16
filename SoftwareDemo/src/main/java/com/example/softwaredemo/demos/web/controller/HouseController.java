package com.example.softwaredemo.demos.web.controller;
import com.example.softwaredemo.demos.web.pojo.House;
import com.example.softwaredemo.demos.web.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping("/{houseId}")
    public House getHouseById(@PathVariable int houseId) {
        House house = houseService.getHouseById(houseId);
        return house;
    }
    @GetMapping("/getAll")
    public List<House> getAllHouse() {
        return houseService.getAllHouse();
    }


    @PostMapping
    public ResponseEntity<Void> addHouse(@RequestBody House house) {
        houseService.addHouse(house);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{houseId}")
    public ResponseEntity<Void> updateHouse(@PathVariable int houseId, @RequestBody House house) {
        House existingHouse = houseService.getHouseById(houseId);
        if (existingHouse != null) {
            houseService.updateHouse(house);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{houseId}")
    public ResponseEntity<Void> deleteHouse(@PathVariable int houseId) {
        House existingHouse = houseService.getHouseById(houseId);
        if (existingHouse != null) {
            houseService.deleteHouse(houseId);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
