package com.shane.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vote")
@Produces(MediaType.APPLICATION_JSON)
public class VotingResource {

    @POST
    public Response castVote() {
        // Logic to cast a vote
        return Response.ok("Vote cast successfully").build();
    }

    @GET
    public Response getVotes() {
        // Logic to retrieve and return vote counts
        return Response.ok("Votes retrieved successfully").build();
    }
}
