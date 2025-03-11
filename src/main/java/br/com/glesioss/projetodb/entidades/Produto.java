package br.com.glesioss.projetodb.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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

    private String nomeProduto;
    private String descricao;
    private Double preco;

    @ManyToOne
    private Categoria categoria;
}
