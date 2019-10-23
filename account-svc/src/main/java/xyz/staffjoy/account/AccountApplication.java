package xyz.staffjoy.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// 需要将调用的包放进来，才能调用对应的 client
@EnableFeignClients(basePackages = {"xyz.staffjoy.mail", "xyz.staffjoy.bot", "xyz.staffjoy.company"})
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}

