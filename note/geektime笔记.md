#### 53.方法重载

方法签名：方法名+依次参数类型。注意，<font color = red>返回值不属于方法签名</font>。方法签名是一个方法在一个类中的唯一标识

同一个类中方法可以重名，但是签名不可以重复。一个类中如果定义了名字相同，签名不同的方法，就叫做方法的重载。

#### 54.重载的参数匹配规则

方法调用的时候，参数就不必完全类型一样，对于数字类型的参数，实参数可以自动类型转换成形参类型即可。

重载时如果参数类型不完全匹配怎么办？

​	依次使用byte, short, int, long, float, double 类型的参数调用方法

​	无论是否重载参数类型可以不完全匹配的规则是 “实参数可以自动类型转换成形参类型”

​	重载的特殊之处是，参数满足自动类型转换的方法有好几个，重载的规则是选择```最近```的去调用。

#### 56.构造方法的重载和互相调用

​	在构造方法里才能调用重载的构造方法。语法为this(实参列表)

​	在构造方法不能自己调用自己，这会是一个死循环

​	在调用重载的构造方法时，不可以使用成员变量。因为用语意讲，这个对象还没有被初始化完成，处于中间状态

​	在构造方法里才能调用重载的构造方法时，必须是方法的第一行。后面可以继续有代码

#### 57.静态变量(也叫做类变量)

尽量不要使用 Magic Number

​	静态变量使用 ```static```修饰符

​	静态变量如果不赋值，Java也会给它赋以其类型的初始值

​	静态变量一般使用全大写字母加下划线分割。这是一个习惯用法

​	所有的代码都可以使用静态变量，只要根据防范控制符的规范，这个静态变量对其可见即可

​	但是如果没有```public```修饰符，只能当前包的代码能使用它。

使用```import static```来引入一个静态变量，就可以直接用静态变量名访问了；

```import static```也可以使用通配符```*```来引入一个类里面所有静态变量

#### 58.静态方法

静态方法(也叫类方法)的特点：只能使用参数和静态变量。换言之，就是没有this自引用的方法。

​	除了没有this，静态方法的定义和成员方法一样，也有方法名，返回值和参数

​	静态方法没有this自引用，它不属于某个实例，调用的时候也无需引用，直接用类名调用，所以它也不能直接访问成员变量

​	当然在静态方法里面，也可以自己创建对象，或者通过参数，获得对象的引用，进而调用方法和访问成员变量

​	静态方法只是没有this自引用的方法而已。

#### 59.静态方法的重载

#### 60.静态代码块

​	使用某个静态变量的代码块必须在静态变量后面；

#### 61.方法喝属性的可见性修饰符

​	可见性修饰符：```public```:全局可见；```缺省```：当前包可见；```private```:当前类可见;

​	访问修饰符不只是为了限制不让人用，更为了有规矩才成方圆。成员变量应该是```private```的，不需要让外部使用的方法应该都是```private```的。

#### 62.重新认识Math和Scanner

​		Math： 我们调用的都是  ```Math``` 里的静态方法，```Math```的构造函数就是 ```private```的，意味着不能创建 ```Math```类的实例；

​					原来归根结底，```Math```的```random```是用的```Random```类来实现的。它在```java.util```包里；

​		Scanner是一个方便的可以帮我们从标准输入读取并转换数据的类

​		注释里面 ```@since 1.5``` 表示它是从```Java5```才开始有的

#### 64.最熟悉的陌生人：```String```

​	```String```对象最重要的特点：```不可变(immutable)，不可变，不可变```，重要的事情说三遍。```String```用来存储字符的数据是```private```的，而且不提供任何修改内容的方法，所以```String```对象一旦生成，其内容就是完全不可能被修改的；

​	```String```常用方法：

```java
		String content = "0123456789ABCDefgh";

        //String 的 length() 是个方法不是属性
        System.out.println(content.length());

        //字母转成大写
        System.out.println(content.toUpperCase());	
        //字母转成小写
        System.out.println(content.toLowerCase());

        //content 指向对象的内容并没有变化
        System.out.println(content);

        //获取某个位置的值
        System.out.println(content.charAt(1));

        //截取:从第几个位置开始截，一直到最后
        System.out.println(content.substring(5));

        //截取：从第几个位置到第几个位置截取一段
        System.out.println(content.substring(1,5));

		String str = "  abd  ";
        System.out.println(str);
        System.out.println(str.trim());
```

#### 66.重新认识老朋友：```main```方法和```System```类

```main```方法也只是一个静态的，有```String[]```做参数的，没有返回值的方法而已。它的特殊性在于```Java```可以把```main```方法作为程序入口

#### 67.```String```的好兄弟

```StringBuilder```是一个非常方便的用来拼接和处理字符串的类，和```String```不同的是，它是可变的。

常用方法：```toStirng()```,```reverse()```,```delete()```,```insert()```。

#### 68.继承

继承的语法和作用：

​	子类继承了父类的方法和属性；

​	使用子类的引用可以调用父类的共有方法；

​	使用子类的引用可以访问父类的共有属性；

​	就好像子类的引用可以一物二用，既可以当作父类的引用使用，又可以当作子类的引用使用。

具体：

​	继承的语法就是在类后面使用	```extends```加要继承的类名；

​	被继承的类叫做父类（Parent Class)，比如本例中的```MerchandiseV2```;

​	继承者叫做子类(Sub Class)；

​	```Java```中只允许一个类有一个直接的父类(Parent Class)，即所谓的单继承；

​	别的类也可以继续继承子类；

​	子类继承了父类什么呢？```所有的属性和方法```

​	但是子类并不能访问父类的```private```的成员（包括方法和属性)。

 #### 69.子类对象里藏着一个父类对象

​	继承，其实表达的是一种"is-a" 的关系，也就是说，在你用类构造的世界中，“子类是父类的一种特殊类别”;

​	组合和继承，是拿到一个问题，设计相应的```Java```类的时候，不得不面对的来自灵魂的拷问；

​	“XX到底是YY的一种，还是只是组合了YY?”，“手机到底是手电筒的一种，还是组合了一个可以当手电的闪光灯？"

#### 70.子类想要一点不一样

​	覆盖才是继承的精髓和终极奥义。

​		通过使用和父类方法签名一样，而且返回值也必须一样的方法，可以让子类覆盖(override)掉父类的方法；

​		```覆盖的终极奥义```：也就是说，子类并不是只能把父类的方法拿过来，而且可以通过覆盖来替换其中不适合子类的方法。

​	覆盖可以覆盖掉父类的方法。同一个方法，不同的行为。

​	这，就是多态！

​	方法可以覆盖，属性访问不可以，所以这也是使用方法的一个原因。

​	即使在父类里，只是一个简单的```getName```，但是这样做，子类就可以覆盖掉父类的方法

​	方法不止眼前的代码，还有子类的覆盖。用方法，才能覆盖，才能多态

#### 71.```super```：和父类对象沟通的桥梁

​	子类对象里可以认为有一个特殊的父类的对象，这个父类对象和子类对象之间通过```super```关键字来沟通。

​	使用```super```可以调用父类的方法和属性(当然必须满足访问控制符的控制)

#### 72.```super```：调用父类的构造方法

​	使用```super```调用父类的构造方法，必须是子类构造方法的第一个语句；

​	可以使用表达式；

​	```super```调用构造方法，不可以使用```super```访问父类的属性和方法，不可以使用子类成员变量和方法；

​	可以使用静态变量和方法；

#### 73.父类和子类的引用赋值关系

​	可以用子类的引用给父类的引用赋值，也就是说，父类的引用可以指向子类的对象；

​	但是反之则不行，不能让子类的引用指向父类的对象。因为父类并没有子类的属性和方法。

```重点```

​	

```java
/*因为子类继承了父类的方法和属性，所以父类的对象能做到的，子类的对象肯定能做到，
换句话说，我门可以在子类的对象上，执行父类的方法。

当父类的引用指向子类的实例(或者父类的实例)，只能通过父类的引用，像父类一样操作子类的对象，
也就是说“名”的类型，决定了能执行哪些操作
*/
MerchandiseV2 m = ph;
MerchandiseV2 m2 = new Phone();

/*
ph 和 m 都指向同一个对象，通过ph可以调用getBrand方法，因为ph的类型的Phone，Phone里定义了getBrand方法
*/
ph.getBrand();
//ph 和 m 都指向同一个对象，但是通过 m 就不可以调用 getBrand方法，因为 m 的类型是 MerchandiseV2, MerchandiseV2里没有定义 getBrand方法

//如果确定一个父类的引用指向的对象，实际上就是一个子类的对象(或者子类的子类的对象),可以强制类型转换

Phone aPhone = (Phone) m2;

//父类的引用，可以指向子类的对象，即可以用子类(以及子类的子类)的引用给父类的引用赋值
ShellColorChangePhone shellColorChangePhone = new ShellColorChangePhone();

MerchandiseV2 ccm = shellColorChangePhone;

//父类的引用，可以指向子类的对象，确定MerchandiseV2的引用 ccm 是指向的是 Phone 或者 Phone的子类对象，那么可以强制类型转换
Phone ccp = (phone) ccm;

//确定MerchandiseV2的引用 ccm 是指向的是 ShellColorChangePhone 或者 ShellColorChangePhone的子类对象，那么可以强制类型转换
ShellColorChangePhone scp = (ShellColorChangePhone) ccm;


```

#### 74.多态：到底调用哪个方法？(上)

​		可以调用哪些方法，取决于引用类型。具体调用哪个方法，取决于实例所属的类是什么。

​		

```Java
/**
* 虽然是用的父类的引用指向的不同类型的对象，调用 getName 方法时，实际执行的方法取决于对象的类型，而非引用的类型 
* 也就是说，能调用哪些方法，是引用决定的，具体执行哪个类的方法，是引用指向的对象决定的。
* 这就是覆盖的精髓。覆盖是多态的一种，是最重要的一种。
* 以 getName 为例，父类里有这方法，所以肯定都可以调用，但是 Phone 覆盖了父类的 getName 方法
* 之前我们使用子类的引用指向子类的对象，调用被子类覆盖父类的方法，实际执行的还是子类里的 getName 方法
* 当我们用父类的引用指向一个 Phone 的实例，并调用 getName 方法时，实际调用的就是 Phone 类里定义的 getName 方法
*
* 如果子类里没有覆盖这个方法，就去父类里找，父类里没有，就去父类的父类找。反之只要能让一个引用指向这个对象
* 就说明这个对象肯定是这个类型或者其子类的一个实例(否则赋值会发生 ClassCastException)，总归有父类兜底。
/
```

#### 75.多态：到底调用哪个方法？(下)

```Java
/**
* 总结：无论一个方法是使用哪个引用被调用的，“它都是在实际的对象上执行的”。执行的任何一个方法，都是这个对象所属的类的方法。
* 如果没有，就去父类找，再没有，就去父类的父类找，依次寻找，直到找到。
*
* 换个角度理解。我们一直说子类里又一个(特殊的)父类对象。这时候，这个特殊的父类的对象里的 this 自引用，是子类的引用。
* 那么自然的，即使是在继承自父类的代码里，去调用一个方法，也是先从子类开始，一层层继承关系的找。
*
* 这也是Java选择单继承的重要原因之一。在多继承的情况下，如果使用不当，多态可能会非常复杂，以至于使用的代价超过其带来的好处。
*/
```

#### 76.多态里更多的语法点

静态多态：重载(Overload)

```java
//重载调用哪个方法，和参数的引用类型相关，和引用实际指向的类型无关
merchandiseTest.testMerchandiseOverload(m);
merchandiseTest.testMerchandiseOverload((Phone) m);
merchandiseTest.testMerchandiseOverload((ShellColorChangePhone) m);

//甚至是个 null 也可以，但是要用强制类型转换，告诉Java这个类型是什么，否则找不到一个唯一的方法去调用
//重载的参数类型，相同位置，不一定要有继承或者兼容的关系，完全 free style
 merchandiseTest.testMerchandiseOverload("");

// 引用本身是 null 没关系，确定调用哪个方法只需要引用的类型。这叫做静态多态。即在编译期就知道该调用哪个方法
 m = null;
 merchandiseTest.testMerchandiseOverload(m);
 merchandiseTest.testMerchandiseOverload((Phone) m);
 merchandiseTest.testMerchandiseOverload((ShellColorChangePhone) m);

//如果引用类型没有完全匹配的，则会根据继承关系，沿着参数当前类型，向下撸
        merchandiseTest.testMerchandiseOverloadNotExactlyMatchType((ShellColorChangePhone) null);

//重载总结：静态多态，调用的方法和参数实际指向的对象无关，只和引用本身的类型相关。
//因为调用时参数类型是确定的，所以，在编译期间就可以明确的知道哪个方法会被调用。如果有多种可能，则会有编译错误。
//如果没有类型完全匹配的候选，则根据类型的继承关系向下撸着找。找到最贴近参数类型的那个方法。
//无论是静态方法，还是成员方法，重载寻找方法的顺序是一样的，在这里就不赘述了
//



```

​	动态多态：覆盖(Override)

​	

```java
// TODO 让重载的归重载，剩下的是覆盖的舞台
// TODO 重载决定了要调用参数为 int 的方法，这个方法要在m指向的对象上执行
```

#### 78.```Instanceof```操作符

​	```instanceof``` 操作符，可以判断一个引用指向的对象是否是某一个类型或者其子类,是则返回true，否则返回false

```Java
int merchandiseCount = 600;
        LittleSuperMarket superMarket = new LittleSuperMarket("小超市","北京路1号",500,merchandiseCount,100);
        // >> TODO instanceof 操作符，可以判断一个引用指向的对象是否是某一个类型或者其子类
        //    TODO 是则返回true，否则返回false
        for(int i =0; i < merchandiseCount; i ++)
        {
            MerchandiseV2 m = null; // superMarket.getMerchandiseOf(i);
            if(m instanceof MerchandiseV2)
            {
                // TODO 先判断，再强制类型转换，比较安全
                MerchandiseV2 ph = (MerchandiseV2) m;
                System.out.println(ph.getName());
            }
            else{
                System.out.println("not an instance");
            }

            // >> TODO 如果引用是null，则肯定返回false

        }
```

#### 80.```final```修饰符

​	```final```修饰符：不可被继承

​	```final```修饰方法：不可被子类覆盖

​	```final```修饰变量：不可被赋值。

#### 84.万类之祖：```Object```类

​	 所有的类，都间接或者直接的继承自```Object```类。

#### 85.```hashCode```和```equals```方法初探

​	```hashCode```可以翻译为哈希码，或者散列码。应该是一个表示对象的特征值的```int```整数。

​	```equals```方法应该用来判断两个对象从逻辑上是否相等

​	

```Java
// hashCode 和 equals 是我们最常覆盖的两个方法
// 覆盖的原则是，equals 为 true, hashCode 就应该相等。这是一种约定俗成的规定。
// 即 equals 为true 是hashCode相等的充分非必要条件， hashCode相等是equals	为ture的必要不充分条件。
@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MerchandiseV2)) return false;
        MerchandiseV2 that = (MerchandiseV2) o;
        return this.getCount() == that.getCount() &&
                Double.compare(that.getSoldPrice(), getSoldPrice()) == 0 &&
                Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
                getName().equals(that.getName()) &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getCount(), getSoldPrice(), getPurchasePrice());
    }
```

#### 87.```toString```方法

​	自动生成```toString```方法

```Java
@Override
    public String toString() {
        return "MerchandiseV2{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", count=" + count +
                ", soldPrice=" + soldPrice +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
```

#### 88.初探```Class```类

​	```Class```类是代表类的类。每个```Class```类的实例，都代表了一个类

#### 89.初探反射(上)

​	使用反射(reflection) 访问属性

```Java
Field countField = clazz.getField("count");
//Field countField = clazz.getDeclaredField("count"); //针对 private 变量，使用 getDeclaredField
//countField.setAccessible(true);     //针对 private 变量，强制使用代码
System.out.println("通过反射得到的count值:" + countField.get(m100));
countField.set(m100,998);
System.out.println(countField.get(m100));
System.out.println(m100.getCount());
```

​	使用反射访问方法

```Java
Method desc_method = clazz.getMethod("describe");
desc_method.invoke(m100);
desc_method.invoke(superMarket.getMerchandiseOf(0));
desc_method.invoke(superMarket.getMerchandiseOf(10));
 m100.describe();

Method staticMethod = clazz.getMethod("getNameOf", MerchandiseV2.class);
String str = (String) staticMethod.invoke(null,m100);
System.out.println(str);
```

​	使用反射访问静态方法和属性

```Java
Method staticMethod = clazz.getMethod("getNameOf", MerchandiseV2.class);
String str = (String) staticMethod.invoke(null,m100);
System.out.println(str);
```

​	使用反射访问```private```的方法和属性

```Java
Field countField = clazz.getDeclaredField("count"); //针对 private 变量，使用 getDeclaredField
countField.setAccessible(true);     //针对 private 变量，强制使用代码
System.out.println("通过反射得到的count值:" + countField.get(m100));
countField.set(m100,998);
System.out.println(countField.get(m100));
System.out.println(m100.getCount());
```

​	反射是什么

#### 91.面向对象三要素：封装、继承、多态

​	封装解决了什么问题，带来了什么问题

​	继承解决了什么问题，带来了什么问题

​	多态解决了什么问题，带来了什么问题

#### 92.枚举

​	定义枚举类格式

```Java
//TODO 使用enum 声明，而非 class
public enum  Category {

    FOOD(1),
    COOK(3),
    SNACK(5),
    CLOTHES(7),
    ELETHRIC(9)
    ;

    //可以有属性
    private int id;

    // 构造方法是 private 的， 不写private默认就是private
    Category(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
```

​	常用实例

```Java
//TODO 获取所有枚举，看看枚举有哪些方法
for (Category category:Category.values())
{
    System.out.println("--------" + category.getId() + "-----------");
    System.out.println(category.ordinal());
    System.out.println(category.name());
    System.out.println(category.toString());
}

//TODO 根据名字获取枚举
System.out.println();
System.out.println(Category.valueOf("FOOD"));
```

#### 93.接口

​	接口的定义使用 ```interface```，而非```class```

​	接口中的方法，就是这个类型的规范，接口专注于规范，怎么实现这些规范，它不管

​	接口无法被实例化，也就是不可以```new```一个接口的实例

```Java
//TODO 接口里的方法都是 public abstract 修饰的，方法有名字，参数和返回值，没有方法体，以分号;结束。
//TODO 接口注释最好写一下
/**
*
* @param days 截止到当前，保质期超过的这么多天
* @return 截止到当前，ture如果保质期剩余天数比参数长，false如果保质期不到这么多天
*/
boolean notExpireInDays(int days);

//TODO 因为接口里的方法都是且只能用 Public abstract修饰，所以这两个修饰符可以省略
//TODO abstract就是抽象方法的修饰符，没有方法体，以分号结束
/**
* @return 商品生产日期
*/
Date getProduceDate();

//TODO 接口不能定义局部变量，定义的变量默认都是 public static final的，这三个修饰符同样可以省略
public static final int VAL_IN_INTEFACE = 100;


```

#### 95.抽象类：接口和类的混合体

​	

#### 96.有方法代码的接口

​	在```Java8```中，接口中允许有缺省实现的抽象方法



#### 97.接口内代码的更多内容

​	在```Java8```中，接口中允许有静态方法，私有方法和带有缺省实现的抽象方法。

​	

### 第三章 ```Java```中的异常处理

#### 105.初识异常：```try catch```

​	异常：在程序出错误的时候，```Java```支持使用异常，将错误信息封装起来， 并让程序跳出正常的处理流程，交给异常处理部分去处理。

```Java
 	//TODO try 语句中如果发生了异常(Exception)，那么程序会跳转到catch语句。
    //TODO Java会将异常信息封装在一个异常类的实例中，ex是指向这个异常实例的引用。
    //TODO “处理” 最简单的方法，就是调用 printStackTrace() 将异常信息输出到控制台
    //TODO catch 语句执行完毕，程序会继续向下顺序执行	
	int[] a = new int[1];
    //try catch
    try {
        a[1] = 34;
    }catch (Exception ex) {
        ex.printStackTrace();
    }
```

#### 106.```Java```中异常的分类

​	1.按照异常的继承关系分类

​		(1)异常也是```Java```中的类

​		(2)所有异常的父类：```Throwable```

​		(3)两类异常：```Error```和```Exception```

​		(4)看一下```Throwable```的继承关系

​	2.按照处理方式不同分类

​		(1)```checked exception```：语法要求必须要用```try catch```或者```throws```语句处理的异常

​		(2) ```unchecked exception```：语法不要求一定要用```try catch```或者```throws```语句处理的异常

​		(3) ```Error```和```RuntimeException```是 ```unchecked exception```的父类。我们一般使用 ```RuntimeException```

​		(4)

#### 107.抛出异常的语法

​	抛出别的代码抛过来的异常

```Java
//TODO 可以使用 throws 关键字，抛出一个异常
//TODO 抛出的异常类型，可以是实际异常的父类或者本身
//TODO 可以抛出多种类型的异常，用逗号分开就可以
public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException { //抛出实际异常本身
//    public static void main(String[] args) throws Exception{        //抛出实际异常的父类
        //throws ClassNotFoundException
        Class clazz = Class.forName("com.jiangrzc.ThrowIt");
        //throws NoSuchFieldException
        clazz.getField("");
}
```

​	抽象方法中声明抛出的异常是接口方法签名的一部分

```Java
//接口类
public interface IntfWithEx {

    //定义接口
    void throwsException() throws Exception;

    //
    void unthrowsException();
}

```

```Java
//实现类

public class IntfWithExImpl implements IntfWithEx {

    @Override
    public void throwsException() throws Exception {
        //TODO 接口声明中抛出了异常，实现方法中可以抛也可以不抛
        //TODO 如果抛的话，必须是接口声明中异常的子类或其本身

        throw new Exception("");
    }

    @Override
    public void unthrowsException() {
        //TODO 接口声明中没有抛出异常，实现方法中可以不抛，也可以抛RuntimeException.
        //TODO 如果抛 checked Exception，就会出错
        //throw new Exception("");
        //TODO 解决方法可以把上述 try catch 住，封装在此方法中

        try {
            throw new Exception("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //TODO 抛 unchecked Exception 是可以的
        throw new RuntimeException("");
    }
}
```

#### 108.```Java```异常的传递

​	1.方法一个调一个的层层调用，组成了方法调用栈。

​	2.学习Java异常在方法调用之间传递。

​	3.```Java```异常的归宿：要么沿着方法调栈顺序一路抛，最终造成当前线程退出，要么被```catch```住。

```Java
/**
*	Caller1
*/
public class Caller1 {
    //
    Caller2 caller2 = new Caller2();

    public void call2RTException(){
        System.out.println("Caller1.call2RTException开始");
        caller2.call3RTException();
        System.out.println("Caller1.call2RTException结束");
    }

    //TODO 我们可以在调用链的任何一个地方，catch异常，阻止异常的传递
    public void call2Exception() throws ClassNotFoundException {
        System.out.println("Caller1.call2Exception开始");
//        try{
//            caller2.call3Exception();
//        }catch (ClassNotFoundException ex){
//            System.out.println("got exception in Caller1:" + ex.getMessage());
//        }
        caller2.call3Exception();
        System.out.println("Caller1.call2Exception结束");
    }
}
/**
*	Caller2
*/
public class Caller2 {
    //
    Caller3 caller3 = new Caller3();

    public void call3RTException(){
        System.out.println("Caller2.call3RTException开始");
        caller3.callThrowRTException();
        System.out.println("Caller2.call3RTException结束");
    }

    public void call3Exception() throws ClassNotFoundException {
        System.out.println("Caller2.call3Exception开始");
        try{
            caller3.callThrowException();
        }catch (ClassNotFoundException ex){
            System.out.println("got exception in Caller2:" + ex.getMessage());
        }

        System.out.println("Caller2.call3Exception结束");
    }

}

/**
*	Caller3
*/

public class Caller3 {
    public void callThrowRTException(){
        System.out.println("Caller3.callThrowRTException开始");

        String str = null;
        str.toUpperCase();  //或者 str.toString() 也可以，只要是能触发异常

        System.out.println("Caller3.callThrowRTException结束");

    }

    public void callThrowException() throws ClassNotFoundException {
        System.out.println("Caller3.callThrowException开始");

        //checked exception
        Class.forName("com.neverland.Rabbit");

        System.out.println("Caller3.callThrowException结束");

    }
}
/**
*	CallExceptionAppMain
*/

public class CallExceptionAppMain {
    public static void main(String[] args) throws ClassNotFoundException {
        callMake();
    }

    private static void callMake() throws ClassNotFoundException {
        // >> TODO 检查异常强制处理，需要明确的throws或者catch

        Caller1 caller1 = new Caller1();

        System.out.println("开始调到");
        caller1.call2Exception();
        System.out.println("结束调用");
    }
}
/**
*	CallRTExceptionAppMain
*/

public class CallRTExceptionAppMain {

    public static void main(String[] args) {
        callMake();
    }

    private static void callMake() {
        // >> TODO RuntimeException，也就是unchecked exception不强制处理，所以冷不丁吃到一个RuntimeException，程序会失败

        Caller1 caller1 = new Caller1();

        System.out.println("开始调到");
        caller1.call2RTException();
        System.out.println("结束调用");
    }

}

```

​	4.线程，```Thread```。我们可以简单的认为是帮我们执行代码的那个东西，到现在我们学习的都是单线程的程序。后面我们会学习多线程的东西。

#### 109.自定义异常

​	异常最重要的信息：类型，错误信息和出错时的调用栈。

```Java
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
```

#### 110.异常传递不是凌波微步

​	异常代表程序出错，不要使用异常来做正常的程序跳转

​	错误的示例：使用 “凌波微步”跳转到 ```catch```语句

​	异常不是凌波微步，异常的创建和处理很耗费资源

#### 111.```try catch final```语句

​	1.```try catch finally```语句

```Java
try{
	 String str = null;
//   String str = "abc";
     return str.length();
}catch (Exception ex){
// >> TODO 异常的处理：在有返回值的情况下，返回一个特殊的值，代表情况不对，有异常

	System.out.println("进入catch 中，执行return语句");
   	len = 1;
    return len;
}finally {
// >> TODO 可以认为 finally语句会在方法返回后，后面的方法开始前，会在return语句后
// >> TODO 无论是因为 return 结束还是因为异常结束，finally 语句都会执行
	System.out.println("进入finally中执行finally 语句");
// >> TODO finally里最好不要有 return 语句, 它会覆盖掉上面的return值
// return -1;

// >> TODO finally里给return 用的变量赋值没有用
// len = -2;
	VAL = 99;
     System.out.println("finally执行完毕");
}
```

2. ```try finally```语句

   ```Java
   try{
       String str = null;
   //  String str = "abc";
       return str.length();
   }finally {
   	// >> TODO 可以认为 finally语句会在方法返回后，后面的方法开始前，会在return语句后
       // >> TODO 无论是因为 return 结束还是因为异常结束，finally 语句都会执行
   	System.out.println("进入finally中执行finally 语句");
       // >> TODO finally里最好不要有 return 语句, 会打乱exception传递
   //            return -1;
   
       // >> TODO finally里给return 用的变量赋值没有用
   //            len = -2;
   	VAL = 99;
   	System.out.println("finally执行完毕");
   }
   ```

3. ```catch```的多种异常

```Java
private static void catchMultiOld(){
    try {
            throwMultiException(0);
    // >> TODO 如果一个方法抛出多种异常，可以针对多个类型有多种 catch 语句
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
}

private static void catchMultiTypeMultiMacth(){
    try {
            throwMultiException(0);
            // >> TODO catch 的类型不能有多种匹配可能，否则会出错
//        }catch (Exception e){
//            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
}

private static void catchMultNew(){
    try {
            throwMultiException(0);
            // >> TODO 如果捕捉了不同类型的异常，但是处理方式一样，可以用简化模式
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
}

private static void throwMultiException(int i) throws IOException, ClassNotFoundException {
        switch (i){
            case 1:
                throw new NullPointerException("demo");     //unchecked exception
            case 2:
                throw new ClassNotFoundException("demo");   //checked exception
            case 3:
                throw new IOException("demo");              //checked exception
        }
    }
```

#### 112.自动回收资源的try语句

​	和资源相关的异常处理比较繁复，尤其是有多个资源的时候

​	例程：如何让资源回收的方法自动被调用

#### 113.```Java```中常见的异常

​	1.```NullPointerException```:空指针，```RunTimeException```，```unchecked exception```不需要检查

​	2.```IndexOutOfBoundsException```:数组、链表等越界。```RunTimeException```，```unchecked exception```不需要检查

​	3.```ClassCastException```：类，把一个引用强转成另一个引用。```RunTimeException```，```unchecked exception```不需要检查

​	4.```ClassNotFoundException```：找不到类。```checked exception```，需要检查

​	5.```IOException```: 文件IO,数据IO等相关。```checked exception```，需要检查

	### 第四章 ```Java```中的常用工具类和新语法

#### 114.```Collection```类族简介

​	1.数据结构

​		数据结构是组织数据的方式，我们可以朴素的认为，数据结构+算法=程序

​		数组(Array) 就是一种最基本的数据结构，编程语言一般本身就支持这种数据结构

​		计算机中基础的数据结构有 ```List```,```Set```,```Queue```,```Map```。比较高级一点的有 ```Tree```,```Heap```。这些数据结构需要代码来实现。这些实现也是一个个的类，只是专注的问题更抽象和通用。

​	2.认识```Collection```类族

​		```Collection```代表一堆元素，中文一般翻译为集合。

​		```Collection```接口的继承者和它们的实现构成了我们所谓的```Collection```类族

#### 115.```Collection```中的```List```

​	1.```List``` 代表有顺序的一组元素，中文一般翻译为链表。顺序代表遍历```List```的时候也是有顺序的

​	2.使用数组实现一个简单的```List```接口

```Java
public class MyAarryList implements List {

    private Object[] elements;
    private int curr;

    public MyAarryList() {
        elements = new Object[16];
        curr = 0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ele:elements){
            if (Objects.equals(ele,o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(curr == elements.length - 1){
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);    //将原数组复制到新数组
            elements = temp;
        }
        elements[curr] = o;
        curr ++;
        return true;
    }


    @Override
    public void clear() {
        curr = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > curr){
            throw new IndexOutOfBoundsException("out of bound" + curr + "for " + index);
        }
        return elements[index];
    }

```

​	3.使用引用实现一个最简单的```List```接口

```Java
public class MyLinkedList implements List {

    static class ListNode{

        public ListNode(ListNode prev, ListNode next, Object value){
            this.prev = prev;
            this.next = next;
            this.value = value;
        }

        ListNode prev;
        ListNode next;
        Object value;
    }

    private ListNode start = null;
    private ListNode tail = null;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        ListNode curr = start;
        while(curr != null){
            if(Objects.equals(curr.value,o))
                return true;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        ListNode newNode = new ListNode(tail,null,o);
        if(start == null)
            start = newNode;
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
        size ++;
        return true;
    }

    @Override
    public void clear() {
        start = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("out of bound:" + index + "in " + size);
        }
        ListNode curr = start;
        for(int i = 0; i < index; i ++)
        {
            curr = curr.next;
        }
        return curr.value;
    }

```



#### 116.```Collection```中的```Set```

​	1.```Set```代表一个元素不重复的集合，也就是说，```Set```中的元素两两不相等

​	2.学习```Java```中```Set```的最常用的实现类```HashSet```。```HashSet```顾名思义，是使用了元素的```hash```值帮助做去重的。

​	3.```HashCode```和```equals```符合这样一个约定：```equals```返回```true```, ```HashCode```必须相等。很多```Java```类库中的代码都是按种约定使用这两个方法的，比如```HashSet```。这也是为什么我们要求如果一个类覆盖了```HashCode```方法，就一定要覆盖```equals```方法，并保证方法的实现符合上述约定。

#### 117.泛型简析

​	1.泛型的使用

​		泛型英文名叫做```generics```，一系列和泛型 相关的名词都是以```generic```为前缀的，比如后面我们马上要学习的```Generic Method, Generic Types````等。

​		例程：让一个```List``` 帮我们存储多个```String```对象; 使用泛型，让一个```List``` 里只有```String```

```Java
// TODO 我知道我没用，我的告诉Java说这个List里面只有String，方法就是使用泛型
    public static List<String> createStringListGeneric(){
        // TODO 泛型的语法就是在支持泛型的类型上，给出类型的定义
        // TODO List接口是支持泛型的，类型就是List里面允许的类型
        // TODO 创建List实例和引用的时候，都可以(非必要)指定泛型对应的类型
        // TODO 不指定，那就是Object,所以我们之前用的List的元素就是 Object类型
        List<String> ret = new ArrayList<>();
        for (int i = 0; i< 10; i ++){
            // TODO 如果尝试强制增加非String类型的元素进去，则会报错
            ret.add("str" + (i % 5));
//            ret.add(9);
        }
        return ret;
    }
```

​		解决的问题：让```List```中只有一种类型的元素，使用时不用强制类型转换。

```Java
 public static void useStringListGeneric(){
        // TODO 使用List<String> 类型的引用，指向泛型的list
        List<String> listStr = createStringListGeneric();
        for(int i = 0; i < 10; i ++){
            // TODO 不用再强转，用着好方便，极度舒适
            String str = listStr.get(i).toUpperCase();
            System.out.println(str);
        }
   }
```

​	2.泛型的定义

​		在方法中定义泛型，即```Generic Methods```

​		在类型中定义泛型，即 ```Generic Types```。类型可以是类，也可以是接口

​		

#### 120.再探泛型

​	1.有界类型

​	2.泛型的深水区：协变和逆变

​	3.泛型必须记住两句话： 

​		(1) 编译期检查并类型擦除

​		(2) 使用时的类型转换

#### 121.```Iterator```接口

​	

#### 122. Map : key 和 value 的映射

​	1.常用方法： 

```Java
//增加一个键值对
hash.put(key, value);
//根据key 获取 值value
hash.get(key);
//根据 key 删除键值对
hash.remove(key);
```









#### 126. 基本数据类型的自动装箱

​	1.从 Java 第一个版本开始，Java就为每种基本数据类型提供了封装的类，以便可以将其当作类而非基本数据类型使用。比如List,Map这些类，都是操作的Object，无法操作基本数据类型。

​	2.和数字相关的基本数据类型对应的类依次为：Byte, Short, Integer, Float, Double, Long,Character,Boolean。

```Java
// Java提供了自动为每种基本数据类型和其封装类之间的转换功能
// 从基本数据类型到封装类，我们叫做自动装箱，英文叫做 auto boxing;从封装类到基本数据类型，我们叫做自动拆箱，英文叫做 auto unboxing。
Integer ab = 7889; //自动装箱
int cd = ab;	//自动拆箱

```

​	3.所有和数字相关的封装类，都继承自 Number类



#### 127.Java中的File类

​	1.使用File可以判断一个路径是不是文件，文件夹，是不是存在。也可以创建、重命名、删除文件，文件夹。

​	



#### 128. I/O

​	I/O ，是 Input /Output 的缩写，也就是输入输出。这里的输入输出是指不同系统之间的数据输入输出，比如读写文件数据，读写网络数据等

​	Java中有三代IO框架，分别是第一代的流式阻塞IO，第二代的NIO是非阻塞的，第三代的 NIO2又进一步支持了异步IO

​	Java IO 中的类和接口：

​		1.InputStream

​		2.OutputStream

​		3.Reader

​		4.Writer



### 第五章 线程

#### 136. 初识线程

​	1.线程其实就是执行一个入口方法，执行完毕就结束了。比如我们之前写得程序，都是使用一个线程执行 ```main``` 方法，执行完毕后，线程就结束了。

​	2.线程在执行方法的时候，每次遇到方法调用，都会给当前的线程栈增加一层。这一层里保存的，就是线程当前的执行状态，比如当前方法的局部变量的值，当前方法执行到哪里了 等。

​	3.所以线程栈里的每一条，都是方法已经开始执行但是还没有结束的方法。没有结束时有因为它代码还没执行完，或者是在等待其调用的方法执行完。

#### 137.创建自己的线程

​	1.线程也是一个对象，执行完毕 ```Runable```接口里的 ```run```方法，线程就结束了。

​	2.当一个进程里所有的线程都执行结束了，一个进程就执行结束了。

​	3.线程相当于 ```CPU```，它会从入口开始执行代码。一段代码可以被多个线程同时执行。可以通过 ```Thread.currentThread()```获取执行当前代码的线程。

#### 138.再探线程

​	1.Java线程的状态

<img src="D:\personal\learn\1.java\geektime\屏幕截图 2021-08-09 165727.png"></img>

​	2.守护线程和优先级属性

​		守护线程：英文名叫做 ```daemon thread```。如果一个进程里面没有线程，或者线程都是守护线程，那么进程就结束了。

​		只有守护线程，进程就结束了。

​		可以设置线程的优先级，优先级的作用不能保证，这和线程的运行状态以及机器本身的运行状态有关。是不是守护线程都可以设置线程优先级

​	3.线程的 ```interrupt```方法

​		线程的```interrupt```无法真的像这个方法的名字那样让线程中断

​		线程的 ```stop```方法可以让线程结束，但是这会带来很大的隐患，会造成程序状态的错误，比如锁没有释放等。不要再生产的代码里调用这个方法



#### 139.多线程：混乱开始了

​	理解多线程版的结果：线程修改数据，人多手杂，一个线程在改，另一个线程也在改。读取当前值，修改为新的值，写入新的值这三个步骤并非是连续执行的，可能有别的线程的代码乱入。而且现代计算机的CPU都有缓存，让问题就更不可预测。

#### 140.同步控制之 ```synchronized```

	1. ```synchronized``` 关键字用来修饰成员方法，代表这个方法对于同一个对象来说，同一时间只允许一个线程执行，别的线程如果也调用这个实例的这个方法，就需要等待已经在执行这个方法的线程执行完毕，才能进入方法执行
  2. 使用```synchronized``` 解决问题

     ```Java
     
         //synchronized 修饰
         public synchronized void  change(long delta){
             number += delta;
         }
     ```

     

  3. 使用```synchronized``` 修饰静态方法

     ```Java
       //synchronized 修饰静态方法
         public synchronized static void  changeStatic(long delta){
             numberStatic += delta;
         }
     
         @Override
         public void run() {
             for(int i = 0;i < loopCount; i ++)
             {
     //            dataHolder.change(delta);
                 DataHolder.changeStatic(delta);
             }
     
     //        dataHolder.print();
             DataHolder.printStatic();
         }
     ```

     

  4. 使用```synchronized``` 代码块

```java

	 Object block = new Object();    
	//代码块
    public void changeSynchBlock(long delta){
        synchronized (block){
            number += delta;
        }
    }
```

#### 141.同步控制之 ```wait notify```

​	1.来自 ```Object```类里的方法

​	2.应用场景：正如名字所说，当多个线程的互动，需要等待和被唤醒的时候，就可以考虑使用这个语法

​	3.```wait notify``` 和 ```notifyAll``` 

	4. ```lost notification```
 	5. 注意： ```synchronized```不是公平锁
      	1. ​	什么是公平锁呢？就是对于正在等待的线程，当有资源可以使用时，谁先申请的就先分配给谁。

#### 142.多线程经典模型：生产者消费者

​	1.生产者消费者模型简介：产生数据的一方称为生产者，生产者将数据放入队列；从队列获取使用的一方称为消费者，消费者从队列中获取数据进行使用。

​	2.生产者消费者重点：生产的任务不能被忽略或者多次消费

​	3.多线程第一课：程序随时可能停住，别的线程随时可能乱入任何代码

#### 143.线程同步之 ```join```

​	