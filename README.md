## Java12_13_14_15
   http://openjdk.java.net/projects/jdk/
- Java12新特性


    1、switch表达式 使用-> 可以匹配
    2、Shenandoah GC 低延迟GC ，Shenandoah 垃圾回收器的暂停时间与堆大小无关
    3、JVM常量API 引入了ConstantDesc接口
    3.1、String#describeConstable和resolveConstantDesc
    4 微基准测试套件
    5、只保留一个 AArch64 实现
    6、默认生成类数据共享(CDS)归档文件
    7、增强G1，自动返回未用堆内存给操作系统
    8、支持压缩数字格式化
    9、增加项：String新增方法 transform() indent();
    10、unicode 11
- Java13新特性
    
    
    1、switch增强  增加yield关键字
    2、动态CDS归档
    3、ZGC:取消使用未使用的内存
    4、重新实现套接字api NioSocketImpl
    
- Java14新特性
    
    
    1、instanceof 表达式
    2、使用的NullPointerException的提示 
    3、Record语法

- Java15新特性
    
    
    339:	Edwards-Curve Digital Signature Algorithm (EdDSA)
    360:	Sealed Classes (Preview)
    371:	Hidden Classes
    372:	Remove the Nashorn JavaScript Engine
    373:	Reimplement the Legacy DatagramSocket API
    374:	Disable and Deprecate Biased Locking
    375:	Pattern Matching for instanceof (Second Preview)
    377:	ZGC: A Scalable Low-Latency Garbage Collector
    378:	Text Blocks
    379:	Shenandoah: A Low-Pause-Time Garbage Collector
    381:	Remove the Solaris and SPARC Ports
    383:	Foreign-Memory Access API (Second Incubator)
    384:	Records (Second Preview)
    385:	Deprecate RMI Activation for Removal
