/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getAverage(int a, int b) {
      int sum = 0;
      double kei = 0;
      for(int i = a; i<=b; i++){
        sum = sum + i;
      }
      if(b-a == 1){
        kei = a+b;
        return "Sum of "+a+" and "+b+" is "+kei+". Average is"+kei/2+".";
      }
      else{
        kei = sum;
        return "Sum of "+a+" to "+b+" is "+kei+". Average is"+kei/b+".";
      }
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println(new App().getAverage(2,3));
        System.out.println(new App().getAverage(1,10));
      }
}
