
//import java.util.Scanner;
import javax.swing.JOptionPane;

// Exercí

public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno aluno;
        aluno = new Aluno();
        int teclado;
      /*
        aluno.setMatricula(123);
        aluno.setNome("Laura");
        aluno.setNumeroAulas(80);
        aluno.setNumeroFaltas(30);
        aluno.setNotaAv1(9);
        aluno.setNotaAv2(8);
        aluno.setNotaAv3(7);
        
        
        System.out.println(" Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println(" Numero de aulas: " + aluno.getNumeroAulas());      
        System.out.println("Numero de faltas: " + aluno.getNumeroFaltas());
        System.out.println("Primeira nota: " + aluno.getNotaAv1());
        System.out.println("Segunda nota: " + aluno.getNotaAv2());   
        System.out.println("Terceira nota: " + aluno.getNotaAv3());                

        System.out.println("Média" + aluno.calcularMedia());
        
        aluno.verificarStatus();
        */
        //-----------------------------------------------------
        /*
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Informe a matricula: ");
        aluno.setMatricula(sc.nextInt());
        
        sc.nextLine();
        
        System.out.println("Informe um nome: ");
        aluno.setNome(sc.nextLine());
        
        System.out.println("Disciplina: ");
        aluno.setDisciplina(sc.nextLine());
        
        System.out.println("Informe o Numero de Aula: ");
        aluno.setNumeroAulas(sc.nextInt());
        
        System.out.println("Numero de faltas: ");
        aluno.setNumeroFaltas(sc.nextInt());
        
        System.out.println("Insira a primeira nota: ");
       aluno.setNotaAv1(sc.nextDouble());
       
        System.out.println("Insira a segunda nota: ");
        aluno.setNotaAv2(sc.nextDouble());
        
        System.out.println("Insira a terceira nota: ");
        aluno.setNotaAv3(sc.nextDouble());
        
        System.out.println(" Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println(" Numero de aulas: " + aluno.getNumeroAulas());      
        System.out.println("Numero de faltas: " + aluno.getNumeroFaltas());
        System.out.println("Primeira nota: " + aluno.getNotaAv1());
        System.out.println("Segunda nota: " + aluno.getNotaAv2());   
        System.out.println("Terceira nota: " + aluno.getNotaAv3());
        
        System.out.println("Média" + aluno.calcularMedia());
        
        aluno.verificarStatus();
        */
        //________________________________________________________

        
        aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula: ")));
        aluno.setNome(JOptionPane.showInputDialog("Digite um nome: "));
        aluno.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina "));
        aluno.setNumeroAulas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de aulas ")));
        aluno.setNumeroFaltas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faltas ")));
        aluno.setNotaAv1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota ")));
        aluno.setNotaAv2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota ")));
        aluno.setNotaAv3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota ")));
        
        
        JOptionPane.showMessageDialog(null,
                "Matricula: " + aluno.getMatricula() + "\n"
                + "Nome: " + aluno.getNome() + "\n" 
                + "Disciplina: " + aluno.getDisciplina() + "\n"
                + " Número de Aulas: " + aluno.getNumeroAulas()+ "\n"
                + " Número de faltas:  " + aluno.getNumeroFaltas() + "\n"
                + "Primeira nota: " + aluno.getNotaAv1() + "\n"
                + "Segunda nota " + aluno.getNotaAv2() + "\n"
                + "Terceira nota " + aluno.getNotaAv3()
        );
        
        JOptionPane.showMessageDialog(null,
               " Média: " + aluno.calcularMedia() + "\n");
        
        JOptionPane.showMessageDialog(null,
          "Status" + aluno.verificarStatus());
              

        }
    }
    

