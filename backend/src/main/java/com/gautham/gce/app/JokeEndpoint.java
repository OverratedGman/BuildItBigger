

package com.gautham.gce.app;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import com.gautham.java.library.JokeTeller;

@Api(
    name = "jokeApi",
    version = "v1",
    namespace = @ApiNamespace(
        ownerDomain = "app.gce.gautham.com",
        ownerName = "app.gce.gautham.com",
        packagePath = ""
    )
)
public class JokeEndpoint {

    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        Joke response = new Joke();
        response.setData(new JokeTeller().getJoke());
        return response;
    }

}
