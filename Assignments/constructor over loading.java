public class Language{
    String company;
    String language;  
    int age;  
     
    Language(String n){  
    language = n;  
    }  
     
    Language(String n,int a,String co){  
    language = n;  
    age=a; 
    company=co;
    }  
    void display(){System.out.println(language+" "+age+" "+company);}  
   
    public static void main(String args[]){  
    Language l1 = new Language("C");  
    Language l2 = new Language("JAVA",25,"Oracle");  
    l1.display();  
    l2.display();  
   }  
}