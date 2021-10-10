/**
 * Project name(项目名称)：方法重载
 * Package(包名): PACKAGE_NAME
 * Class(类名): overload
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/10
 * Time(创建时间)： 19:06
 * Version(版本): 1.0
 * Description(描述)： Java 允许同一个类中定义多个同名方法，只要它们的形参列表不同即可。
 * 如果同一个类中包含了两个或两个以上方法名相同的方法，但形参列表不同，这种情况被称为方法重载（overload）。
 * 方法重载的要求是两同一不同：同一个类中方法名相同，参数列表不同。至于方法的其他部分，如方法返回值类型、修饰符等，与方法重载没有任何关系。
 * 使用方法重载其实就是避免出现繁多的方法名，有些方法的功能是相似的，如果重新建立一个方法，重新取个方法名称，会降低程序可读性。
 */

public class overload
{
    public void max(int a, int b)
    {
        // 含有两个int类型参数的方法
        System.out.println(a > b ? a : b);
    }

    public void max(double a, double b)
    {
        // 含有两个double类型参数的方法
        System.out.println(a > b ? a : b);
    }

    public void max(double a, double b, int c)
    {
        // 含有两个double类型参数和一个int类型参数的方法
        double max = (double) (a > b ? a : b);
        System.out.println(c > max ? c : max);
    }

    public static void main(String[] args)
    {
        overload ol = new overload();
        System.out.println("1 与 5 比较，较大的是：");
        ol.max(1, 5);
        System.out.println("5.205 与 5.8 比较，较大的是：");
        ol.max(5.205, 5.8);
        System.out.println("2.15、0.05、58 中，较大的是：");
        ol.max(2.15, 0.05, 58);
    }
}
