package Task2;
import java.util.Scanner; //èìïîğòèğóåì êëàññ Scanner
public class Task2Point7 {

	public static void main(String[] args) {
		//ñîçäàåì îáúåêò êëàññà Scanner äëÿ ââîäà äàííûõ
		Scanner input = new Scanner(System.in); 
		int day=0;
		
		System.out.println("Ââåäèòå íîìåğ äíÿ íåäåëè: ");
		day = input.nextInt(); //âîäèì íîìåğ äíÿ
		//åñëè ÷èñëî áîëüøå 0 è ìåíüøå 8, òî âûâîäèì ñîîòâåòñòâóşùèé äåíü íåäåëè		
		if (day>0&&day<8){ 
			switch (day) {
				case 1: System.out.println("Ïîíåäåëüíèê");
					break;
				case 2: System.out.println("Âòîğíèê");
					break;
				case 3: System.out.println("Ñğåäà");
					break;	
				case 4: System.out.println("×åòâåğã");
					break;
				case 5: System.out.println("Ïÿòíèöà");
					break;
				case 6: System.out.println("Ñóááîòà");
					break;
				case 7: System.out.println("Âîñêğåñåíèå");
			}
		}
			//åñëè ÷èñëî íå â íóæíîì äèàïàçîíå âûâîäèì ñîîáùåíèå îá îøèáêå
			else System.out.println("Âû ââåëè íåâåğíûé íîìåğ.");
	}

}
