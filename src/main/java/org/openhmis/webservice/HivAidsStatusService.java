



package org.openhmis.webservice;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.BeanParam;
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
import org.openhmis.dto.HivAidsStatusDTO;
import org.openhmis.dto.search.HivAidsStatusSearchDTO;
import org.openhmis.exception.AccessDeniedException;
import org.openhmis.manager.HivAidsStatusManager;
import org.openhmis.util.Authentication;
import org.openhmis.util.DateParser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Path("/hiv-aids-statuses")
public class HivAidsStatusService {
	private static final Logger log = Logger.getLogger(HivAidsStatusService.class);
	public HivAidsStatusService() {}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<HivAidsStatusDTO> getHivAidsStatuses(@HeaderParam("Authorization") String authorization, @BeanParam HivAidsStatusSearchDTO searchDTO) throws JsonProcessingException {
		if(!Authentication.googleAuthenticate(authorization, Authentication.READ))
                        throw new AccessDeniedException();
                List<HivAidsStatusDTO> hivAidsStatusDTOs = HivAidsStatusManager.getHivAidsStatuses(searchDTO);
                log.info("GET /hiv-aids-statuses (" + hivAidsStatusDTOs.size() + " results)");
                return hivAidsStatusDTOs;
	}
	
	@POST
	@Path("/")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public HivAidsStatusDTO createHivAidsStatus(@HeaderParam("Authorization") String authorization, HivAidsStatusDTO inputDTO) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization, Authentication.WRITE))
                        throw new AccessDeniedException();
		HivAidsStatusDTO outputDTO = HivAidsStatusManager.addHivAidsStatus(inputDTO);
                log.info("POST /hiv-aids-statuses (new id: " + outputDTO.getId() + ")");
		return outputDTO;
	}
	
	@GET
	@Path("/{hivAidsStatusId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public HivAidsStatusDTO getHivAidsStatus(@HeaderParam("Authorization") String authorization, @PathParam("hivAidsStatusId") String hivAidsStatusId) throws JsonProcessingException {
		if(!Authentication.googleAuthenticate(authorization, Authentication.READ))
                        throw new AccessDeniedException();
		HivAidsStatusDTO outputDTO = HivAidsStatusManager.getHivAidsStatusById(hivAidsStatusId);
                log.info("GET /hiv-aids-statuses/" + hivAidsStatusId);
		return outputDTO;
	}
	
	@PUT
	@Path("/{hivAidsStatusId}")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public HivAidsStatusDTO updateHivAidsStatus(@HeaderParam("Authorization") String authorization, @PathParam("hivAidsStatusId") String hivAidsStatusId, HivAidsStatusDTO inputDTO) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization, Authentication.WRITE))
                        throw new AccessDeniedException();
		inputDTO.setHivAidsStatusId(hivAidsStatusId);
		
		HivAidsStatusDTO outputDTO = HivAidsStatusManager.updateHivAidsStatus(inputDTO);
                log.info("PUT /hiv-aids-statuses/" + hivAidsStatusId);
		return outputDTO;
	}
	
	@DELETE
	@Path("/{hivAidsStatusId}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public String deleteHivAidsStatus(@HeaderParam("Authorization") String authorization, @PathParam("hivAidsStatusId") String hivAidsStatusId) throws JsonParseException, JsonMappingException, IOException {
		if(!Authentication.googleAuthenticate(authorization, Authentication.WRITE))
                        throw new AccessDeniedException();
		HivAidsStatusManager.deleteHivAidsStatus(hivAidsStatusId);
                log.info("DELETE /hiv-aids-statuses/" + hivAidsStatusId);
		return "true";
	}
}
