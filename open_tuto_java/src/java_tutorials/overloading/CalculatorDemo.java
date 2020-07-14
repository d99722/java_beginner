package java_tutorials.overloading;


class Calculator{
    int left, right;
    int third = 0;
    int div;
      
    public void setOprands(int left, int right){
    	div = 2;
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
    	this.setOprands(left,right);
    	div = 3;
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/div);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }
  
}