package edu.akarimin.geekle.ch1;

public record NewRecord(String fullName, String role) {
    public NewRecord {
        if (fullName != null && role != null) {
            this.fullName = fullName;
            this.role = role;
        } else
            throw new IllegalArgumentException("Bad inputs.");
    }

    public NewRecord(String role) {
        this(null, role);
    }
}
