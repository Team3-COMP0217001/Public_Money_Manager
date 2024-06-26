package Entity;

import java.io.Serializable;

/*
 * COMP217: Java Programming / Team 03
 * Prof: Suh, Young-Kyoon
 *
 * MemberPosition: class For member's position of each Group.
 * @author: Seo, HyeongCheol
 */
public class MemberPosition implements Serializable {
    private String groupName;
    private PositionList position;
    public MemberPosition() { // default constructor
        setGroupName("None");
        setPosition(PositionList.NONE);
    }
    public MemberPosition(String name, PositionList position){ // Constructor with Parameters
        setGroupName(name);
        setPosition(position);
    }
    public MemberPosition(MemberPosition otherObj){ // Copy Constructor
        setGroupName(otherObj.getGroupName());
        setPosition(otherObj.getPosition());
    }
    @Override
    public String toString(){
        return "Group: " + getGroupName() + " | Position: " + getPosition();
    }
    public String getGroupName(){ return this.groupName; }
    public PositionList getPosition() { return this.position; }
    public void setGroupName(String groupName) { this.groupName = groupName; }
    public void setPosition(PositionList position) { this.position = position; }
}
