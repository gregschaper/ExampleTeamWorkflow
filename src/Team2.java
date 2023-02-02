package Project00;


public class TeamMember extends Member
{
    public TeamMember(String name)
    {
        super(name);
	createTeamMembers();
    }
    public void createTeamMembers(){
	members.add(new TeamMember("Shawn Ryer"));
	members.add(new TeamMember("Carl Reyes"));
	members.add(new TeamMember("Anna Huang"));
	}
}



