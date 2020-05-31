package com.supers.basic.controller;

import cn.pigicutils.core.lang.Console;
import cn.pigicutils.core.lang.Dict;
import com.supers.basic.domain.entity.BasicPressureTest;
import com.supers.basic.mapper.BasicPressureTestMapper;
import com.supers.basic.util.arithmetic.Sort;
import com.supers.basic.util.redis.RedisHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @Autowired
    private RedisHelper redisHelper;
    @Autowired
    private BasicPressureTestMapper basicPressureTestMapper;

    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("hello");
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Redis缓存测试
     * @param name
     * @return
     */
    @GetMapping("/cache")
    public ResponseEntity redisCache(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        System.out.println("GetMapping");
        redisHelper.setCache("1", "1");
        redisHelper.setCache("2", "2");
        redisHelper.setCache("3", "3");
        redisHelper.setCache("4", "4");
        redisHelper.setCache("5", "5");
        Map<String, Object> redisMap = redisHelper.batchGetCatch("1", "2", "3", "4", "5");
        redisHelper.batchDelCache("1", "2", "3", "4", "5");
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * 算法测试
     * @param name
     * @return
     */
    @GetMapping("/arithmetic/sort")
    public ResponseEntity arithmeticSort(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        int[] array = {1, 32, 43, 12, 56, 98, 34, 76, 23, 876, 43, 87, 28, 94, 76, 23, 91, 47};
        Sort.bubbleSort(array);
        String dict = Dict.create().set("1", "dict").getStr("1");
        Console.log(dict);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     *
     * @param name
     * @return
     * */
    @GetMapping("/batch/insert")
    public ResponseEntity batchInsert(@RequestParam(value = "name", defaultValue = "Basic") String name) {
        BasicPressureTest basicPressureTest = new BasicPressureTest();
        for(int i = 1; i < 999999; i++){
            basicPressureTest.setAttribute1(String.valueOf(i));
            basicPressureTest.setAttribute2(String.valueOf(i));
            basicPressureTest.setAttribute3(String.valueOf(i));
            basicPressureTest.setAttribute4(String.valueOf(i));
            basicPressureTest.setAttribute5(String.valueOf(i));
            basicPressureTest.setAttribute6(String.valueOf(i));
            basicPressureTest.setAttribute7(String.valueOf(i));
            basicPressureTest.setAttribute8(String.valueOf(i));
            basicPressureTest.setAttribute9(String.valueOf(i));
            basicPressureTest.setAttribute10(String.valueOf(i));
            basicPressureTest.setAttribute11(String.valueOf(i));
            basicPressureTest.setAttribute12(String.valueOf(i));
            basicPressureTest.setAttribute13(String.valueOf(i));
            basicPressureTest.setAttribute14(String.valueOf(i));
            basicPressureTest.setAttribute15(String.valueOf(i));
            basicPressureTestMapper.insert(basicPressureTest);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
