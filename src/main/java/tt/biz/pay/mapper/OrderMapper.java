package tt.biz.pay.mapper;

import tt.biz.pay.model.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    int updateByUniqueSelective(Order record);
    
    Order selectByParams(Order record);
    
}