/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author macstudent
 */
public class Student 
{

 
        int a;
int id;
String name;
// int[] marks, total;  // both are of type array
  int marks[]={45,55,65};
  int total=0;  // marks array  and total simple int 
  
  
 void setData(int id1, String name1, int marks1[], int total1)
 {
     id = id1;
     name = name1;
     marks = marks1;
      total = total1;
     
 }
        
          
void getData(Student s)
 {
      System.out.println(id);
        System.out.println(name);
        System.out.println(total);
      for (int i = 0; i < marks.length; i++)
              {
               a = marks[i];
               System.out.println("marks: " +  marks[i]);
                         total = a + marks[i];
                  //   total = a             
              }
      System.out.println("total :" + total) ;
     
 }
      
    
            
    





   }




    
