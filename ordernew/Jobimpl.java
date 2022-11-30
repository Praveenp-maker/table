import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
public class Jobimpl implements JobDao{
    
  public List<Job> person=new ArrayList<Job>();
  public Jobimpl()
  {
      
      Job j1=new Job("venkat",8);
      Job j2=new Job("arun",5);
      Job j3=new Job("vijay",2);
      Job j4=new Job("karthi",1);
      Job j5=new Job("vicky",4);
      
      person.add(j1);
      person.add(j2);
      person.add(j3);
      person.add(j4);
      person.add(j5);
  }
  
  
  public List<Job> getdetails()
  {
      return person;
  }
  
  public Job getJob(String name)
  {
      for (int i=0;i<person.size();i++){
          if((person.get(i)).name==name)
          {
             return person.get(i);
          }
      }
      return null;
  }
  
    public void updatedetails(int id,Job job){
        person.get(job.getId()).setName(job.getName());
      System.out.println(job.getId() + ", updated in the database");
  
    }
    public void deleteJob(String name){
       // person.remove(person.getName());
        System.out.println(name+" deleted");
    }
    public void geteven(){
        // for(int i=0;i<person.size();i++){
        // int d=person.get(i);
        // if(d%2==0){
        //     System.out.println(person.get(i));
        // }
        
        // for(Job t:person){
        //     for(Job u:person){
        //         if(t.id%2==0){
        //             System.out.print(id+" "+t.name);
        //         }
        //     }
        // }
        Iterator itr=person.iterator();
        
        while(itr.hasNext()){
         //   if(person.id%2==0){
              //  System.out.println(person.id+" "+person.name);
              //if(itr.id%2==0){
              //    System.out.println(id);
             // }
              
               // System.out.println(itr.next());
            }
        
      //  public void ascending(){
        //     Collections.sort(person, new Comparator<Job>() {
        //     public int compare(Job p1, Job p2) {
        //      return Long.valueOf(p1.getid()).compareTo(p2.getid());
        //     }
        // });   

        // System.out.println("After Assending sort");
        // for(Job kt: person){
        //     System.out.println(kt.getName() + " " + kt.getid());
        // }
    }
public void noofJob(){
    System.out.println(person.size());
}
public void idwisecount(){
    int a=Collections.frequency(person,1);
    System.out.println("collections");
    int count=0;
    for(int i=0;i<person.size();i++){
        for(int j=i+1;j<person.size();j++){
            if (person.get(i).id.equals(person.get(j).id)){
             //   if (orders.get(i).Date.equals(orders.get(j).Date))
                count++;
               System.out.println(person.get(j).id);
            }
            break;
        }
    }
}
        
        }
    
