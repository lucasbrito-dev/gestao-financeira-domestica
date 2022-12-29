package br.com.lucasbritodev.gestaofinanceiradomestica.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Balanco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalEntradas;
    private int totalSaidas;
    private int saldoPosterior;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    @ManyToOne
    private Usuario lancador;

    public Balanco() {
    }

    public Balanco(int totalEntradas, int totalSaidas, int saldoPosterior) {
        this.totalEntradas = totalEntradas;
        this.totalSaidas = totalSaidas;
        this.saldoPosterior = saldoPosterior;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Balanco other = (Balanco) obj;
        if (id == null) {
            return other.id == null;
        } else return id.equals(other.id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalEntradas() {
        return totalEntradas;
    }

    public void setTotalEntradas(int titulo) {
        this.totalEntradas = titulo;
    }

    public int getTotalSaidas() {
        return totalSaidas;
    }

    public void setTotalSaidas(int mensagem) {
        this.totalSaidas = mensagem;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getLancador() {
        return lancador;
    }

    public void setLancador(Usuario lancador) {
        this.lancador = lancador;
    }

    public int getSaldoPosterior() {
        return saldoPosterior;
    }

    public void setSaldoPosterior(int saldoPosterior) {
        this.saldoPosterior = saldoPosterior;
    }
}
