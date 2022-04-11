//regular

	interface Drawable{  
		public void draw();  
	}  
	public class regular {  
		public static void main(String[] args) {  
			int height=10;  
	  
			//without lambda, Drawable implementation using anonymous class  
			Drawable d=new Drawable(){  
				public void draw(){System.out.println("Drawing "+height);  
			}  
			d.draw();  
		}  
	} 