package com.grazielleanaia.usuario2.business;


import com.grazielleanaia.usuario2.infrastructure.client.ViaCepClient;
import com.grazielleanaia.usuario2.infrastructure.client.ViaCepDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor

public class ViaCepService {

    private final ViaCepClient viaCepClient;

    public ViaCepDTO buscarDadosEndereco(String cep) {
        return viaCepClient.buscarDadosEndereco(cep);

    }

    private String processarCep(String cep) {
        String cepFormatado = cep.replace(" ", "").replace("-", "");

        if(!cepFormatado.matches("\\d+") || !Objects.equals(cepFormatado.length(), 8)) {

            throw new IllegalArgumentException("O cep contem caracteres invalidos");
        }
        return cepFormatado;
    }
}
