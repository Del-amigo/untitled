package Day24;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    // create two set of member names, with duplicates
    //ex: team A: Dauke, Adilkhan, Shingis, Kuanish, Max
    //    team B: Ice, Max, Aydin, Damir, Shingis, Kuanish
    public static void main(String[] args) {
        HashSet<String> teamA = new HashSet<>();
        fillSet(teamA, new String[]{"Dauke", "Adilkhan", "John", "Alice", "Max"});


        HashSet<String> teamB = new HashSet<>();
        fillSet(teamB, new String[]{"Ice", "Max", "Aydin", "Damir", "John", "Alice"});

        HashSet<String>teamC = new HashSet<>();


        int totalMembers = totalMembers(teamA, teamB).size();

        HashSet<String> multiFunctionalMembers = multiFunctionalMembers(teamA, teamB);

        HashSet<String> singleTeamMembers = singleTeamMembers(teamA, teamB);

    }

    public static void fillSet(HashSet<String> team, String[] names) {
        for (String name : names) {
            team.add(name);
        }
    }

    // create method to find how many members we have in total
    public static HashSet<String> totalMembers(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> allMembers = new HashSet<>();
        allMembers.addAll(teamA);
        allMembers.addAll(teamB);

        return allMembers;
    }

    // create method to find who is working in two teams
    public static HashSet<String> multiFunctionalMembers(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.retainAll(teamB);

        return result;
    }

    // create method to find who are assigned to only one team
    public static HashSet<String> singleTeamMembers(HashSet<String> teamA, HashSet<String> teamB) {
        //step 1. get all members
        HashSet<String> all = totalMembers(teamA, teamB);

        //step 2. get common members in two teams, or multiFunctionalMembers
        HashSet<String> common = multiFunctionalMembers(teamA, teamB);

        //step 3. remove common members from all, this will give you singleTeam member
        all.removeAll(common);

        HashSet<String> singleTeamMembers = all;

        return singleTeamMembers;
    }
}