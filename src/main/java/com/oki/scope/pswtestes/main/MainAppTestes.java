package com.oki.scope.pswtestes.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oki.scope.pswtestes.conf.Configuracao;

public class MainAppTestes {
	
	private static final Logger logger = LoggerFactory.getLogger(MainAppTestes.class);
	
	public static void main(String [] args) {
		Configuracao configuracao = new Configuracao();
		logger.info("Inicializando drivers: {}", configuracao);
		configuracao.inicializaIE();
		configuracao.inicializaChrome();
		configuracao.inicializaFirefox();
	}
	
}
