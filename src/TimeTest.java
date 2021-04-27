
public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		t.setHour(t.getHour()+1);//1시간 후로 변경
		System.out.println(t);
	}
}

class Time {
	private int hour, minute, second;

	Time(int hour, int minute, int second) {// 생성자
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	//시간
	public int getHour() { // 출력 메서드 겟터
		return hour;
	}

	public void setHour(int hour) { // 값 변경 메서드 셋터
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}
	//분
	public int getMinute() { // 출력 메서드 겟터
		return hour;
	}

	public void setMinute(int minute) { // 값 변경 메서드 셋터
		if (hour < 0 || hour > 59)
			return;
		this.minute = minute;
	}
	//초
	public int getSecond() { // 출력 메서드 겟터
		return second;
	}

	public void setSecond(int second) { // 값 변경 메서드 셋터
		if (hour < 0 || hour > 59)
			return;
		this.second = second;
	}
	//출력
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
