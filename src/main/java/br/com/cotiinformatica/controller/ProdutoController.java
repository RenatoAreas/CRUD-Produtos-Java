package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProdutoController {

	@Controller
	public class FuncionarioController {

		@RequestMapping("/produto-cadastro")
		public String cadastro() {
			return "produto-cadastro";
		}

		@RequestMapping("/produto-consulta")
		public String consulta() {
			return "produto-consulta";
		}

		@RequestMapping("/produto-relatorio")
		public String relatorio() {
			return "produto-relatorio";
		}
	}

}
