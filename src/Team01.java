package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;

public class Team01 extends Team {
    public Team01(String team01) {
        super(team01);
        createTeamMembers();
    }

    @Override
    public void createTeamMembers()
    {
        members.add(new TeamMember("Nate Garay"));
        members.add(new TeamMember("Marie Stella Addo"));
    }
}
