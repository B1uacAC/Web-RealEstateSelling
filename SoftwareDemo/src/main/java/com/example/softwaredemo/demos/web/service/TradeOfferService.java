package com.example.softwaredemo.demos.web.service;

import com.example.softwaredemo.demos.web.pojo.TradeOffer;

public interface TradeOfferService {
    TradeOffer getTradeOfferById(int offerId);
    void addTradeOffer(TradeOffer tradeOffer);
    void updateTradeOffer(TradeOffer tradeOffer);
    void deleteTradeOffer(int offerId);
}
