package com.si;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class SiMain {

	public static void main(String[] args) {
		
		       // Resource res = new ClassPathResource("applicationContext.xml");
		      //  BeanFactory bf = new XmlBeanFactory(res);
		        ApplicationContext bf = new ClassPathXmlApplicationContext("contextApplication.xml");
		        SI s = (SI)bf.getBean("si");
		        float output = new SILogic().CalculateSI(s.getP(),s.getR(),s.getT());
		        System.out.println(output);
		    }
		}