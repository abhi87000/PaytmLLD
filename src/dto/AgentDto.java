package dto;

import Constants.Role;
import Constants.Type;

import java.time.LocalDateTime;

public class AgentDto {
    private String name;
    private LocalDateTime dateOfJoining;
    private String phoneNumber;
    private Type agentType;
    private Role role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAgentType(Type agentType) {
        this.agentType = agentType;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public Type getAgentType() {
        return agentType;
    }

    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
