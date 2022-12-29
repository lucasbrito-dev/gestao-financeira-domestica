package br.com.lucasbritodev.gestaofinanceiradomestica.controller;

import br.com.lucasbritodev.gestaofinanceiradomestica.controller.dto.BalancoDto;
import br.com.lucasbritodev.gestaofinanceiradomestica.modelo.Balanco;
import br.com.lucasbritodev.gestaofinanceiradomestica.repository.BalancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balanco")
public class BalancoController {

    @Autowired
    private BalancoRepository balancoRepository;

    @GetMapping
    @Cacheable(value = "listaDeBalancos")
    public Page<BalancoDto> lista(@RequestParam(required = false) String nomeLancador,
                                 @PageableDefault(sort = "dataCriacao", direction = Sort.Direction.DESC, page = 0, size = 10) Pageable paginacao) {

        Page<Balanco> balancos;
        if (nomeLancador == null) {
            balancos = balancoRepository.findAll(paginacao);
        } else {
            balancos = balancoRepository.findByLancadorNome(nomeLancador, paginacao);
        }
        return BalancoDto.converter(balancos);
    }

}