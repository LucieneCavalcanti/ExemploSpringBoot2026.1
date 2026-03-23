package br.pro.luciene.exemplo.entities;

import org.hibernate.boot.jaxb.mapping.GenerationTiming;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbusuarios")
public class UsuarioEntity {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nome",nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 20)
    private String senha;
}
