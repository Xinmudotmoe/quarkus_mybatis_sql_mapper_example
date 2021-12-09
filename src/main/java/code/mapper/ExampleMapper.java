package code.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExampleMapper {
    @Select("select 1 from dual")
    Integer getOneByDualInSelectAnnotation();

    Integer getOneByDualInSqlMapper();
}
