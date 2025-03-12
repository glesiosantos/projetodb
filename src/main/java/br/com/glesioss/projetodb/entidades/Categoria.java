package br.com.glesioss.projetodb.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categorias")
public class Categoria extends EntidadeAbstrata {

    @Column(name = "nome", unique = true, length = 60)
    private String nomeCategoria;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private List<Produto> produtos;
}
