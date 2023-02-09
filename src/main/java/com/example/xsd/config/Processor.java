/*
package com.example.xsd.config;

import com.example.xsd.Employee;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class Processor {

  private Marshaller marshaller;
  private Unmarshaller unmarshaller;
  public void setMarshaller(Marshaller marshaller) {
    this.marshaller = marshaller;
  }

  public void setUnmarshaller(Unmarshaller unmarshaller) {
    this.unmarshaller = unmarshaller;
  }

  public void objectToXml(String fileName, Company objectToBeConvertedToXML) throws IOException{
    FileOutputStream fileOutputStream = null;

    try {
      fileOutputStream = new FileOutputStream(fileName);
      marshaller.marshal(objectToBeConvertedToXML, new StreamResult(fileOutputStream));

    }
    finally {
      fileOutputStream.close();
    }
  }

  public void xmlToObject(String fileName) throws IOException {
    FileInputStream fileInputStream = null;

    try {
      fileInputStream = new FileInputStream(fileName);
      unmarshaller.unmarshal(new StreamSource(fileInputStream));
    } finally {
      fileInputStream.close();
    }
  }
}
*/
