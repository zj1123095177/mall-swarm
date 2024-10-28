package com.macro.mall.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: ZhouJie
 * @ClassName: OmsOrderStatistics
 * @Description: 订单统计
 * @Date: 2024/10/28 13:58
 * @Version: 1.0
 */
@Data
public class OmsOrderStatistics {
    @Schema(title = "订单日期")
    private String date;

    @Schema(title = "订单数量")
    private Long orderCount;

    @Schema(title = "订单金额")
    private BigDecimal orderAmount;

}
