package br.com.alura.screenmatchsemweb.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // vai ignorar oq eu nao pedi
public record DadosSerie(@JsonAlias("Title") String titulo, //le o nome e escreve o apelido, property le nome e fala nome
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
