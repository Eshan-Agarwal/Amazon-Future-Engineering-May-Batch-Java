import java.util.*;
public class NumberOfEmpUnderManager {

    public static void main(String[] args) {
        Map<String, Integer> directReportMap = getNumberOfReports();
        System.out.println(directReportMap);
    }

    public static Map<String, Integer> getNumberOfReports() {

        Scanner scn = new Scanner(System.in);
        Map<String, HashSet<String>> managersMap = new HashMap<>();

        int n = Integer.parseInt(scn.nextLine());


        String ceo = "";
        for (int i = 0; i < n; i++) {
            String[] input = scn.nextLine().split(" ");

            String emp = input[0];
            String manager = input[1];

            if (emp.equals(manager)) {
                ceo = manager;
                continue;
            }

            if (managersMap.containsKey(manager)) {
                HashSet<String> empSet = managersMap.get(manager);
                empSet.add(emp);
                managersMap.put(manager, empSet);
            } else {
                HashSet<String> empSet = new HashSet<>();
                empSet.add(emp);
                managersMap.put(manager, empSet);
            }

        }

        System.out.println("CEO: " + ceo);
        System.out.println(managersMap);

        Map<String, Integer> directReportMap = new HashMap<>();
        processDirectReports(managersMap, ceo, directReportMap);
        return directReportMap;
    }

    public static int processDirectReports(Map<String, HashSet<String>> managersMap,
                                            String manager, Map<String, Integer> directReportMap) {

        if (! managersMap.containsKey(manager)) {
            directReportMap.put(manager, 0);
            return 1;
        }

        int numOfEmp = 0;
        for (String emp: managersMap.get(manager)) {
            numOfEmp += processDirectReports(managersMap, emp, directReportMap);
        }

        directReportMap.put(manager, numOfEmp);
        return numOfEmp + 1;

    }

}