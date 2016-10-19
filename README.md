# ribbon

简单的restful API
可以看到，之前启动的两个compute-service服务端分别被调用了一次。到这里，我们已经通过Ribbon在客户端已经实现了对服务调用的均衡负载。

启动方式： 	1、先启动cloud-simple5 （启动eureka）进行接口服务监控
		 	2、启动cloud-simple5_1 (启动api接口)
		 	3、修改server.port后再次启动cloud-simple5_1 (启动api接口负载接口)
		 	4、启动cloud_simple5_2（启动项目入口对外开放的api实际访问接口为2或者3）
		 	5、调用接口进行测试	
		 	
