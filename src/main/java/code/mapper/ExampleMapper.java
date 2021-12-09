package code.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import io.quarkiverse.mybatis.runtime.meta.MapperDataSource;

@Mapper
@MapperDataSource("xmlconfig")
public interface ExampleMapper {
    @Select("select 1 from dual")
    Integer getOneByDualInSelectAnnotation();

    Integer getOneByDualInSqlMapper();
}
