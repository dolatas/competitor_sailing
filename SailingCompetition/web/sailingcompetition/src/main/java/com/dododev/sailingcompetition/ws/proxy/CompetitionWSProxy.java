package com.dododev.sailingcompetition.ws.proxy;

import java.io.IOException;

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
import com.dododev.sailingcompetition.ws.CompetitionWS;


@Path("/competitionWS")
public class CompetitionWSProxy {

    private static final Logger LOG = LoggerFactory.getLogger(CompetitionWSProxy.class);
    private final ObjectMapper mapper = new ObjectMapper();
    
    @Autowired
    private CompetitionWS competitionWS;
    
	@POST
    @Path("/getCompetitions")
    @Produces("application/json")
    public String getCompetitions() throws IOException {
        LOG.info("Invoking getCompetitions WS");

        BackendResponse backendResponse = new BackendResponse();
        backendResponse.setStatus(BackendResponseStatus.OK);

        try {
            backendResponse.setResult(competitionWS.getCompetitions());
        } catch (Throwable ex) {
            backendResponse.setStatus(BackendResponseStatus.ERROR);
            backendResponse.setErrorDescription(ErrorDescriptions.GET_COMPETITIONS_ERROR);
            LOG.error("Exception in getCompetitors: {}", ex);
        }

        return mapper.writeValueAsString(backendResponse);
    }
}
