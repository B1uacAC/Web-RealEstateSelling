package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.mapper.TradeOfferMapper;
import com.example.softwaredemo.demos.web.pojo.TradeOffer;
import com.example.softwaredemo.demos.web.service.TradeOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeOfferServiceImpl implements TradeOfferService {
    @Autowired
    private TradeOfferMapper tradeOfferMapper;

    @Override
    public TradeOffer getTradeOfferById(int offerId) {
        return tradeOfferMapper.getTradeOfferById(offerId);
    }

    @Override
    public void addTradeOffer(TradeOffer tradeOffer) {
        tradeOfferMapper.insertTradeOffer(tradeOffer);
    }

    @Override
    public void updateTradeOffer(TradeOffer tradeOffer) {
        tradeOfferMapper.updateTradeOffer(tradeOffer);
    }

    @Override
    public void deleteTradeOffer(int offerId) {
        tradeOfferMapper.deleteTradeOffer(offerId);
    }
}
