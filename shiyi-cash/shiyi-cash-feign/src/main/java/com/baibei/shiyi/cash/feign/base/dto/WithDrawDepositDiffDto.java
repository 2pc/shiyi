package com.baibei.shiyi.cash.feign.base.dto;

import com.baibei.shiyi.common.tool.page.PageParam;
import lombok.Data;

@Data
public class WithDrawDepositDiffDto extends PageParam {
    /**
     * 批次
     */
    private String batchNo;

    /**
     * 交易网会员代码
     */
    private String customerNo;

    /**
     * 银行前置流水号
     */
    private String externalNo;

    /**
     * 交易网流水号
     */
    private String orderNo;

    /**
     * 类型（withdraw：出金，deposite：入金）
     */
    private String type;

    /**
     * 差异类型(对账类型)
     */
    private String diffType;

    /**
     * 状态(wait:等待；deal:已处理)
     */
    private String status;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 导出条数限制
     */
    private Integer exportLimit;
}
