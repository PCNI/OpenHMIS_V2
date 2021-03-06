

package org.openhmis.dto.search;


import java.util.Date;

import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
public class FunderSearchDTO extends BaseSearchDTO {
        private String projectId;
        
        public FunderSearchDTO() {}

	// Getters / Setters
	@JsonProperty
	public String getProjectId() {
		return this.projectId;
	}
	@QueryParam("projectId")
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}


