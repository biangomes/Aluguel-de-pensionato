public class Pensionato {
    private String nome;
    private String email;
    private int numeroquarto;

    public Pensionato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getNumeroquarto() {
        return numeroquarto;
    }

    @Override
    public String toString() {
        return this.nome + ", " + this.email;
    }
}
