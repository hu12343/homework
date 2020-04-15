import org.hibernate.Session;
import org.junit.Test;
import test.CustomEntity;
import test.OrderEntity;
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
}
