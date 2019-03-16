package hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import entity.User;
public class HibernateTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	@Test
	public void test() {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		//配置对象和服务注册对象和会话工程配置文件已经弄好，直接获得会话工程
		sessionFactory=(SessionFactory)factory.getBean("sessionFactory");
		//只能使用会话工程方式，因为配置文件的它就是会话工程方式
		session = sessionFactory.openSession();
		//开启事务
		transaction=session.beginTransaction();
		User student=new User("xiao","tyudfddty");
		session.save(student);
	}
	@After
	public void destory() {
		transaction.commit();//提交事务
		session.close();//关闭会话
		sessionFactory.close();//关闭会话工厂
	}

}
