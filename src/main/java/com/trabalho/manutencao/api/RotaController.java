package com.trabalho.manutencao.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.manutencao.api.entity.Rota;
import com.trabalho.manutencao.api.entity.Visita;
import com.trabalho.manutencao.api.repository.RotaRepository;

@RestController
@RequestMapping("api/rota")
public class RotaController {
	
	@Autowired
	private Optional<Rota> rota;
	
	@Autowired
	private RotaRepository rotaRepository;
	
	@GetMapping
	@ResponseBody
	public void getRota() {
		
		rota = rotaRepository.findById("1");
		
		Visita visita = rota.get().getVisitas().get(0);
		Long aux = rota.get().getCapacidadeDaRota();
	}
}
