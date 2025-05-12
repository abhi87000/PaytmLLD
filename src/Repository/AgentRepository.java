package Repository;

import Model.agent;

public interface AgentRepository {
    void add(agent agent);

    agent getAgent(String reporteeId);
}
