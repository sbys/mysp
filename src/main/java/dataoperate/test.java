package dataoperate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.hello;

/**
 * Created by 12917 on 2017/5/31.
 */
public class test {
    private IDataOperate iDataOperate;
    public IDataOperate getiDataOperate(){
        return  iDataOperate;

    }

    public void setiDataOperate(IDataOperate iDataOperate) {
        System.out.println("setDataOperate dataOperate="+iDataOperate);
        this.iDataOperate = iDataOperate;
    }
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        test t=(test)applicationContext.getBean("run");
        t.getiDataOperate().save("你好");
        hello hello=(pro.hello)applicationContext.getBean("my_proxy");
        hello.sayHello();
    }
}
