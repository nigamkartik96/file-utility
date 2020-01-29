package com.personal.fileutility.constants;

import com.personal.fileutility.model.CORSDetail;

import java.util.ArrayList;
import java.util.List;

public interface CORSConfig {
	List<CORSDetail> corsList = new ArrayList<>(){{
//		add(new CORSDetail("/test", new String[]{}, new String[]{}));
	}};
}
