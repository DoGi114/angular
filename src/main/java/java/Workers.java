package java;

import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/worker")
public class Workers {
	  @Inject
	    private WorkerManager manager;
	    
	    @POST
	    public Response add(Worker worker) {
	        manager.add(worker);
	        return Response.ok().build();
	    }
	    
	    @GET
	    @Path("/{id}")
	    public Worker get(@PathParam("id") String id){
	        return manager.get(UUID.fromString(id));
	    }
	    
	    @DELETE
	    @Path("/{id}")
	    public Response delete(@PathParam("id") String id) {
	        manager.delete(UUID.fromString(id));
	        return Response.ok().build();
	    }
	    
	    @PUT
	    @Path("/{id}")
	    public Response update(@PathParam("id") String id, Worker worker) {
	        worker.setId(UUID.fromString(id));
	        manager.update(worker);
	        return Response.ok().build();
	    }
	    
	    @GET
	    public List<Worker> getAll(){
	        return manager.getAll();
	    }
}
