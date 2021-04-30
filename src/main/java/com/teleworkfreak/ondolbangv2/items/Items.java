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
    private int PLNM_NO;

    private int PBCT_NO;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PBCT_CDTN_NO;

    private int CLTR_NO;

    private int CLTR_HSTR_NO;

    private String SCRN_GRP_CD;

    private String CTGR_FULL_NM;

    private String BID_MNMT_NO;

    private String CLTR_NM;

    private String CLTR_MNMT_NO;

    private String LDNM_ADRS;

    private String NMRD_ADRS;

    private String DPSL_MTD_CD;

    private String DPSL_MTD_NM;

    private String BID_MTD_NM;

    private String MIN_BID_PRC;

    private String APSL_ASES_AVG_AMT;

    private String FEE_RATE;

    private LocalDateTime PBCT_BEGN_DTM;

    private LocalDateTime PBCT_CLS_DTM;

    private String PBCT_CLTR_STAT_NM;

    private int USCBD_CNT;


    @Builder
    public Items(
            int PLNM_NO, int PBCT_NO, int PBCT_CDTN_NO, int CLTR_NO,
            int CLTR_HSTR_NO, String SCRN_GRP_CD, String CTGR_FULL_NM,
            String BID_MNMT_NO, String CLTR_NM, String CLTR_MNMT_NO,
            String LDNM_ADRS, String NMRD_ADRS, String DPSL_MTD_CD,
            String DPSL_MTD_NM, String BID_MTD_NM, String MIN_BID_PRC,
            String APSL_ASES_AVG_AMT, String FEE_RATE,
            LocalDateTime PBCT_BEGN_DTM, LocalDateTime PBCT_CLS_DTM,
            String PBCT_CLTR_STAT_NM, int USCBD_CNT)
    {
        this.PLNM_NO = PLNM_NO;
        this.PBCT_NO = PBCT_NO;
        this.PBCT_CDTN_NO = PBCT_CDTN_NO;
        this.CLTR_NO = CLTR_NO;
        this.CLTR_HSTR_NO = CLTR_HSTR_NO;
        this.SCRN_GRP_CD = SCRN_GRP_CD;
        this.CTGR_FULL_NM = CTGR_FULL_NM;
        this.BID_MNMT_NO = BID_MNMT_NO;
        this.CLTR_NM = CLTR_NM;
        this.CLTR_MNMT_NO = CLTR_MNMT_NO;
        this.LDNM_ADRS = LDNM_ADRS;
        this.NMRD_ADRS = NMRD_ADRS;
        this.DPSL_MTD_CD = DPSL_MTD_CD;
        this.DPSL_MTD_NM = DPSL_MTD_NM;
        this.BID_MTD_NM = BID_MTD_NM;
        this.MIN_BID_PRC = MIN_BID_PRC;
        this.APSL_ASES_AVG_AMT = APSL_ASES_AVG_AMT;
        this.FEE_RATE = FEE_RATE;
        this.PBCT_BEGN_DTM = PBCT_BEGN_DTM;
        this.PBCT_CLS_DTM = PBCT_CLS_DTM;
        this.PBCT_CLTR_STAT_NM = PBCT_CLTR_STAT_NM;
        this.USCBD_CNT = USCBD_CNT;
    }
}
