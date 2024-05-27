package Entity;
import java.util.ArrayList;
/*
 * COMP217: Java Programming / Team 03
 * Prof: Suh, Young-Kyoon
 *
 * Group: class which can save some information of each Group object
 * @author: Seo, HyeongCheol
 */
public class Group implements cloneArrayList {
    private String groupName;
    private President president;
    private Administrator administrator;
    private ArrayList<abs_Member> MemberList;
    private ArrayList<Transaction> transactionList;
    public Group() { // default constructor
        setGroupName("None");
        setPresident(null);
        setMemberList(new ArrayList<abs_Member>());
        setTransactionList(new ArrayList<Transaction>());
    }
    public Group(String name, President president) { // Constructor with parameter
        setGroupName(name);
        setPresident(president);
        setMemberList(new ArrayList<abs_Member>());
        setTransactionList(new ArrayList<Transaction>());
    }
    public Group(Group otherObj){ // copy constructor
        setGroupName(otherObj.getGroupName());
        setPresident(otherObj.getPresident());
        setMemberList(otherObj.getMemberList()); // Copied ArrayList
        setTransactionList(otherObj.getTransactionList()); // Copied ArrayList
    }
    public ArrayList<abs_Member> cloneArrList(ArrayList<abs_Member> original){
        ArrayList<abs_Member> newArr = new ArrayList<abs_Member>();
        for (abs_Member obj : original) {
            if (obj instanceof Administrator){
                newArr.add(new Administrator(obj));
            } else if (obj instanceof President){
                newArr.add(new President(obj));
            } else {
                newArr.add((new Member(obj)));
            }
        }
        return newArr;
    }
    public ArrayList<Transaction> cloneTransList(ArrayList<Transaction> original){
        ArrayList<Transaction> newArr = new ArrayList<Transaction>();
        for (Transaction transaction : original) {
            newArr.add(new Transaction(transaction));
        }
        return newArr;
    }
    public String getGroupName() { return this.groupName; }
    public President getPresident() {return this.president; }
    public Administrator getAdministrator() { return this.administrator; }
    public ArrayList<abs_Member> getMemberList() { return this.MemberList; }
    public ArrayList<Transaction> getTransactionList() { return this.transactionList; }
    public void setGroupName(String name) { this.groupName = name; }
    public void setPresident(President president) { this.president = president; }
    public void setAdministrator(Administrator administrator) { this.administrator = administrator; }
    public void setMemberList(ArrayList<abs_Member> groupMemberList) { this.MemberList = groupMemberList; }
    public void setTransactionList(ArrayList<Transaction> transactionList) { this.transactionList = transactionList; }
    public void addMember(abs_Member obj) { this.MemberList.add(obj); }
    public void addTransaction(Transaction obj) { this.transactionList.add(obj); }
}
