import javax.swing.JOptionPane; 

public class Fatorial { 

public static void main(String[] args) { 

int fator = obterFator(); 
  long acumulador = 1; 

for (int i = 1; i <= fator; i++) { 
  acumulador *= i; 
} 
mostrarResultado(fator,acumulador); 
} 

public static Integer obterFator(){ 
return Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número natural maior que 0 para obter o fatorial: ")); 
} 

public static void mostrarResultado(int fator, long acumulador){ 
JOptionPane.showMessageDialog(null, new StringBuilder("Fatorial de ").append(fator).append(" é ").append(acumulador)); 
} 
}

 
        

    
    

