/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probl1;

/**
 *
 * @author alexandru
 */



public class Probl1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student Borcan = new Student("Andreea Borcan", "andreea@yahoo.com");
        Project ip1 = new Project("Proiect 1 IP", 4);
        Project ip2 = new Project("Proiect 2 IP", 3);
        Project pa = new Project("Proiect 1 PA", 4);
        Borcan.setPreferences(ip1, ip2);
        System.out.println(Borcan.toString());
        
        Problem problem = new Problem(2, 3); //4 students, 3 projects
        Student s1 = problem.createStudent("S1", "s1@info.uaic.ro");        
        problem.addStudent(Borcan);
        Student s2 = problem.createStudent("Student bun", "email@info.uaic.ro");
        Project p1 = problem.createProject("P1", 2); //capacity is 2
        Project p2 = problem.createProject("P2", 2); //capacity is 2
        Project p3 = problem.createProject("P3", 2); //capacity is 2
       
        s1.setPreferences(p1, p2, p3);
    }
        
        
        //p1.setPreferences(s3, s1, s2, s4);                
        //        System.out.println(problem);
    
   
}
