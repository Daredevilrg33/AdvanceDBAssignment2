import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignmentMain {

	static List<PointModel> pointModels;

	public static void main(String[] args) {
		// (935.3862, 873.0388, 751.9737)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of records: ");
		String noOfRecords = scanner.nextLine();
		int records = Integer.valueOf(noOfRecords);
		pointModels = new ArrayList<>(records);
		for (int i = 0; i < records; i++) {
			String recordData = scanner.nextLine();
			pointModels.add(getPointModel(recordData));
		}
		System.out.println(pointModels);

	}

	static PointModel getPointModel(String record) {
		PointModel pointModel = null;
		String subStringData = record.trim().substring(1, record.length() - 1);
		String[] splitData = subStringData.split(",");
		double x = Double.valueOf(splitData[0].trim());
		double y = Double.valueOf(splitData[1].trim());
		double z = Double.valueOf(splitData[2].trim());
		pointModel = new PointModel(x, y, z);
		return pointModel;
	}

	static double getMedian(int value) {
		double median = 0.0;
		switch (value) {
		case 1:
				
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
		return median;
	}

}
