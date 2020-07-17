package idv.blake;

import java.util.LinkedList;
import java.util.List;

public class AgentModelAdapter implements AgentModelContext {

    private ConfigContext context = null;

    public AgentModelAdapter(ConfigContext context) {
        this.context = context;
    }

    @Override
    public void setAgent(Agent agent) {
        if (null == agent) {
            throw new IllegalArgumentException("Agent cannot be null.");
        }
        if(hasAgent()){
            context.remove(agent);
        }
        context.add(agent);
    }

    private boolean hasAgent() {
        for (ConfigObject obj : context.getAllObjects()){
            if (obj instanceof Agent) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Agent getAgent() {
        for (ConfigObject obj : context.getAllObjects()){
            if (obj instanceof Agent) {
                return (Agent) obj;
            }
        }
        throw new RuntimeException("No Agent found.");
    }

    @Override
    public void addAcceport(Acceptor acceptor) {
        context.add(acceptor);
    }

    @Override
    public Acceptor getAcceptor(String key) {
        return (Acceptor) context.get(key);
    }

    @Override
    public List<Acceptor> getAcceptors() {
        List<Acceptor> result = new LinkedList<>();
        for (ConfigObject obj : context.getAllObjects()){
            if (obj instanceof Acceptor) {
                result.add((Acceptor)obj);
            }
        }
        return result;
    }
}
