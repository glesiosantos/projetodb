package br.com.glesioss.projetodb.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produtos")
public class Produto extends EntidadeAbstrata {

    @Column(name = "nome", unique = true, length = 150)
    private String nomeProduto;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(columnDefinition = "DECIMAL(10,2) default '0.0'", precision = 2)
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;
}
