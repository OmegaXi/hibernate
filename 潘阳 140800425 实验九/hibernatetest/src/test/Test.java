package test;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Kcb;
import org.util.HibernateSessionFactory;

public class Test {
	   public static void main(String[] args) {
		// 调用HibernateSessionFactory的getSession方法创建Session对象
		Session session=HibernateSessionFactory.getSession();
		// 创建事务对象
		Transaction ts=session.beginTransaction();
		Kcb kc=new Kcb();                       	// 创建POJO类对象
		kc.setKch("198");                        	// 设置课程号
		kc.setKcm("JavaEE");                       	// 设置课程名
		kc.setXf(new Integer(3));		// 设置学分
		kc.setXs(new Integer(48));		// 设置学时
		// 保存对象
		session.save(kc);
		ts.commit();                             	// 提交事务
		Query query=session.createQuery("from Kcb where kch='198'");
		List list=query.list();
		Kcb kc1=(Kcb) list.get(0);
		System.out.println(kc1.getKcm());
		HibernateSessionFactory.closeSession(); // 关闭Session
	   }
	}
