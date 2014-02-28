DP-IDEA
=====

为点评中间件定制的Intellij插件！

## 安装：

下载[http://code.dianpingoa.com/yihua.huang/dp-idea/raw/master/dp-idea.zip](http://code.dianpingoa.com/yihua.huang/dp-idea/raw/master/dp-idea.zip)到本地，无需解压。

在Intellij里选择`Settings`=>`Plugins`=>`Install Plugin From Disk`即可。

安装后，点击工具栏的小黄人即可启动。

![toolbar](http://code.dianpingoa.com/yihua.huang/dp-idea/raw/master/asserts/toolbar.png)

## 功能：

### mocksocks

对本地的网络请求进行抓包和调试。从此连接服务器不对、bug不好排查的问题都能迎刃而解了！

如何使用？

**首先**点击小黄人启动mocksocks，**然后**启动你的应用程序，**无需做任何配置**，你的应用产生的网络数据都已经被记录下来了！

在初始界面，你可以查看连接，也可以按照ip地址进行筛选：

![connections](http://code.dianpingoa.com/yihua.huang/dp-idea/raw/master/asserts/connections.png)

双击连接，可以选择查看某个特定请求：

![message](http://code.dianpingoa.com/yihua.huang/dp-idea/raw/master/asserts/message.png)

关闭窗口，即可使用正常功能。

### todo

* 查看lion配置
* 清除alpha和beta缓存
* 与urlrewrite整合，URL到Action以及Action到URL的对应和跳转
* 跳代码，dao的实现跳转到xml中
* quick startup
* 在gitpub中查看文件