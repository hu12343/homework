import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import test.BookEntity;

public class HT {
 @Test
    public void insertTest()
 {
     Configuration config =new Configuration().configure();
     SessionFactory sessionFactory=config.buildSessionFactory();
     Session session=sessionFactory.openSession();
     Transaction t=session.beginTransaction();
    BookEntity bookEntity=new BookEntity();
    bookEntity.setMingzi("shyshy");
    bookEntity.setPrice("1021554241424");
    bookEntity.setShuliang("11112242413311");
    bookEntity.setZuozhe("hulumiao");
    session.save(bookEntity);
    t.commit();
    session.close();
    sessionFactory.close();
 }
}
