package com.example.softwaredemo.demos.web.controller;
import com.example.softwaredemo.demos.web.pojo.TradeOffer;
import com.example.softwaredemo.demos.web.service.TradeOfferService;
import com.example.softwaredemo.demos.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/tradeOffer")
public class TradeOfferController {
    @Autowired
    private TradeOfferService tradeOfferService;

    @GetMapping("/{offerId}")
    public ResponseEntity<TradeOffer> getTradeOfferById(@PathVariable int offerId) {
        TradeOffer tradeOffer = tradeOfferService.getTradeOfferById(offerId);
        if (tradeOffer != null) {
            return new ResponseEntity<>(tradeOffer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addTradeOffer(@RequestBody TradeOffer tradeOffer) {
        tradeOfferService.addTradeOffer(tradeOffer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{offerId}")
    public ResponseEntity<Void> updateTradeOffer(@PathVariable int offerId, @RequestBody TradeOffer tradeOffer) {
        TradeOffer existingTradeOffer = tradeOfferService.getTradeOfferById(offerId);
        if (existingTradeOffer != null) {
            tradeOfferService.updateTradeOffer(tradeOffer);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{offerId}")
    public ResponseEntity<Void> deleteTradeOffer(@PathVariable int offerId) {
        TradeOffer existingTradeOffer = tradeOfferService.getTradeOfferById(offerId);
        if (existingTradeOffer != null) {
            tradeOfferService.deleteTradeOffer(offerId);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
