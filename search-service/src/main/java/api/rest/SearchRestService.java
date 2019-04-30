package api.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import domain.model.Ad;
import domain.service.SearchService;

@ApplicationScoped
@Path("/search")
public class SearchRestService {
	@Inject
	private SearchService searchService;
	
	@GET
	@Path("ad")
	@Produces("application/json")
	public List<Ad> searchAd(@QueryParam("q") String query) {
		
		List<Ad> hits = searchService.match(query, Ad.class);
		return hits;
	}

}
