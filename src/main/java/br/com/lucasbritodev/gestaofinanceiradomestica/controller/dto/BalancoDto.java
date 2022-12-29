package br.com.lucasbritodev.gestaofinanceiradomestica.controller.dto;

import br.com.lucasbritodev.gestaofinanceiradomestica.modelo.Balanco;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

public class BalancoDto {

    private Long id;
    private int totalEntradas;
    private int totalSaidas;
    private int saldoPosterior;
    private LocalDateTime dataCriacao;

    public BalancoDto(Balanco balanco) {
        this.id = balanco.getId();
        this.totalEntradas = balanco.getTotalEntradas();
        this.totalSaidas = balanco.getTotalSaidas();
        this.saldoPosterior = balanco.getSaldoPosterior();
        this.dataCriacao = balanco.getDataCriacao();
    }

    public Long getId() {
        return id;
    }

    public int getTotalEntradas() {
        return totalEntradas;
    }

    public int getTotalSaidas() {
        return totalSaidas;
    }

    public int getSaldoPosterior() {
        return saldoPosterior;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public static Page<BalancoDto> converter(Page<Balanco> balancos) {
        return balancos.map(BalancoDto::new);
    }

}
