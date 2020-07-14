package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{ // 오류처리 (14장, 15장)
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 시나리오 4");
		
		int ch = System.in.read(); // 할당 방식 입력받아 ch 변수에 대입
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') { 
			scheduler = new RoundRobin();
		}
		else if (ch=='L' || ch =='l') {
			scheduler = new LeastJob();
		}
		else if (ch=='P' || ch =='p') {
			scheduler = new PriorityAllocation();
		}
		else if (ch=='A'||ch=='a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		scheduler.getNextCall();	
		scheduler.sendCallToAgent();
	}	

}