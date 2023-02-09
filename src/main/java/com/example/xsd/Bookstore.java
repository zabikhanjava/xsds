package com.example.xsd;

import jakarta.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

//This statement means that class "Bookstore.java" is the root-element of our example
@XmlRootElement(namespace = "com.vogella.xml.jaxb.gradle.model")
public class Bookstore {

  // XmLElementWrapper generates a wrapper element around XML representation
  @XmlElementWrapper(name = "bookList")
  // XmlElement sets the name of the entities
  @XmlElement(name = "book")
  private List<Book> bookList;
  private String name;
  private String location;

  public void setBookList(List<Book> bookList) {
    this.bookList = bookList;
  }

  public List<Book> getBooksList() {
    return bookList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}