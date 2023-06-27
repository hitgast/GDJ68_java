package test;

//class Calculator2{
//    int left, right;
//    int third = 0;
//      
//    public void setOprands(int left, int right){
//        System.out.println("setOprands(int left, int right)");
//        this.left = left;
//        this.right = right;
//    }
//     
//    public void setOprands(int left, int right, int third){
//        System.out.println("setOprands(int left, int right, int third)");
//        this.left = left;
//        this.right = right;
//        this.third = third;
//    }
//     
//    public void sum(){
//        System.out.println(this.left+this.right+this.third);
//    }
//      
//    public void avg(){
//        System.out.println((this.left+this.right+this.third)/3);
//    }
//}
//  
//public class Overroding {
//      
//    public static void main(String[] args) {
//          
//        Calculator2 c1 = new Calculator2();
//        c1.setOprands(10, 20);
//        c1.sum();       
//        c1.avg();
//        c1.setOprands(10, 20, 30);
//        c1.sum();       
//        c1.avg();
//    }
//}


class Calculator2{
    int[] array;
      
    public void setOprands(int[] array){
        this.array = array;
    }
     
    public void sum(){
    	
    }
      
    public void avg(){
        
    }
}
  
public class Overroding {
      
    public static void main(String[] args) {
          
        Calculator2 c1 = new Calculator2();
        c1.setOprands(new int[] {10, 20});
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[] {10, 20, 30});
        c1.sum();       
        c1.avg();
    }
}
