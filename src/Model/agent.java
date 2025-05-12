package Model;

import Constants.Role;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class agent {
    private String id;
    private String name;
    private LocalDateTime dateOfJoining;
    private String phoneNumber;
    private Role role;
    private boolean isManager;
    private List<agent> reportee;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public List<agent> getReportee() {
        return reportee;
    }

    public void setReportee(List<agent> reportee) {
        this.reportee = reportee;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }


    private String managerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public List<agent> getReportee() {
        return reportee;
    }

    public void setReportee(List<agent> reportee) {
        this.reportee = reportee;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    private agent(Builder builder)
    {
        this.id=builder.id;
        this.name=builder.name;
        this.dateOfJoining=builder.dateOfJoining;
        this.phoneNumber=builder.phoneNumber;
        this.role=builder.role;
        this.reportee=new ArrayList<>();
    }

    public agent() {
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    public static class Builder{
        private String id;
        private String name;
        private LocalDateTime dateOfJoining;
        private String phoneNumber;
        private Role role;

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDateOfJoining(LocalDateTime dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public agent build()
        {
            return new agent(this);
        }
    }
}
