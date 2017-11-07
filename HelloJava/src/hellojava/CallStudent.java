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
public class CallStudent {
    public static void main(String args[])  
    {
        int a = 0 ;
    Student s1 = new Student();
    s1.id = 1;
    s1.name = "payal";
  
    s1.total = 90;
    s1.marks = new int[]{10,20,30};
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.total);
      for (int i = 0; i < s1.marks.length; i++)
              {
                     System.out.println(s1.marks[i]);
                 a = s1.marks[i];
                         s1.total = a + s1.marks[i];
                      
                  //   total = a             
              }
      System.out.println("total :" + s1.total) ;
      
      
      Student s2 = new Student();
              s2.setData(2, "Preet",  new int[]{10,10}, 0);
      s2.getData(s2);
    }
    
}
