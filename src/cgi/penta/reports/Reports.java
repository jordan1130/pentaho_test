package cgi.penta.reports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reports {
	static Boolean dirfolder = false;
	static File file;
	final static String name = fileName();

	private Boolean createDirectory(String location) {
		file = new File(location + "/" + name);
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
				dirfolder = true;
			} else {
				System.out.println("Failed to create directory!");
			}
		}
		return dirfolder;
	}

	private static String fileName() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy_HH.mm.ss-a");
		return sdf.format(new Date());
	}

	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(new Reports().createDirectory("./reports/screenShots"));
		new Reports().createDirectory("./reports/excelSheets");

	}

}
