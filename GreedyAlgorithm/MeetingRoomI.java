import java.util.*;

public class MeetingRoomI {

    static class Meetings {
        int start;
        int end;

        Meetings(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static class MyComparator implements Comparator<Meetings> {

        // ascending order
        public int compare(Meetings other1, Meetings other2) {
            if (other1.end < other2.end) {
                return -1;
            } else if (other1.end > other2.end) {
                return +1;
            }

            return 0;
        }

    }

    public static void main(String[] args) {
        int[] start = new int[]{1, 3, 0, 5, 8, 5};
        int[] end = new int[]{2, 4, 6, 7, 9, 9};

        List<Meetings> meetingsList = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            Meetings meeting = new Meetings(start[i], end[i]);
            meetingsList.add(meeting);
        }

        MyComparator myComparator = new MyComparator();
        Collections.sort(meetingsList, myComparator);

        int ans = 1;
        int prevEndTime = meetingsList.get(0).end;
        for (int i = 1; i < meetingsList.size(); i++) {

            Meetings currentMeeting = meetingsList.get(i);
            if (currentMeeting.start > prevEndTime) {
                ans++;
                prevEndTime = currentMeeting.end;
            }

        }

        System.out.println(ans);
    }
}