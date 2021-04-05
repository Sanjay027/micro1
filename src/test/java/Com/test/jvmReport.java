//package Com.test;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.locks.Condition;
//
//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;
//
//public class jvmReport {
//	public static void report(String json) {
//		File fref=new File("C:\\Users\\G Sree Mamatha\\eclipse-workspace\\cucumber\\PojoCucumberBaseClass\\src\\test\\resources\\Reports\\jvm");
//	Condition conref=new Configuration(fref, "adactin autoation");
//	conref.addClassifications("sprint", "34");
//	List<String> listref=new ArrayList<String>();
//	listref.add(json);
//	ReportBuilder builder=new ReportBuilder(listref, conref);
//	builder.generateReports();
//
//	}
//
//}
