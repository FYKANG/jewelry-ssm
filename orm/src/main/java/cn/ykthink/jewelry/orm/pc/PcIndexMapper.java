package cn.ykthink.jewelry.orm.pc;

import cn.ykthink.jewelry.model.common.vo.CommonCategoryVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: YK
 * Title: PcIndexMaper
 * Description: 首页Mapper
 * Date: 2019/5/13
 * Time: 11:14
 */
@Mapper
@Repository
public interface PcIndexMapper {
    /**
     * 类目信息
     *
     * @return
     */
    List<CommonCategoryVO> selectIndexCategory();
}
