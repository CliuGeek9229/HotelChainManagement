# HotelChainManagement #
分布式数据库大作业，我负责管理员部分，主要实现的功能是：修改房间，修改员工，添加公告，统计营业，统计评价 5个功能。前前后后写了大概三天，用了SSH框架，本地测试的数据库为MySQL，sql文件我也一起放在远程库上。代码可能有些粗糙，读者老爷见谅。

# 系统操作流程演示 #

## 登录 ##
首先是一张十分简约的登录界面，它长这个样子：

![loginin.png](https://i.loli.net/2018/04/28/5ae3d17acd2a8.png)

成功输入用户名密码（方便起见，设置的用户名密码均为admin，这个地方其实用了MD5加密，这点我们稍后会谈到）之后进入到系统，如下图所示：

![main.png](https://i.loli.net/2018/04/28/5ae3d4147a2d9.png)

## 修改房间 ##

我们进入到修改房间功能界面，房间号查找支持模糊搜索，例如我们输入S，结果如下图所示：

![MRoom.png](https://i.loli.net/2018/04/28/5ae3d86a73ccc.png)

例如我们对第一条数据进行修改，点击第一条数据后面的修改按钮，进入到修改房间界面，如下：

![MRoom2.png](https://i.loli.net/2018/04/28/5ae3d93ad5a63.png)

修改房间描述，例如修改为“基本设施齐全，隔音效果好，干净卫生”，点击修改按钮，完成本次的修改任务；如果点击放弃修改按钮，返回至上一级。修改成功效果如下图所示：

![MRoom3.png](https://i.loli.net/2018/04/28/5ae3da07d91c3.png)


## 发布公告 ##

因为任务分配的原因（添加公告的任务在我这，公告显示在负责顾客业务的编程人员那），这个功能我只实现了添加数据库的操作，效果我会截取数据库数据显示，具体效果如下：

![Notice.png](https://i.loli.net/2018/04/28/5ae3dbefec4a7.png)

![Notice2.png](https://i.loli.net/2018/04/28/5ae3dc59c894b.png)


## 修改员工 ##

修改员工的功能实现同上述的修改房间功能实现类似，请大家参照上述的流程，这里我给出效果图：

![Employee.png](https://i.loli.net/2018/04/28/5ae3dd1df24e2.png)

![Employee2.png](https://i.loli.net/2018/04/28/5ae3de1072a01.png)

![Employee3.png](https://i.loli.net/2018/04/28/5ae3de512b4a9.png)

## 统计营业 ##

这部分的功能实现稍微有点复杂，主要是需要控制的参数比较多，我们一步步的说吧。

首先，结合数据库中已有的营业信息，我现在查询2017年12月1日到2017年12月3日的的全部营业信息，统计方式选择统计总营业额，同时我们将显示所有符合要求的营业信息。按照上述要求，我们进行查询统计，效果如下：

![Business1.png](https://i.loli.net/2018/04/28/5ae3e19ee4667.png)

然后，我们再对照下数据库中的信息，不难发现我们的统计还是蛮精确的：

![Business2.png](https://i.loli.net/2018/04/28/5ae3e24876067.png)

## 统计评价 ##

统计评价相较于上述的统计营业稍简单一些，需要控制的因素略少一些。

同样，我们查阅完数据库的信息后，决定统计2017年12月1日到2017年12月3日的全部评价信息：

![Evaluation1.png](https://i.loli.net/2018/04/28/5ae3e3eef3dba.png)

再对比下数据库信息：

![Evaluation2.png](https://i.loli.net/2018/04/28/5ae3e47f02db9.png)

# 相关内容介绍： #

## MD5加密 ##

这个加密技术应该是比较常见的，而且像这种常见的加密原理有时候并不需要我们知道其中的原理同样可以方便的使用。之所以这么说是因为Java已经帮我们封装好了，我们只需要调用即可，首先要做的肯定是import这个封装好的API：

```
import java.security.MessageDigest;

```

接下来就是加密部分：

```
public String makeMD5(String password) {
		MessageDigest md;
		   try {
		    // 生成一个MD5加密计算摘要
		    md = MessageDigest.getInstance("MD5");
		    // 计算md5函数
		    md.update(password.getBytes());
		    // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
		    // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
		    String pwd = new BigInteger(1, md.digest()).toString(10);
		    return pwd;
		   } catch (Exception e) {
		    e.printStackTrace();
		   }
		   return password;
		}
```


## My97DataPicker选取时间 ##

想想如果每次都让你手动输入日期，是不是一件很烦人的事情？

在选取日期这块，我使用了My97DataPicker，其实它有很多花里胡哨的效果，有时间的话可以好好学习一下，我本次用到的只有基本的日期选取。

使用方法也很简单，可以用“揪掉头就能吃啊”形容。

首先，在我们的jsp文件中把它import进来：

**< script type = "text/javascript" src = "My97DatePicker/WdatePicker.js"  > < /script >**

然后进行使用就好了：

**< input id="d421" name="businessCommand.beginT" class="Wdate" type="text" onfocus="WdatePicker({maxDate:'%y-%M-%d'})" />**

**效果展示：**

![date.png](https://i.loli.net/2018/04/28/5ae3ea88dd121.png)