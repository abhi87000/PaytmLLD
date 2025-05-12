package Repository;

import Model.agent;

import java.util.HashMap;
import java.util.Map;

public class AgentRepositoryImpl implements AgentRepository {
    public static Map<String,agent> agentMap;

    public AgentRepositoryImpl() {
        agentMap=new HashMap<>();
    }

    @Override
    public void add(agent agent) {
        agentMap.put(agent.getId(),agent);
        System.out.println(agent.getId());
    }

    @Override
    public agent getAgent(String reporteeId) {
        return agentMap.get(reporteeId);
    }
}
