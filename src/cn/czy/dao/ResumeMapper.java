package cn.czy.dao;

import cn.czy.pojo.Resume;
import cn.czy.pojo.ResumeExample;
import cn.czy.pojo.ResumeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper {
    int countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeWithBLOBs record);

    int insertSelective(ResumeWithBLOBs record);

    List<ResumeWithBLOBs> selectByExampleWithBLOBs(ResumeExample example);

    List<Resume> selectByExample(ResumeExample example);

    ResumeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(ResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResumeWithBLOBs record);

    int updateByPrimaryKey(Resume record);
    
    List<ResumeWithBLOBs> findActivityJoinerByActivityId(int activityId);
    
    List<ResumeWithBLOBs> searchResumeBySkillAndDepart(ResumeWithBLOBs resume);
}