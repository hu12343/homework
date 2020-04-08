import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import test.BookEntity;
import test.CustomerEntity;

public class AT {
    @Test
    public void insertTest()
    {
        Configuration config =new Configuration().configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setAge(12);
        customerEntity.setCity("北京");
        customerEntity.setSex("男");
        customerEntity.setName("张三");
        session.save(customerEntity);
        t.commit();
        session.close();
        sessionFactory.close();
    }
    @Test
    public void SelectTest()
    {
        Configuration config =new Configuration().configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        CustomerEntity customerEntity=(CustomerEntity) session.get(CustomerEntity.class,1);
        System.out.println("以下是查询结果:\n"+customerEntity);
        t.commit();
        session.close();
        sessionFactory.close();
    }

}
