package test;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Kcb;
import org.util.HibernateSessionFactory;

public class Test {
	   public static void main(String[] args) {
		// ����HibernateSessionFactory��getSession��������Session����
		Session session=HibernateSessionFactory.getSession();
		// �����������
		Transaction ts=session.beginTransaction();
		Kcb kc=new Kcb();                       	// ����POJO�����
		kc.setKch("198");                        	// ���ÿγ̺�
		kc.setKcm("JavaEE");                       	// ���ÿγ���
		kc.setXf(new Integer(3));		// ����ѧ��
		kc.setXs(new Integer(48));		// ����ѧʱ
		// �������
		session.save(kc);
		ts.commit();                             	// �ύ����
		Query query=session.createQuery("from Kcb where kch='198'");
		List list=query.list();
		Kcb kc1=(Kcb) list.get(0);
		System.out.println(kc1.getKcm());
		HibernateSessionFactory.closeSession(); // �ر�Session
	   }
	}
