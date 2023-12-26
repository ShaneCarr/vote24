package com.shane;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.shane.resources.VotingResource;

public class VotingApplication extends Application<VotingConfiguration> {

    public static void main(final String[] args) throws Exception {
        new VotingApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<VotingConfiguration> bootstrap) {
        // Initialization code here
    }

    @Override
    public void run(final VotingConfiguration configuration,
                    final Environment environment) {
        final VotingResource resource = new VotingResource();
        environment.jersey().register(resource);
        // Register other resources or components as needed
    }
}
