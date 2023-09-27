package com.projeto.persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.projeto.persistencia.Models.Champion;

public class InserirEntidade {
    private static final String nomeDoArquivo = "entidades.csv";

    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do campeão");
        String name = scanner.nextLine();

        System.out.println("Digite a data de criação do campeão");
        String creationDate = scanner.nextLine();

        System.out.println("Digite a função do campeão");
        String function = scanner.nextLine();

        System.out.println("Digite o range do campeão");
        String range = scanner.nextLine();

        System.out.println("Digite o Q do campeão");
        String q = scanner.nextLine();

        System.out.println("Digite o W do campeão");
        String w = scanner.nextLine();

        System.out.println("Digite o E do campeão");
        String E = scanner.nextLine();

        System.out.println("Digite o ultimate do campeão");
        String ultimate = scanner.nextLine();


        Champion champion = new Champion(name, creationDate, function, range, q, w, E, ultimate);

        try{
            FileWriter arquivo = new FileWriter(nomeDoArquivo, true);
            PrintWriter gravador = new PrintWriter(arquivo);

            String linhaCSV = String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                champion.getName(), champion.getCreationDate(),
                champion.getFunction(), champion.getRange(), champion.getQ(), champion.getW(),
                champion.getE(), champion.getUltimate());

            gravador.println(linhaCSV);

            gravador.close(); // Feche o PrintWriter para salvar as mudanças no arquivo
            arquivo.close();

        }catch(IOException e){
            System.err.println("Erro ao adicionar o campeão no arquivo CSV.");

        }
        scanner.close();

    }
}
