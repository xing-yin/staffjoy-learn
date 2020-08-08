# 基础镜像
FROM java:8-jdk-alpine

# 将生成的镜像拷贝到 /usr/app/ 目录中
COPY ./target/account-svc-1.0.0.jar /usr/app/

# 设置为工作目录
WORKDIR /usr/app

RUN sh -c 'touch account-svc-1.0.0.jar'

# 启动命令
ENTRYPOINT ["java", "-jar", "account-svc-1.0.0.jar"]
