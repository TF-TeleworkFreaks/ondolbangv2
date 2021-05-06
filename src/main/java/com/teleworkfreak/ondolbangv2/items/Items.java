package com.teleworkfreak.ondolbangv2.items;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@ToString
@Entity
public class Items {
    private int gonggoNum;

    private int gongmaeNum;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gongmaeConditionNum;

    private int itemNum;

    private int itemHistoryNum;

    private String screenGroupCode;

    private String categoryName;

    private String bidNum;

    private String itemName;

    private String itemManageNum;

    private String addressOld;

    private String addressNew;

    private String disposalMethodCode;

    private String disposalMethodName;

    private String bidMethod;

    private String minimumBidPrice;

    private String averagePrice;

    private String feeRate;

    private LocalDateTime bidStartDate;

    private LocalDateTime bidEndDate;

    private String itemStatus;

    private int bidFailCount;


    @Builder
    public Items(int gonggoNum, int gongmaeNum, int gongmaeConditionNum,
                 int itemNum, int itemHistoryNum, String screenGroupCode,
                 String categoryName, String bidNum, String itemName,
                 String itemManageNum, String addressOld, String addressNew,
                 String disposalMethodCode, String disposalMethodName, String bidMethod,
                 String minimumBidPrice, String averagePrice, String feeRate,
                 LocalDateTime bidStartDate, LocalDateTime bidEndDate,
                 String itemStatus, int bidFailCount)
    {
        this.gonggoNum = gonggoNum;
        this.gongmaeNum = gongmaeNum;
        this.gongmaeConditionNum = gongmaeConditionNum;
        this.itemNum = itemNum;
        this.itemHistoryNum = itemHistoryNum;
        this.screenGroupCode = screenGroupCode;
        this.categoryName = categoryName;
        this.bidNum = bidNum;
        this.itemName = itemName;
        this.itemManageNum = itemManageNum;
        this.addressOld = addressOld;
        this.addressNew = addressNew;
        this.disposalMethodCode = disposalMethodCode;
        this.disposalMethodName = disposalMethodName;
        this.bidMethod = bidMethod;
        this.minimumBidPrice = minimumBidPrice;
        this.averagePrice = averagePrice;
        this.feeRate = feeRate;
        this.bidStartDate = bidStartDate;
        this.bidEndDate = bidEndDate;
        this.itemStatus = itemStatus;
        this.bidFailCount = bidFailCount;
    }
}