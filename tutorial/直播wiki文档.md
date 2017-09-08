# 直播wik文档笔记

[地址](https://www.tapd.cn/20074921/markdown_wikis/#1120074921001004271)

**技术支撑**

* 从0部署测试环境
* Rider系统使用文档



**后端架构**

* 各服务端口与依赖服务
* 直播后端模块  【各模块的具体说明】



**前端架构**

* Web前端梳理 【前端模块的说明】
* 直播前端仓库【移动端模块说明】


查找TitleService

find ../.. -name '*TitleService* '



一般代码路径：

/data/app/live-app-web/include/controller





# npm更新和nodejs更新



npm更新和nodejs更新

更新你已经安装的NPM库，这个很简单，只需要运行。

```
npm update -g1
```

更新Nodejs自身。一直依赖我都是下载最新版的源码，然后make install，及其繁琐。其实只需要运行以下2个命令即可：

```
npm install -g n 
n latest
```



**http://npm.taobao.org/** npm 淘宝镜像



npm install jwebdriver chai faker --save-dev



操作方法：

**安装macaca-electron**
 备注：macaca-electron是基于Electron开发的Macaca驱动，是Macaca驱动之一。
操作方法：
在命令框中输入命令“**npm install macaca-electron -g**”回车，即可安装



npm i macaca-cli -g

安装Macaca-Android **npm i macaca-android -g**

3.安装 UI Recorder 执行cmd命令： **npm install uirecorder mocha -g** 

初始化配置 **uirecorder init --mobile**

**npm install**

启动macaca server **macaca server --port 4444**

开始录制测试用例  **uirecorder start --mobile sample/test.spec.js**

　6、运行测试用例　　

　　　　1、运行所有脚本

　　　　　　文件目录下打开命令窗口，输入：run.bat

　　　　2、运行单个脚本

　　　　　　文件目录下打开命令窗口，输入：run.bat sample/test.spec.js

四、查看测试报告和单步截图

　　　　./reports/index.html

　　　　./screenshots/



cnpm i macaca-android -g





