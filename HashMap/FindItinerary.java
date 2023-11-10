import java.util.*;
public class FindItinerary {

    public static void main(String[] args) {
        findItin();
    }

    public static void findItin() {
        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());

        Map<String, String> stationMap = new HashMap<>();
        HashSet<String> startingSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = scn.nextLine().split(" ");

            String station1 = input[0];
            String station2 = input[1];

            stationMap.put(station1, station2);
            startingSet.add(station1);
        }

        List<String> station2List = new ArrayList<>(stationMap.values());
        for (String reachStation: station2List) {
            if (startingSet.contains(reachStation)) {
                startingSet.remove(reachStation);
            }
        }

        String startingPoint = startingSet.iterator().next(); // only 1 size is present always

        System.out.println(stationMap);
        System.out.println(startingPoint);
        while(stationMap.containsKey(startingPoint)) {

            if (stationMap.size() == 1) {
                System.out.println(startingPoint + " --> " + stationMap.get(startingPoint));
                break;
            }

            System.out.print(startingPoint + " --> ");
            String newStartingPoint = stationMap.get(startingPoint);
            stationMap.remove(startingPoint);
            startingPoint = newStartingPoint;
        }
    }
}