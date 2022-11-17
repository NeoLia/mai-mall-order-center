package org.mjh.ordercenter.service.mallorder;

import org.mjh.ordercenter.dao.mallorder.MallOrderV1Mapper;
import org.mjh.springbootstudy.common.enums.OrderResultCodeEnum;
import org.mjh.springbootstudy.common.po.MallOrder;
import org.mjh.springbootstudy.common.vo.BaseResult;
import org.mjh.springbootstudy.common.vo.MallOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Neo Lia Marx
 * @date: 2022/11/18 0:57
 */
@Service
public class MallOrderV1Service {
    @Autowired
    private MallOrderV1Mapper mallOrderV1Mapper;

    /**
     * Get mall order by order no.
     * @param orderNo - Order no.
     * @return BaseResult<MallOrderVo> - Return a BaseResult object.
     */
    public BaseResult<MallOrderVo> getMallOrderByOrderNo(String orderNo) {
        MallOrder mallOrder = mallOrderV1Mapper.getMallOrderByOrderNo(orderNo);
        if (mallOrder == null) {
            return BaseResult.fail(OrderResultCodeEnum.ORDER_EMPTY_QUERY_RESULT);
        }

        MallOrderVo mallOrderVo = MallOrderVo.toVo(mallOrder);
        return BaseResult.success(OrderResultCodeEnum.ORDER_SUCCESS, mallOrderVo);
    }
}
