//lambda
 //this is lambda code 
 interface Drawable2{  
    public void draw();  
}  
  
public class lambda{  
    public static void main(String[] args) {  
        int height=10;  
          
        //with lambda  
        Drawable2 d2=()->{  
            System.out.println("Drawing "+height);  
        };  
        d2.draw();  
    }  
} 