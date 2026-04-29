import java.time.LocalDateTime;

public abstract class User {

    // --- Instance Variables ---
    private String userId;
    private String name;
    private String email;
    private String passwordHash;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private boolean isActive;
    private double totalProfitLoss;      // tracks overall P&L across all trades

    // Constructor
    public User(String userId, String name, String email, String passwordHash) {
        this.userId        = userId;
        this.name          = name;
        this.email         = email;
        this.passwordHash  = passwordHash;
        this.createdAt     = LocalDateTime.now();
        this.isActive      = true;
        this.totalProfitLoss = 0.0;
    }

    // Each user type displays differently (retail vs admin)
    public abstract void displayProfile();

    // Returns "RETAIL" or "ADMIN" — used in toString and menus
    public abstract String getRole();

    // User-type-specific validation (e.g., retail needs phone, admin needs dept)
    public abstract boolean validate();

    // Called after any Trade executes — subclass decides how to record it
    // Matches Trade.getType(), Trade.getPrice(), Trade.getQuantity()
    public abstract void onTradeExecuted(Trade trade);

    // Called when an Alert triggers — subclass decides how to notify
    // Matches Alert's checkAndTrigger() firing
    public abstract void onAlertTriggered(Alert alert);

    // Summary shown at end of simulation — ties into FinalSummary.java
    public abstract String getSummaryLine();

    // Password check — matches passwordHash field
    public boolean checkPassword(String inputHash) {
        return this.passwordHash.equals(inputHash);
    }

    public void updateProfitLoss(Trade trade) {
        double value = trade.getPrice() * trade.getQuantity();
        if (trade.getType().equalsIgnoreCase("BUY")) {
            totalProfitLoss -= value;
        } else if (trade.getType().equalsIgnoreCase("SELL")) {
            totalProfitLoss += value;
        }
    }

    public void deactivate()  { this.isActive = false; }
    public void activate()    { this.isActive = true;  }

    public String getUserId()            { return userId; }
    public String getName()              { return name; }
    public String getEmail()             { return email; }
    public String getPhoneNumber()       { return phoneNumber; }
    public LocalDateTime getCreatedAt()  { return createdAt; }
    public boolean isActive()            { return isActive; }
    public double getTotalProfitLoss()   { return totalProfitLoss; }

    public void setName(String name)           { this.name = name; }
    public void setEmail(String email)         { this.email = email; }
    public void setPhoneNumber(String phone)   { this.phoneNumber = phone; }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + " (" + userId + ") | P&L: " + totalProfitLoss;
    }
}