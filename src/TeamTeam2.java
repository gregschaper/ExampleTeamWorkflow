package Project00;

public class TeamTeam2 extends Team{

    public TeamTeam2(String name) {
        super(name);
        createTeamMembers();
    }
    @Override
    public void createTeamMembers() {
        members.add(new TeamMember("Seth Coleman"));
        members.add(new TeamMember("Owen Halliday"));
        members.add(new TeamMember("Orlando Rodriguez"));

    }

}
