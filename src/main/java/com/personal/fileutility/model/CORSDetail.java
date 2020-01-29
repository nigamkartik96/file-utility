package com.personal.fileutility.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CORSDetail {
	String pathName;
	String[] allowedOrigins;
	String[] corsHeaders;
}
