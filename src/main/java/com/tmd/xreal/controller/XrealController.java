package com.tmd.xreal.controller;

import com.tmd.xreal.aop.formsPreventDuplicateSubmissions.FormsPreventDuplicateSubmissionsAnnotation;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author zxw
 * @date 2020-01-06 9:58
 */
@RestController("/test")
//@Api(tags = {"测试用"})
public class XrealController {


    @FormsPreventDuplicateSubmissionsAnnotation
    @GetMapping(value = "/getAlll/{id}")
    @ApiOperation(tags = {"get"},value = "测试pathVariable绑定测试",notes = "测试pathVariable绑定测试")
    public void getAll(@PathVariable(name = "id")String id){
        System.out.println(id);
    }


    @PostMapping(value = "/singleParam")
    @ApiOperation(tags = {"post"},value = "测试RequestParam绑定测试",notes = "测试RequestParam绑定测试")
    public void getSingleParam(@RequestParam(value = "id",required = false) String cd, @RequestParam(value ="numbers") Integer numbers){
        System.out.println("id==="+cd+"====numbers"+numbers);
    }



}
