# Adapter-Pattern


#### 适配器模式
手机默认使用Type-C USB接口，支持读取以及快速充电。但仍需要支持Micro USB接口，其支持读取以及普通充电。而type-C与micro接口是不兼容的。
因此，提供将Micro USB转为Type-C的适配器。实现当用户使用Micro USB读取数据时，按适配的方式读取；但当充电时，按适配普通充电。  

思路：设计Type-C的基本行为及实现；设计Micro的基本行为及实现；设计一个适配器(包装器)，实现将Micro的行为适配为标准type-c行为。仅需设计适配方法模拟即可。
