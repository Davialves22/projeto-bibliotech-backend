package com.br.libraryapi.modelo.usuario;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;

import com.br.libraryapi.util.entity.EntidadeAuditavel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // transforma numa classe exisitivel no jpa
@Table(name = "Cliente") // especifica que a classe sera convertida em tabela
@SQLRestriction("habilitado = true") // acresenta em todas as consultas uma clausula where: where habilidado = true

@Builder // forma de instanciar objetos da classe
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario extends EntidadeAuditavel {

    @Column
    private String nome;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String cpf;

    @Column
    private String foneCelular;

}
