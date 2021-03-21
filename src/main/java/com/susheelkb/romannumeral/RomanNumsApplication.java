package com.susheelkb.romannumeral;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author susheel.kaparaboyna
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class RomanNumsApplication {
	public static void main( String[] args ) {
		Metrics.addRegistry(new SimpleMeterRegistry());
		SpringApplication.run( RomanNumsApplication.class, args );
	}	
}