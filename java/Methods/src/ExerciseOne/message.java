package ExerciseOne;

public class message {

	public static void getMessage(int hour) {
		switch(hour) {
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			goodMorningMessage();
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
			goodAfternoonMessage();
			break;
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			goodNightMessage();
			break;
		default:
			System.out.println("Hora inválida.");
			break;
		}
	}
	
	public static void goodMorningMessage() {
		System.out.println("Bom dia!");
	}
	
	public static void goodAfternoonMessage() {
		System.out.println("Boa tarde!");
	}
	
	public static void goodNightMessage() {
		System.out.println("Boa noite!");
	}
}