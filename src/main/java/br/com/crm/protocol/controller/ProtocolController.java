package br.com.crm.protocol.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DavidBen
 *
 */
@RestController
@RequestMapping("/protocols")
public class ProtocolController {

	@RequestMapping(value = "/{new}", method = RequestMethod.GET)
	public ResponseEntity<String> newProtocol() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		return ResponseEntity.status(HttpStatus.OK).body(now.format(formatter));
	}
}
