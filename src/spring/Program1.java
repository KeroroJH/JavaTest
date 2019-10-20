package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.domain.Exam;
import spring.ui.ExamConsole;

public class Program1 {

	public static void main(String[] args) {
/*		Exam exam = new KroExam();
		ExamConsole console = new DecoExamConsole();
		console.setExam(exam);
		
		console.print();*/

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring/setting.xml");
		//ExamConsole console = ap.getBean(ExamConsole.class);
		ExamConsole console = (ExamConsole) ap.getBean("examconsole2");
		
		console.print();
		
		System.out.println("****************************");
		
		Exam ex01 = (Exam) ap.getBean("exam3");
		System.out.println(ex01);

	}

}
