import java.util.ArrayList;
public class AddressBook {
    ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();

    public AddressBook(ArrayList buddyList){
        this.buddyList = buddyList;
    }

    public AddressBook(){

    }

    public void addBuddy(BuddyInfo newBuddy){
        buddyList.add(newBuddy);
    }

    public ArrayList getBuddy(){
        return buddyList;
    }

    public void removeBuddy(BuddyInfo buddy){
        for (int i = 0; i < buddyList.size(); i++){
            if (buddyList.get(i).equals(buddy)){
                buddyList.remove(i);
            }
            else{
                System.out.println("The buddy does not exist in this address book");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook ab = new AddressBook();
        BuddyInfo bud = new BuddyInfo();
        ab.addBuddy(bud);
        ab.removeBuddy(bud);
    }
}
