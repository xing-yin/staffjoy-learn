Spring Boot与Kubernetes云原生服务实践
===

第一章：课程介绍和案例需求 (5讲)

01 | 课程介绍

02 | 背景说明

03 | 课程目标和主要内容

04 | 课程案例需求

05 | 课程补充说明

第二章：系统架构设计和技术栈选型 (8讲)
06 | 为何采用微服务架构？

07 | 架构设计和技术栈选型

08 | 数据和接口模型设计：账户服务
09 | 数据和接口模型设计：业务服务
10 | Dubbo、Spring Cloud和Kubernetes该如何选型（上）
11 | Dubbo、Spring Cloud和Kubernetes该如何选型（中）
12 | Dubbo、Spring Cloud和Kubernetes该如何选型（下）
13 | 技术中台到底讲什么？

第三章：服务开发框架设计和实现 (10讲)


14 | Staffjoy项目结构组织
15 | 谷歌为何采用单体仓库（Mono-Repo）？
16 | 微服务接口参数校验为何重要？
17 | 如何实现统一异常处理？
18 | DTO和DMO为什么要互转？
19 | 如何实现基于Feign的强类型接口？
20 | 为什么框架层就要考虑分环境配置？
21 | 异步处理为何要复制线程上下文信息？
22 | 为你的接口添加Swagger文档
23 | 主流微服务框架概览

第四章：可编程网关设计和实践 (9讲)

24 | 网关和BFF是如何演化出来的（上）
25 | 网关和BFF是如何演化出来的（下）
26 | 网关和反向代理是什么关系？
27 | 网关需要分集群部署吗？
28 | 如何设计一个最简网关？
29 | Faraday网关代码解析（上）
30 | Faraday网关代码解析（下）
31 | 生产级网关需要考虑哪些环节？
32 | 主流开源网关概览

第五章：安全框架设计和实践 (10讲)

33 | 安全认证架构演进：单块阶段（上）
34 | 安全认证架构演进：单块阶段（下）
35 | 安全认证架构演进：微服务阶段
36 | 基于JWT令牌的安全认证架构
37 | JWT的原理是什么？
38 | JWT有哪两种主要流程？
39 | Staffjoy安全认证架构和SSO
40 | 用户认证代码剖析
41 | 服务调用鉴权代码剖析
42 | 如何设计用户角色鉴权？

## 第六章：服务测试设计和实践 (7讲)

> 20210421(2)

43 | Spring Boot微服务测试该如何分类？
44 | 什么是契约驱动测试？
45 | 什么是测试金字塔？
46 | 单元测试案例分析
47 | 集成测试案例分析
48 | 组件测试案例分析
49 | Mock vs Spy
第七章：可运维架构设计和实践 (8讲)


50 | 何谓生产就绪(Production Ready)？
51 | Spring Boot如何实现分环境配置
52 | Apollo vs SpringCloudConfig vs K8s ConfigMap
53 | CAT vs Zipkin vs Skywalking(上)
54 | CAT vs Zipkin vs Skywalking(下)
55 | 结构化日志和业务审计日志
56 | 集中异常监控和Sentry
57 | EFK & Prometheus & Skywalking + Kubernetes 集成架构
第八章：服务容器化和Docker Compose部署 (10讲)


58 | 本地开发部署架构和软件需求
59 | 手工服务部署和测试(上)
60 | 手工服务部署和测试(中)
61 | 手工服务部署和测试(下)
62 | SkyWalking调用链监控实验
63 | Docker和Docker Compose简介
64 | 容器镜像构建Dockerfile解析
65 | Docker Compose服务部署文件剖析
66 | 将Staffjoy部署到本地Docker Compose环境(上)
67 | 将Staffjoy部署到本地Docker Compose环境(下)
第九章：云原生架构和Kubernetes容器云部署 (17讲)


68 | 到底什么是云原生架构？
69 | Kubernetes背景和架构
70 | Kubernetes有哪些基本概念(上)
71 | Kubernetes有哪些基本概念(下)
72 | 理解Kubernetes节点网络和Pod网络
73 | 深入理解Service和ServiceDiscovery
74 | NodePort vs LoadBalancer vs Ingress
75 | 本地测试Kubernetes部署文件剖析
76 | 本地测试Kubernetes环境搭建
77 | 将Staffjoy部署到本地Kubernetes环境(上)
78 | 将Staffjoy部署到本地Kubernetes环境(下)
79 | 生产环境Kubernetes部署文件剖析
80 | 阿里云Kubernetes环境创建
81 | 将Staffjoy部署到阿里云Kubernetes环境
82 | Kubernetes应用动态配置实验
83 | Kubernetes应用金丝雀发布实验
84 | 阿里云资源释放
第十章：项⽬复盘、应用和扩展环节 (2讲)


85 | 课程复盘
86 | 项目扩展和应用
第十一章：附录 Staffjoy 项目源代码解析 (8讲)


87 | Account服务
88 | Company服务
89 | Mail、SMS和Bot服务
90 | Faraday服务
91 | WhoAmI服务
92 | WWW服务
93 | 前端应用
94 | 结课测试&结束语
