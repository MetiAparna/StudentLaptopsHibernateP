package com.ass.StudentLaptops;

import java.util.ArrayList;

import com.ass.StudentLaptops.entity.Laptops;
import com.ass.StudentLaptops.entity.Student;
import com.ass.StudentLaptops.repository.StudentRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Laptops l = new Laptops();
        l.setId(101);
        l.setLpname("hp");
        
        Laptops l2 = new Laptops();
        l2.setId(102);
        l2.setLpname("Dell");
        
        ArrayList<Laptops> arrayList = new ArrayList<Laptops>();
        arrayList.add(l);
        arrayList.add(l2);
       
        
        Student s = new Student();
        s.setId(1);
        s.setName("rana");
        s.setEmail("rana@gmail.com");
        s.setLaptop(arrayList);
        
        StudentRepository repository = new StudentRepository();
        repository.saveLaptopsData(l);
        repository.saveStudentData(s);
    }
}
