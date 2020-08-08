# 前端构建：单页应用: 采样两阶段构建
# 镜像1
FROM node:alpine as builder
WORKDIR '/build'

# 将源代码拷贝到镜像目录 ./myaccount
COPY myaccount ./myaccount
COPY resources ./resources
COPY third_party ./third_party

# 工作目录
WORKDIR '/build/myaccount'

# 前端构建:生成静态文件
RUN npm install
RUN npm rebuild node-sass
RUN npm run build

RUN ls /build/ /dist

# 镜像2:将上面到镜像 build 的资源拷贝到此镜像中（主要是生成的静态文件拷贝到 nginx）
FROM nginx
EXPOSE 80
COPY --from=builder /build/myaccount/dist /usr/share/nginx/html

