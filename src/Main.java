import Constants.Role;
import Constants.Type;
import Controller.OnBoardController;
import Service.OnBoardService;
import dto.AgentDto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        OnBoardController onBoardController=new OnBoardController();
        while(true)
        {
            int n;
            Scanner scanner=new Scanner(System.in);
            n=scanner.nextInt();
            if(n==0){
                scanner.close();
                break;
            }

            switch (n){
                case 1: {
                    AgentDto agentDto = new AgentDto();
                    agentDto.setName(scanner.next());
                    String role = scanner.next();
                    agentDto.setRole(Role.valueOf(role));
                    agentDto.setPhoneNumber(scanner.next());
                    agentDto.setDateOfJoining(LocalDateTime.now());
                    onBoardController.onBoardAgent(agentDto);
                    break;
                }
                case 2: {
                    String managerId = scanner.next();

                    String reporteeId = scanner.next();
                    onBoardController.assignManager(managerId, reporteeId);
                    break;
                }
                case 3: {
                    String managerId = scanner.next();
                    onBoardController.printReportee(managerId);
                    break;
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }
}