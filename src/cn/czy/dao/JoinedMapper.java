package cn.czy.dao;

import cn.czy.pojo.Joined;
import cn.czy.pojo.JoinedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinedMapper {
    int countByExample(JoinedExample example);

    int deleteByExample(JoinedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joined record);

    int insertSelective(Joined record);

    List<Joined> selectByExample(JoinedExample example);

    Joined selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joined record, @Param("example") JoinedExample example);

    int updateByExample(@Param("record") Joined record, @Param("example") JoinedExample example);

    int updateByPrimaryKeySelective(Joined record);

    int updateByPrimaryKey(Joined record);
}