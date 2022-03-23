
package poo;

/**
 *
 * @author DGP
 */
public class POO 
{

    /**
     * Criando classe com dois métodos
     */
    
    //Criação de atributos
    public String nome;
    public int idade;
    
    public void falarNome()
    {
        System.out.print("Nome: "+this.nome+"\n");
    }
    
    public void falarIdade()
    {
        System.out.print("Idade: "+this.idade+"\n");
    }
    public static void main(String[] args) 
    {
        POO dgp = new POO();
        dgp.nome = "Daniel Gusmão Pereira";
        dgp.idade = 31;
        dgp.falarNome();
        dgp.falarIdade();
    }
    
}
