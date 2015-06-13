package java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WorkerManager {
	
	private final Map<UUID,Worker>  workers = new HashMap();
    
    public void add(Worker worker){
        workers.put(worker.getId(),worker);
    }
    
    public Worker get(UUID id){
        return workers.get(id);
    }
    
    public List<Worker> getAll(){
        return new ArrayList(workers.values());
    }
    
    public void delete(UUID id){
        workers.remove(id);
    }
    
    public void update(Worker worker){
        workers.put(worker.getId(), worker);
    }
}
