//random words because the lab told me to
public class BuddyInfo {

    private String buddyName;
    private String buddyAddress;
    private String buddyPhoneNumber;

    public BuddyInfo(){ //default constructor
        this("Steve","123 Pizza Street","111-222-3333");
    }

    public BuddyInfo(String buddyName, String buddyAddress, String buddyPhoneNumber) {
        this.buddyName = buddyName;
        this.buddyAddress = buddyAddress;
        this.buddyPhoneNumber = buddyPhoneNumber;
    }

    public String getBuddyName() {
        return buddyName;
    }

    public String getBuddyAddress() {
        return buddyAddress;
    }

    public String getBuddyPhoneNumber() {
        return buddyPhoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo BI = new BuddyInfo("John","","");
        System.out.println("Hello "+BI.getBuddyName());
    }
}
