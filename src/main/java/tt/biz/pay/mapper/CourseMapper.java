package tt.biz.pay.mapper;

import java.util.List;

import tt.biz.pay.model.CommonDTO;
import tt.biz.pay.model.entity.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> loadAll(CommonDTO dto);
}