package com.yinnan.progress;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动入口
 * @author 龙熙
 */
@Slf4j
@SpringBootApplication
public class LearnProgressTogetherApplication {

    public static void main(String[] args) {
        log.info("main start");
        SpringApplication.run(LearnProgressTogetherApplication.class, args);
    }
}
