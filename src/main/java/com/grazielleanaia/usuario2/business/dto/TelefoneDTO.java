package com.grazielleanaia.usuario2.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TelefoneDTO {
    private Long id;
    private String numero;

    private String ddd;


}
