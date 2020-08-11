## SOLID
### 单一职责原则(single responsibility principal)
* 一个模块、类、方法不要承担过多的任务 
### 开闭原则（open-close principal）
* 添加一个功能因该是在已有代码的基础上进行扩展而不是修改已有的代码
### 里氏替换原则(liskov substitution principal)
* 子类对象能够替换程序中父类对象出现的任何地方，并且保证原来程序的逻辑行为不变及正确性不被破坏
### 接口隔离原则(interface segregation principal)
* 客户端不应该强迫依赖它不需要的接口
### 依赖倒置原则(dependency inversion principal)
* 高层模块不要依赖低层模块，高层模块和低层模块应该通过抽象来互相依赖，除此之外，抽象不要依赖具体实现细节，具体实现细节依赖抽象