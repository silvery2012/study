import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;

public class TestCase {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext);

        Calendar calendar1 = applicationContext.getBean("calenderObject1", Calendar.class);
        System.out.println(calendar1);

        Calendar calendar2 = applicationContext.getBean("calenderObject2", Calendar.class);
        System.out.println(calendar2);

        Date date = applicationContext.getBean("dataObject", Date.class);
        System.out.println(date);
    }
}
