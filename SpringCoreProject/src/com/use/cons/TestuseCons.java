package com.use.cons;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class TestuseCons {

	
		public static void main(String[] args) {
			Resource res = new ClassPathResource("UseCons.xml");
			BeanFactory factory = new XmlBeanFactory(res);
			Stu s =(Stu) factory.getBean("studentbean");
			
		     s.show();
		}

	}
