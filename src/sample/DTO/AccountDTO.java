package sample.DTO;

public class AccountDTO {
    int id;
    String name;
    String firstName;
    String accountName;
    String IBAN;
    String bankName;
    int cardNumber;
    String validUntil;
    int PIN;
    int cardLimit;
    boolean isLocked;
    int accountBalance;

    public AccountDTO() {
    }

    public AccountDTO(int id, String name, String firstName, String accountName, String IBAN, String bankName, int cardNumber, String validUntil, int PIN, int cardLimit, boolean isLocked, int accountBalance) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.accountName = accountName;
        this.IBAN = IBAN;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.validUntil = validUntil;
        this.PIN = PIN;
        this.cardLimit = cardLimit;
        this.isLocked = isLocked;
        this.accountBalance = accountBalance;
    }

    public AccountDTO(String name, String firstName, String accountName, String IBAN, String bankName, int cardNumber, String validUntil, int PIN, int cardLimit, boolean isLocked, int accountBalance) {
        this.name = name;
        this.firstName = firstName;
        this.accountName = accountName;
        this.IBAN = IBAN;
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.validUntil = validUntil;
        this.PIN = PIN;
        this.cardLimit = cardLimit;
        this.isLocked = isLocked;
        this.accountBalance = accountBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int cardLimit) {
        this.cardLimit = cardLimit;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
}
