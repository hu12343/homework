package untils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final Configuration config;
    private  static final SessionFactory factory;
    static
    {
        config=new Configuration().configure();
        factory=config.buildSessionFactory();
    }
    public  static Session getSession()
    {
        return factory.openSession();
    }
}
