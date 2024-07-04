import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    String nome;
    String sexo;

    Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome;
    }
}

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Pessoa> grupoMasculino = new ArrayList<>();
            List<Pessoa> grupoFeminino = new ArrayList<>();

            while (true) {
                System.out.print("Digite o nome (ou 'sair' para terminar): ");
                String nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                System.out.print("Digite o sexo (M/F): ");
                String sexo = scanner.nextLine();

                if (sexo.equalsIgnoreCase("M")) {
                    grupoMasculino.add(new Pessoa(nome, sexo));
                } else if (sexo.equalsIgnoreCase("F")) {
                    grupoFeminino.add(new Pessoa(nome, sexo));
                } else {
                    System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
                }
            }

            System.out.println("\nGrupo Masculino: " + grupoMasculino);
            System.out.println("Grupo Feminino: " + grupoFeminino);
        }
    }
}
