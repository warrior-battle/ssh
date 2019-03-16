package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction transaction;
	static {
		//创建配置对象
				Configuration config=new Configuration().configure();
				//创建服务注册对象
				ServiceRegistry serviceRegistry= new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
				//创建会话工厂对象
				sessionFactory=config.buildSessionFactory(serviceRegistry);
				//会话对象
				session=sessionFactory.getCurrentSession();
				//开启事务
				transaction=session.beginTransaction();
	}
	
	//获取SessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//获取Session
	public static Session getSession(){
		session=sessionFactory.getCurrentSession();
		return session;
	}
	
}
