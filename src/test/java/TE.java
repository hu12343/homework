import org.hibernate.Session;
import org.junit.Test;
import test.CourseEntity;
import test.CustomEntity;
import test.OrderEntity;
import test.StudentEntity;
import untils.HibernateUtils;

public class TE {
    @Test
    public void test1()
    {
        Session session= HibernateUtils.getSession();
        session.beginTransaction();
        CustomEntity c=new CustomEntity();
        c.setName("胡");
        OrderEntity orderEntity1=new OrderEntity();
        orderEntity1.setAddress("上海");
        orderEntity1.setPrice(10000d);
        OrderEntity orderEntity2=new OrderEntity();
        orderEntity2.setPrice(5000d);
        orderEntity2.setAddress("北京");
        orderEntity1.setCustomEntity(c);
        orderEntity2.setCustomEntity(c);
        c.getOrderEntities().add(orderEntity1);
        c.getOrderEntities().add(orderEntity2);
        session.save(c);
        session.save(orderEntity1);
        session.save(orderEntity2);
        session.getTransaction().commit();
        session.close();

    }
    @Test
    public void test2()
    {
        Session session=HibernateUtils.getSession();
        session.beginTransaction();
        StudentEntity studentEntity1=new StudentEntity();
        studentEntity1.setSname("李四");
        StudentEntity studentEntity2=new StudentEntity();
        studentEntity2.setSname("王五");
        CourseEntity courseEntity1=new CourseEntity();
        courseEntity1.setCname("java");
        CourseEntity courseEntity2=new CourseEntity();
        courseEntity2.setCname("python");
        studentEntity1.getCourseEntities().add(courseEntity1);
        studentEntity2.getCourseEntities().add(courseEntity1);
        studentEntity1.getCourseEntities().add(courseEntity2);
        studentEntity2.getCourseEntities().add(courseEntity2);
        session.save(courseEntity1);
        session.save(courseEntity2);
        session.save(studentEntity1);
        session.save(studentEntity2);
        session.getTransaction().commit();
        session.close();

    }
}
