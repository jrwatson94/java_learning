package polymorphism;

// Java program for Method overriding
  
class Parent {
  void Print(){
        System.out.println("parent class");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args){
        Parent a;
  
        a = new subclass1();
        a.Print();
  
        a = new subclass2();
        a.Print();
    }
}

