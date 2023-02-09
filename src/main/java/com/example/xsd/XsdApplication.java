/*
package com.example.xsd;

import com.example.xsd.config.Company;
import com.example.xsd.config.Configuration;
import com.example.xsd.config.Processor;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XsdApplication {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(Configuration.class);
		ctx.refresh();
		Processor processor = ctx.getBean(Processor.class);
		Company company = new Company();
		company.setCompanyId(1932);
		company.setCompanyName("mysuruSansal");
		company.setCompanyCEO("ARchfdsd");
		company.setNumberOfEmployee(789);
		processor.objectToXml("country.xml", company);
	*/
/*	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Marshaller marshaller = (Marshaller)context.getBean("jaxbMarshallerBean");

		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("Sonoo Jaiswal");
		employee.setSalary(100000);

		marshaller.marshal(employee, new StreamResult(new FileWriter("employee.xml")));

		System.out.println("XML Created Sucessfully");
		QName qName = new QName("com.atos.nextcare.orm", "ORMO01CONTENT");
		JAXBElement<Employee> root = new JAXBElement<>(qName, Employee.class, null);

		StringWriter sw = new StringWriter();
		marshaller.marshal((Object) root, (Result) sw);
		*//*


	}


}
*/
