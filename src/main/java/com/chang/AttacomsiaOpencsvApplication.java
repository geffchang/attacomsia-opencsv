package com.chang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Reference: https://attacomsian.com/blog/export-download-data-csv-file-spring-boot
 * 
 * <p>Download CSV file via: http://localhost:8080/export-users
 * 
 * <p>NOTE: OpenCSV has no built-in functionality for custom column names and ordering.
 * CsvBindByPosition can be used for custom column order, but it removes the header.
 * </ul>
 */
@SpringBootApplication
public class AttacomsiaOpencsvApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttacomsiaOpencsvApplication.class, args);
	}

}
