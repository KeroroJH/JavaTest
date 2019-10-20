package spring.ui;

import spring.domain.Exam;

public class DecoExamConsole implements ExamConsole {
	
	private Exam exam;

	@Override
	public void print() {
		System.out.println("************************************");
		System.out.println("exam sum : "+exam.total()+" exam avg :"+exam.avg());
		System.out.println("************************************");

	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
