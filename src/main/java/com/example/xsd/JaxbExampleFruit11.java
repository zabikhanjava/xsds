
package com.example.xsd;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import com.example.itrestcontrollerunittest.learnbeanspringconfig.RandomClass;
import com.example.classfromxsd.Student;

public class JaxbExampleFruit11 {

  public static void main(String[] args) throws JAXBException, FileNotFoundException {
    JAXBContext context = JAXBContext.newInstance(Student.class.getClass());

    Unmarshaller um = context.createUnmarshaller();
    Student student = (Student) um.unmarshal(new FileReader("./pop.xml"));
    RandomClass randomClass = new RandomClass();
    randomClass.DisplayRandom();
    Student student1 = new Student();
    student.setId(1323);
    System.out.println(student.getId());
  }
}