/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probl1;

import java.util.ArrayList;

/**
 *
 * @author alexandru
 */
 public class Problem
    {
        private int nrStudenti;
        private int nrProiecte;
        ArrayList<Student> studentList;
        ArrayList<Project> projectList;
        
        public Problem() {
        }
        public Problem(int studenti,int proiecte)
        {
            this.nrStudenti=studenti;
            this.nrProiecte=proiecte;
            studentList = new ArrayList<>();
            projectList = new ArrayList<>();
        }
        public void setNrStudenti( int studenti)
        {
            this.nrStudenti= studenti;
        }
         public void setNrProiecte(int proiecte)
        {
            this.nrStudenti= proiecte;
        }
         public int getNrStudenti( )
        {
            return this.nrStudenti;
        }
         public int getNrProiecte( )
        {
            return this.nrProiecte;
        }
         
        public Student createStudent(String numeStud, String emailStud)
        {
            Student student = new Student(numeStud, emailStud);
            if(studentList.size() == nrStudenti)
            {
                System.err.println("Nu se mai pot adauga studenti");
                return null;
            }
            studentList.add(student);
            return student;
        }
        public Project createProject(String numeProj, int capacity)
        {
            Project project = new Project(numeProj, capacity);
            if(projectList.size() == nrProiecte)
            {
                System.err.println("Nu se mai pot adauga proiecte");
                return null;
            }
            projectList.add(project);
            return project;
        }
        public boolean addStudent(Student student)
        {
            if(studentList.size() == nrStudenti)
            {
                System.err.println("Nu se mai pot adauga studenti");
                return false;
            }
            studentList.add(student);
            return true;
        }
        
        public void match()
        {
            
            //aici am schimmbat ceva
            
        }
            
    }
