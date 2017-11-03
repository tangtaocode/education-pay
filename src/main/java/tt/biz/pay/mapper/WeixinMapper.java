package tt.biz.pay.mapper;

import tt.biz.pay.model.entity.Weixin;

public interface WeixinMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Weixin record);

    int insertSelective(Weixin record);

    Weixin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Weixin record);

    int updateByPrimaryKey(Weixin record);
}