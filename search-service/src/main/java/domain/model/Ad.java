package domain.model;

import java.util.Date;

import com.google.gson.Gson;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Ad extends Searchable{
	
	private Long id;
	
	private String title;
	
	private String description;
	
	private Date date;
	
	private String index = "ads";
	
	private String type = "ad";
	
	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
}
