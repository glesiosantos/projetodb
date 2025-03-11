package br.com.glesioss.projetodb.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categoria")
public class Pedido extends EntidadeAbstrata {

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @CreatedDate
    @Column(name = "dt_pedido", columnDefinition = "TIMESTAMP default 'now()'")
    private Instant dataPedido;

    @Column(name = "total")
    private Double totalPedido;
}
