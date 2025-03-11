package br.com.glesioss.projetodb.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente extends EntidadeAbstrata{

    @Column(length = 150, nullable = true)
    private String nome;

    @Column(unique = true, nullable = true)
    private String email;

    @Column(length = 15, nullable = true)
    private String telefone;

    @Column(nullable = true, columnDefinition = "DATE")
    private Instant dataNascimento;

    @CreatedDate
    @Column(nullable = true, columnDefinition = "DATE default 'now()'", updatable = false)
    private Instant dataCadastro;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
}
