package Controller;

import Repository.AgentRepositoryImpl;
import Service.OnBoardService;
import Service.OnBoardServiceImpl;
import dto.AgentDto;

public class OnBoardController {
    private OnBoardService onBoardService;

    public OnBoardController() {
        this.onBoardService = new OnBoardServiceImpl(new AgentRepositoryImpl());
    }

    public void onBoardAgent(AgentDto agentDto)
    {
        onBoardService.onBoardAgent(agentDto);
    }
    public void assignManager(String managerId,String reporteeId) throws IllegalAccessException {
        onBoardService.assignManager(managerId,reporteeId);
    }
    public void printReportee(String managerId)
    {
        onBoardService.printReportee(managerId);
    }
}
