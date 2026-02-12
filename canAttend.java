import java.util.ArrayList;

public class CanAttend {
	//Fouad Kadry, period 4, 2/10/25
	//precondition: needs an ArrayList of MeetingIntervals to function as the sigular input
	//postcondition: returns whether or not you can attend all of these meetings based on if their times overlap
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
        System.out.println(meetings);
        for (int i = 0; i < meetings.size(); i++) {
            for(int m = i+1; m< meetings.size(); m++) {
				if (((meetings.get(i).getStart()-meetings.get(m).getEnd())<0) && ((meetings.get(m).getStart()-meetings.get(i).getEnd())<0)) {

				}
				else if (((meetings.get(i).getStart()-meetings.get(m).getEnd())>0) && ((meetings.get(m).getStart()-meetings.get(i).getEnd())>0)) {

				}
				else {
					return false;
				}
            }

        }
		return true; //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
	}
}

