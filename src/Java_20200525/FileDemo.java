package Java_20200525;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	// 디렉토리 생성법
	public static void main(String[] args) {
		File f1 = new File("C:\\dev\\2020\\05\\25");// 파일경로
		boolean success = f1.mkdirs(); // mkdir과 다른점 : mkdirs는 디렉토리 안에 만들 수 있다.
		if (success) {
			System.out.println("디렉토리를 생성했습니다.");

		} else {
			System.out.println("이미 디렉토리가 있습니다.");
		}
		// 파일크기 출력
		File f2 = new File("C:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024; // length는 바이트라서 1024로 킬로바이트로 변환
		System.out.println(fileSize + "KB");

		// 파일이름만 출력
		String fileName = f2.getName();
		System.out.println(fileName);

		// 파일경로만 출력
		String path = f2.getPath();
		System.out.println(path);

		// 파일형태 출력
		if (fileName.endsWith("exe")) {
			System.out.println("응용 프로그램");
		} else if (fileName.endsWith("pdf")) {
			System.out.println("pdf 파일");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일");
		}
		
		//1970년 1월 1일부터 마지막 수정한 날짜까지 m/s으로 반환
		long lastModified = f2.lastModified();
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:");
		String date =sdf.format(cal.getTime());
		System.out.println(date);
		
		//파일 생성
		File f3 = new File("c:\\dev\\Hello.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //예외처리해야해서 
		
		File f4 = new File("c:\\dev\\HelloWorld.java");
		f3.renameTo(f4);
		
	}
}

/*
 * File 클래스
 * 1. 디렉토리 생성***
 * 2. 파일크기*****, 파일경로, 파일이름, 마지막 수정날짜
 * 3. 파일 생성, 삭제***
 * 4. 파일 이름바꾸기***
*/