package com.java.practice.datatransfer;

public class TestExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nameString = new String("Mukesh");
		
		System.out.println(nameString.toLowerCase());
		
		Exam exam = new Exam();
		exam.examId = 122;
		exam.examName = "Math";
		exam.totalMarks = 100;
		exam.totalQuestions = 50;
		
//		printExam(exam);

	}

	private static void printExam(Exam exam) {
		System.out.println(exam.examId);
		
	}

}
