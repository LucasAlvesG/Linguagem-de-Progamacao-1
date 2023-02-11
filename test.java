package AULA10DO02;

public class test {
  public static void main(String[] args) {
    aluno a1 = new aluno();
    a1.nome = passarParaMaiuscula("Lucas");
    a1.genero = "Masculino";
    a1.idade = gerarIdade(20, 60);

    aluno a2 = new aluno();
    a2.nome = passarParaMaiuscula("Roberta");
    a2.genero = "Feminino";
    a2.idade = gerarIdade(20, 60);

System.out.println(a1.nome +"\r"+ a1.idade + "\r" + a1.genero );
System.out.println("");
System.out.println(a2.nome +"\r"+ a2.idade + "\r" + a2.genero );

  }

  public static int gerarIdade(int min, int max) {
    int i = (int)(Math.random() * (max - min)) + min;
    return i;
  }

  public static String passarParaMaiuscula(String nome) {
    return nome.toUpperCase();
  }
}
