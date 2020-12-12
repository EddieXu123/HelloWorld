import java.util.Arrays;

public class HelloWorld {
  public static void main(String[] args) {
    char H = 'H';
    char E = 'e';
    char L = 'l';
    char L2 = 'l';
    char O = 'o';
    
    char Space = ' ';
    
    char W = 'W';
    char O2 = 'o';
    char R = 'r';
    char L3 = 'l';
    char D = 'd';
    
    StringBuilder HelloWorld = new StringBuilder();
    
    int I = 0;
    while (I <= "HELLOWORLD".length()) {
      if (I == 0) {
        HelloWorld.append(H);
      }
      
      else if (I == 1) {
        HelloWorld.append(E);
      }
      
      else if (I == 2) {
        HelloWorld.append(L);
      }
      
      else if (I == 3) {
        HelloWorld.append(L2);
      }
      
      else if (I == 4) {
        HelloWorld.append(O);
      }
      
      else if (I == 5) {
        HelloWorld.append(Space);
      }
      
      else if (I == 6) {
        HelloWorld.append(W);
      }
      
      else if (I == 7) {
        HelloWorld.append(O2);
      }
      
      else if (I == 8) {
        HelloWorld.append(R);
      }
      
      else if (I == 9) {
        HelloWorld.append(L3);
      }
      
      else if (I == 10) {
        HelloWorld.append(D);
      }
      
      I++;
    }
    
    System.out.println(HelloWorld.toString());
  }
}
