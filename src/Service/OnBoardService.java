package Service;

import dto.AgentDto;

public interface OnBoardService {
    void onBoardAgent(AgentDto agentDto);

    void assignManager(String managerId, String reporteeId) throws IllegalAccessException;

    void printReportee(String managerId);
}
