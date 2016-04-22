



package org.openhmis.webservice;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.openhmis.dto.SiteDTO;
import org.openhmis.manager.SiteManager;
import org.openhmis.util.Authentication;
import org.openhmis.util.DateParser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Path("/sites")
public class SiteService {
	private static final Logger log = Logger.getLogger(SiteService.class);
	public SiteService() {}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<SiteDTO> getSites(@HeaderParam("Authorization") String authorization, @QueryParam("updatedSince") String updatedSince) throws JsonProcessingException {
		if(!Authentication.googleAuthenticate(authorization))
			throw new Error("You are not authorized to access this content");
		
		// If the user specified no updatedSince parameter, return everything
		if(updatedSince == null) {
			List<SiteDTO> siteDTOs = SiteManager.getSites();
			return siteDTOs;
		} else {
			List<SiteDTO> siteDTOs = SiteManager.getSites(DateParser.parseDate(updatedSince));
			return siteDTOs;			
		}
		
	}
	
	@POST
	@Path("/")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SiteDTO createSite(@HeaderParam("Authorization") String authorization, SiteDTO inputDTO) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization))
			throw new Error("You are not authorized to access this content");
		SiteDTO outputDTO = SiteManager.addSite(inputDTO);
		return outputDTO;
	}
	
	@GET
	@Path("/{siteId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SiteDTO getSite(@HeaderParam("Authorization") String authorization, @PathParam("siteId") String siteId) throws JsonProcessingException {
		if(!Authentication.googleAuthenticate(authorization))
			throw new Error("You are not authorized to access this content");
		SiteDTO outputDTO = SiteManager.getSiteById(siteId);
		return outputDTO;
	}
	
	@PUT
	@Path("/{siteId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SiteDTO updateSite(@HeaderParam("Authorization") String authorization, @PathParam("siteId") String siteId, SiteDTO inputDTO) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization))
			throw new Error("You are not authorized to access this content");
		inputDTO.setSiteId(siteId);
		
		SiteDTO outputDTO = SiteManager.updateSite(inputDTO);
		return outputDTO;
	}
	
	@DELETE
	@Path("/{siteId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String deleteSite(@HeaderParam("Authorization") String authorization, @PathParam("siteId") String siteId) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization))
			throw new Error("You are not authorized to access this content");
		SiteManager.deleteSite(siteId);
		return "true";
	}
}