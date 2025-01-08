package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
//import br.com.alura.screenmatch.modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca");
        var busca = leitura.nextLine();
        List<Titulo> titulos = new ArrayList<>();

      //String endereco = "https://www.omdbapi.com/?i" + busca + "8&apikey=3d608cd1";
        String endereco = "https://www.omdbapi.com/?i=tt3896198&apikey=3d608cd1";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());



        String json = response.body();
        System.out.println(json);

        //while para esperar uma palavra "sair"
        while (!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            System.out.printf("Caso queira sair digite 'sair'");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
        }



//        -------------------------------------------
//        so vai funcionar se tiver essa dependencia gson
        //https://mvnrepository.com/artifact/com.google.code.gson/gson
//        Gson gson = new GsonBuilder()
//                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                .create();
//
//
//        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
//        System.out.println("Titulo: "+ meuTituloOmdb);
//        Titulo meuTitulo = new Titulo(meuTituloOmdb);
//        System.out.println("Titulo já convertido");
//        System.out.println(meuTitulo);
        System.out.println(titulos);
        System.out.println("O programa finalizou corretamente!");
    }
}
