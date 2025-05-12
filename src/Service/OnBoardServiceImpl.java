package Service;

import Model.agent;
import Repository.AgentRepository;
import dto.AgentDto;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class OnBoardServiceImpl implements OnBoardService{
    private final AgentRepository agentRepository;

    public OnBoardServiceImpl(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public void onBoardAgent(AgentDto agentDto) {
        agentRepository.add(createAgent(agentDto));
    }

    @Override
    public void assignManager(String managerId, String reporteeId) throws IllegalAccessException {
        agent reportee=agentRepository.getAgent(reporteeId);
        agent manager=agentRepository.getAgent(managerId);
        if(reportee==null)  throw new IllegalAccessException();
        if(manager==null)   throw new IllegalAccessException();
        manager.setManager(true);
        List<agent>reportees=manager.getReportee();
        reportees.add(reportee);
        reportee.setManagerId(manager.getManagerId());

        agentRepository.add(reportee);
        agentRepository.add(manager);
    }

    @Override
    public void printReportee(String managerId) throws IllegalArgumentException{
        agent manager=agentRepository.getAgent(managerId);

        if(manager==null)
            throw new IllegalArgumentException();

        List<agent> reportees=manager.getReportee();

        for(agent reportee:reportees)
        {
            System.out.println(reportee.getName());
            if(reportee.isManager())
            {
                List<agent> reporteesOfReportee=reportee.getReportee();
                for (agent reporteeOfReportee:reporteesOfReportee)
                {
                    System.out.println(reporteeOfReportee.getName());
                }
            }
        }

    }

    private agent createAgent(AgentDto agentDto) {
        return agent.getBuilder()
                .setName(agentDto.getName())
                .setId(UUID.randomUUID().toString())
                .setPhoneNumber(agentDto.getPhoneNumber())
                .setRole(agentDto.getRole())
                .setDateOfJoining(agentDto.getDateOfJoining())
                .build();

    }
}
