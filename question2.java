import java.util.*;
class sortBysalarycomparator implements Comparator<Employeee>{
    public int compare(Employeee e1, Employeee e2){
        if(e1.salary<e2.salary)
            return -1;
        else if(e1.salary>e2.salary)
            return 1;
        return 0;
    }
}
class Employeee implements Comparable<Employeee>{
    String first_name,last_name;
    int age,salary;
    public Employeee(String f,String l,int a,int s){
        this.first_name = f;
        this.last_name = l;
        this.age = a;
        this.salary = s;
    }

    @Override
    public int compareTo(Employeee e) {
        if(this.first_name.compareTo(e.first_name)!=0){
            return this.first_name.compareTo(e.first_name);
        }
        else
            return this.last_name.compareTo(e.last_name);
    }
}
public class question2 {
    public static void main(String[] args){
        ArrayList<Employeee> al = new ArrayList<Employeee>();
        Employeee e;
        al.add(new Employeee("Rakesh","Anjani",22,33000));
        al.add(new Employeee("Prashant","Dubey",22,34000));
        al.add(new Employeee("Sonali","Raghuwansi",23,32000));
        al.add(new Employeee("Yogesh","Kumar",21,34000));
        System.out.println("Sorting by name:-");
        Collections.sort(al);
        for(Employeee e1 : al){
            System.out.println(e1.first_name+" "+e1.last_name+" "+e1.age+" "+e1.salary);
        }System.out.println();
        System.out.println("Sorting by salary:-");
        Collections.sort(al,new sortBysalarycomparator());
        for(Employeee e1 : al){
            System.out.println(e1.first_name+" "+e1.last_name+" "+e1.age+" "+e1.salary);
        }


    }

}