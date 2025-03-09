package com.hnkj.springboot_01;
import com.hnkj.springboot_01.contraller.HelloContraller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class SpringBoot01ApplicationTests {
    @Autowired
    HelloContraller helloContraller;
    @Test
    public void Test_01() {
        helloContraller.HELLO();
    }
}