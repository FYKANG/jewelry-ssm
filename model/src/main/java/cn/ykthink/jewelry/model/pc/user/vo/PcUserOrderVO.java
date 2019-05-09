package cn.ykthink.jewelry.model.pc.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * program: jewelry
 * description:订单VO
 * author: mi
 * create: 2019-05-09 15:21
 **/
@Data
public class PcUserOrderVO {
    @ApiModelProperty(value = "订单uuid", name = "orderUuid", example = "12345", dataType = "String", required = true)
    private String orderUuid;

    @ApiModelProperty(value = "图片", name = "imageUrl", example = "www.xxx.com/abcdefg.jpg", dataType = "String", required = true)
    private String image_url;

    @ApiModelProperty(value = "标题", name = "title", example = "Diamond", dataType = "String", required = true)
    private String title;

    @ApiModelProperty(value = "支付金额", name = "payPrice", example = "1314", dataType = "BigDecimal", required = true)
    private BigDecimal payPrice;

    @ApiModelProperty(value = "订单状态", name = "orderStatus", example = "1", dataType = "Integer", required = true)
    private Integer orderStatus;

    @ApiModelProperty(value = "订单编号", name = "orderNo", example = "12345", dataType = "String", required = true)
    private String orderNo;

    @ApiModelProperty(value = "订单备注", name = "orderDescribe", example = "货到付款", dataType = "String", required = false)
    private String orderDescribe;

    @ApiModelProperty(value = "支付时间", name = "payDate", example = "2019-01-01 00:00:00", dataType = "String", required = true)
    private String payDate;

    @ApiModelProperty(value = "物流公司名称", name = "logisticsName", example = "顺丰", dataType = "String", required = true)
    private String logisticsName;

    @ApiModelProperty(value = "物流快递单号", name = "logisticNumber", example = "12345", dataType = "String", required = true)
    private String logisticNumber;
}
