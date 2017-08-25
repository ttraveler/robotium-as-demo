# Docker 安装相关

[官网]( https://github.com/boot2docker/windows-installer/releases/latest)的下载链接速度很慢，下载不下来，这里提供一个比较快速的[下载地址](http://get.daocloud.io/#install-docker-for-mac-windows)



## Docker基本教程

* [教程1_环境相关](http://www.cnblogs.com/studyzy/p/6113221.html)
* [教程2_环境相关](http://blog.csdn.net/No_red/article/details/72457769?locationNum=9&fps=1)
* [Docker的基础使用](http://www.runoob.com/docker/docker-tutorial.html)



## 安装中遇到的问题

* **创建的桌面快捷方式Docker Quickstart Terminal 不能使用**

  ​那可能是因为你已经安装了Hyper-v，所以VirtualBox无法用64位的虚拟机。需要卸载Hyper-v

* 使用`docker-machine create --driver=virtualbox default`  报错 No default Boot2Docker ISO found locally

  复制安装目录下的boot2docker.iso到C:\Users\Administrator\.Docker\machine\cache到这个目录下


# 加速器

由于墙的原因，从hub.docker.com拉取代码很慢，解决方案是使用[DaoCloud](https://www.daocloud.io) 提供的加速器,参考文档:[帮助文档](http://guide.daocloud.io/dcs/daocloud-9153151.html#docker-toolbox)

## docker 常用命令

* **虚拟机相关**

  ​`docker-machine ls` 查看虚拟机相关信息

```shell
PS C:\Users\user> docker-machine ls
NAME      ACTIVE   DRIVER       STATE     URL                       DOCKER        ERRORS
default   -        virtualbox   Running   tcp://192.168.99.100:12   v17.06.0-ce
说明：
NAME 虚拟机的名字
DRIVER 使用的虚拟机类型,vb或者vmware
URL 虚拟机IP地址
DOCKER docker的版本
```

​	`docker-machine ssh default`  登录到名为default 的虚拟机

​	`docker-machine start default` 启动名为default的虚拟机

​        `docker-machine stop default` 停掉名为default的虚拟机

​	`docker-machine env default` 获取虚拟机的环境变量

*  **镜像容器相关**

    `docker images` 查看当前镜像

```
REPOSITORY                TAG             IMAGE ID            CREATED             SIZE
muicoder/appium           latest          c95fa954f643        9 days ago          487MB
ubuntu                    latest          ccc7a11d65b1        11 days ago         120MB
jacekmarchwicki/android   latest          6cf18426d45c        4 months ago        5.1GB
说明:
REPOSITORY hub.docker.com上的仓库地址
```

​	`sudo docker run --name container_name -it REPOSITORY_NAME /bin/bash `   //执行镜像创建一个容器	name为container_name ,并且进入交互模式

​	`docker start containerid | container_name` 根据id或者name来**启动**容器

​	`docker stop containerid | container_name`  根据id或者name来**停止**容器

​	`docker restart containerid | container_name `  根据id或者name来**重启**容器

​	`docker exec -it container_name bash ` 进入容器命令交互模式

​	`docker ps -a` 查看当前**所有**的容器(运行状态和停止状态)

​	`docker ps ` 查看当前处于**运行状态**的容器

​	`docker ps -aq` 查看当前处于**停止状态**的容器

* **其他命令**

  `docker rm id|name` 根据id|name删除容器

  `docker rmi repository|id` 根据id|name删除镜像

  `docker inspect id|name` 查看容器或镜像的基础信息

## docker 根据Dockerfile 构建image

**用法:** `docker build [OPTIONS] PATH | URL | -` 

如果在Dockerfile 当前目录下,docker build -t image_name .

如果不在 docker build -t image_name url





## docker 多模块的依赖使用





