package br.com.alura.screenmatchsemweb.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //vai me devolver algo generico, que eu nao sei ainda
}
