package com.grazielleanaia.usuario2.business;


import com.grazielleanaia.usuario2.infrastructure.clients.ViaCepClient;
import com.grazielleanaia.usuario2.infrastructure.clients.ViaCepDTO;
import com.grazielleanaia.usuario2.infrastructure.exception.IllegalArgumentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor

public class ViaCepService {

    private final ViaCepClient viaCepClient;

    public ViaCepDTO buscaDadosEndereco(String cep) {
        try {
            return viaCepClient.buscaDadosEndereco(processarCep(cep));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro: ", e);
        }
    }


    //Validar dados do cep caso haja espaco ou alfanumericos

    private String processarCep(String cep) {
        String cepFormatado = cep.replace(" ", "").replace("-",
                "");
        if (!cepFormatado.matches("\\d+") || !Objects.equals(cepFormatado.length(), 8)) {
            throw new IllegalArgumentException("O cep contem caracteres invalidos");
        }

        return cepFormatado;
    }
}
