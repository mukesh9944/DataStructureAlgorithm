package algorithm.array;

/**
 * There are ( N+1 ) people in a party, they might or might not know each others names.?
 * There is one celebrity in the group (total N + 1 people),
 * celebrity does not know any of N peoples by name and all N people know celebrity by name.
 * You are given the list of people’s names (N + 1), You can ask only one question from the people.
 * Do you know this name? How many maximum number of questions you need to ask to know the celebrity name?
 */
public class FindingCelebrityInParty {

    public static void main(String[] args) {
        int[][] people = {{0,0,1,0},
                {0,0,1,0},
                {0,0,0,0},
                {0,0,1,0}};
        int x = 0;
        int y = people.length-1;
        while (x < y){
            if(people[x][y] == 1){
                x++;
            }else{
                y--;
            }
        }

        System.out.println("Celebrity "+x);
    }
}
