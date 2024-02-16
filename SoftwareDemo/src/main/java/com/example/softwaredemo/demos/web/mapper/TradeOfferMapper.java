package com.example.softwaredemo.demos.web.mapper;

import com.example.softwaredemo.demos.web.pojo.TradeOffer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.*;

@Mapper
public interface TradeOfferMapper {
    @Select("SELECT * FROM trade_offer WHERE offer_id = #{offerId}")
    TradeOffer getTradeOfferById(int offerId);

    @Insert("INSERT INTO trade_offer (offer_id, partA, partB, house_id) VALUES (#{offerId}, #{partA}, #{partB}, #{houseId})")
    void insertTradeOffer(TradeOffer tradeOffer);

    @Update("UPDATE trade_offer SET partA = #{partA}, partB = #{partB}, house_id = #{houseId} WHERE offer_id = #{offerId}")
    void updateTradeOffer(TradeOffer tradeOffer);

    @Delete("DELETE FROM trade_offer WHERE offer_id = #{offerId}")
    void deleteTradeOffer(int offerId);
}
