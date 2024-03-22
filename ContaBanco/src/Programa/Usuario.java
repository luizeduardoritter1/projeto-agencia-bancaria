// Aqui vamos puxar package Programa e criar uma classe de usuário

package Programa;

public class Usuario {
// static COUNTER para contar o número de usuários

    private static int counter = 0;

    private String nome;
    private String cpf;
    private String email;

    // Aqui geramos o método construtor
    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public static Usuario criarNovoUsuario(String nome, String cpf, String email) {
counter++;
return new Usuario(nome, cpf, email);
    }

    public static int getTotalUsuarios() {
        return counter;
    }
    // Aqui geramos o método Getter & Setter(set= atribuir / get= pegar)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return "\nNome: " + this.getNome() +
               "\nCPF: " + this.getCpf() + 
               "\nEmail: " + this.getEmail();
    }
    
}
