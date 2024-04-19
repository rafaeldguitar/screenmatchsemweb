package br.com.alura.screenmatchsemweb;

import br.com.alura.screenmatchsemweb.model.DadosSerie;
import br.com.alura.screenmatchsemweb.service.ConsumoApi;
import br.com.alura.screenmatchsemweb.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchsemwebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchsemwebApplication.class, args);
	}

	@Override //vira o metodo main
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=breaking+bad&-API_KEY");
		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
