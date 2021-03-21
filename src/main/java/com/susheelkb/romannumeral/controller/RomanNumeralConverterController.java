/**
 * 
 */
package com.susheelkb.romannumeral.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.susheelkb.romannumeral.domain.RomanNumber;
import com.susheelkb.romannumeral.service.RomanNumeralConverterService;

import java.util.List;

import org.slf4j.Logger;

/**
 * 
 * @author susheel.kaparaboyna
 *
 */
@RestController
@Validated
public class RomanNumeralConverterController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RomanNumeralConverterService romanNumeralConverterService;

	@GetMapping(value = "/romannumeral", params = { "query" })
	public ResponseEntity<RomanNumber> toRomanNum(@RequestParam("query") int number) {
		RomanNumber romanNumber = romanNumeralConverterService.toRomanNumber(number);
		logger.info("API-CALLED " + number);
		return ResponseEntity.ok(romanNumber);
	}

	@GetMapping(value = "/romannumeral", params = { "min", "max" })
	public ResponseEntity<List<RomanNumber>> convertRangeToRomanNumeral(@RequestParam("min") int minNumber,
			@RequestParam("max") int maxNumber) {
		List<RomanNumber> romanNumberList = romanNumeralConverterService.convertRangeToRoman(minNumber, maxNumber);
		logger.info("API-CALLED with range");
		return ResponseEntity.ok(romanNumberList);
	}
}
