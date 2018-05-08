
package ultraemojicombat;
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade,vitorias, derrotas, empates;
    private float altura, peso;
    
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Chegou a hora!!!");
        System.out.println("Apresentando o Lutador!");
        System.out.println("\nNacionalidade: " + this.getNacionalidade());
        System.out.println("\nNome: " + this.getNome() + "\nIdade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + " metros\nPeso: " + this.getPeso() + " Kg");
        System.out.println("Vitorias: " + this.getVitorias() + "\nDerrotas: " + this.getDerrotas() + "\nEmpates: " + this.getEmpates());
        System.out.println("----------------------------------");

        
    }
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){
        if(this.peso<52.2){
            this.categoria = "Inválido";
        }
            else if (this.peso <= 70.3){
                this.categoria = "Leve";
        }
            else if (this.peso <= 83.9){
                this.categoria = "Médio";
        }
            else if (this.peso <= 120.2){
                this.categoria = "Pesado";
        }
            else{
                this.categoria = "Inválido, muito pesado!";
        }
    }
}
