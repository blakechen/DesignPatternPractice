package idv.blake;

import java.util.List;

public interface AgentModelContext {
    void setAgent(Agent agent);

    Agent getAgent();

    void addAcceport(Acceptor acceptor);

    Acceptor getAcceptor(String key);

    List<Acceptor> getAcceptors();
}
