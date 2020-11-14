package springTest.TestAutowired;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * @description:
 * @projectName:myPracties
 * @see:springTest.TestAutowired
 * @author:translafor
 * @createTime:2020/11/13 11:42
 * @version:1.0
 */
public class Test {
    //https://www.jianshu.com/p/9be58ee20dee  反射
    public static void main(String[] args) {
        HelloController helloController = new HelloController();
        //Class代表类的实体，在运行的Java应用程序中表示类和接口
        Class<? extends HelloController> clazz = helloController.getClass();
        //getDeclaredFields()	获得所有属性对象
        Field[] declaredFields = clazz.getDeclaredFields();
        //流式编程遍历属性
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            //getAnnotation(Class<A> annotationClass)	返回该类中与参数类型匹配的公有注解对象
            Annotation annotation = field.getAnnotation(Autowired.class);
            if(null!=annotation&&annotation instanceof Autowired){
                Class<?> type = field.getType();
                Object o = null;
                try {
                    //newInstance()	创建类的实例
                    o = type.newInstance();
                   // set(Object obj, Object value)	设置obj中对应属性值
                    field.set(helloController,o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(helloController.getHelloService());

    }
}
