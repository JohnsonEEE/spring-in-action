调试样例内容：
1，基本的beanFactory,applicationContext的启动
2，容器的启动、初始化过程调试：
   a）beanDefinition的加载、解析、注册，包括xml和注解两种方式
   b）容器初始化过程，主要是applicationContext的refresh过程
   c）bean的postPorocess、initMethod、aware方法的调用生命周期等
   d）bean的实例化、依赖注入的原理