
package com.visualitech.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
THis is Checkout BUG FIX
*/

/** Example resource class hosted at the URI path "/myresource"
 */
 
 /**
 This Is Srini
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi thereajfjsalfjasasdfsasadf";
}
