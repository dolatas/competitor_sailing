package com.dododev.sailingcompetition.ws.proxy;

import java.io.IOException;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dododev.sailingcompetition.dict.BackendResponseStatus;
import com.dododev.sailingcompetition.dict.ErrorDescriptions;
import com.dododev.sailingcompetition.json.BackendResponse;
import com.dododev.sailingcompetition.ws.CompetitorWS;


@Path("/competitorWS")
public class CompetitorWSProxy {

    private static final Logger LOG = LoggerFactory.getLogger(CompetitorWSProxy.class);
    private final ObjectMapper mapper = new ObjectMapper();
    
    @Autowired
    private CompetitorWS competitorWS;
    
	@POST
    @Path("/getCompetitors")
    @Produces("application/json")
    public String getCompetitors(@FormParam("competitionId") Long competitionId) throws IOException {
        LOG.info("Invoking getCompetitors WS, competitionId: {}...", competitionId);

        BackendResponse backendResponse = new BackendResponse();
        backendResponse.setStatus(BackendResponseStatus.OK);

        try {
            backendResponse.setResult(competitorWS.getCompetitors(competitionId));
        } catch (Throwable ex) {
            backendResponse.setStatus(BackendResponseStatus.ERROR);
            backendResponse.setErrorDescription(ErrorDescriptions.GET_COMPETITORS_ERROR);
            LOG.error("Exception in getCompetitors: {}", ex);
        }

        return mapper.writeValueAsString(backendResponse);
    }
}