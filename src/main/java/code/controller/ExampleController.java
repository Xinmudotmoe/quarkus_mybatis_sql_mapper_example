package code.controller;

import code.common.result.UniversalResult;
import code.mapper.ExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    ExampleMapper exampleMapper;

    @GetMapping("oneBySelectAnnotation")
    public UniversalResult<Integer> oneBySelectAnnotation() {
        return UniversalResult.success(exampleMapper.getOneByDualInSelectAnnotation());
    }

    @GetMapping("oneBySqlMapper")
    public UniversalResult<Integer> oneBySqlMapper() {
        return UniversalResult.success(exampleMapper.getOneByDualInSqlMapper());
    }
}
