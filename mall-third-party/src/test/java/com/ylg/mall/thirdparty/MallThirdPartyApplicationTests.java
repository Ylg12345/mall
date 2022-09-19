package com.ylg.mall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\HP\\Pictures\\Camera Roll\\2.png");

        ossClient.putObject("ylg-mall", "2.png", inputStream);

        ossClient.shutdown();
        System.out.println("上传完成...");

    }


}
