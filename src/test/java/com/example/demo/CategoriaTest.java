package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.CategoriaRepository;
import com.example.demo.Model.Categoria;

@SpringBootTest
@AutoConfigureMockMvc
public class CategoriaTest {

    @Autowired
    private CategoriaRepository cr;

    private final String[] categoriasEsperadas ={
        "Fisicas",
        "Intelectuais",
        "Sensoriais",
        "Psicossociais ou Mentais",
        "Neurológicas",
        "Múltiplas",
        "Aprendizagem"
    };

    @Test
    @DisplayName("Verificar se todas as categorias foram inseridas corretamente.")
    void index(){
        List<Categoria> categorias = cr.findAll();
        Set<String> nomesNoBanco = categorias.stream()
        .map(Categoria::getTipo)
        .collect(Collectors.toSet());
        
        for(String nomeEsperado : categoriasEsperadas){
            assertTrue(nomesNoBanco.contains(nomeEsperado),
            "Categoria não encontrada:" + nomeEsperado);
        }
        assertEquals(categorias.size(), categoriasEsperadas.length);
    }
    

}
