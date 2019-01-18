package com.suraj.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.suraj.spring.model.HelloMessage;

public class ClientTest {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		HelloMessage hmessage = (HelloMessage)factory.getBean("helloMessage");
		System.out.println(hmessage.getMessageId()+"\t"+hmessage.getMessage());
		System.out.println(factory);
		System.out.println("-------------------");
		System.out.println("demo2");
	}
}
