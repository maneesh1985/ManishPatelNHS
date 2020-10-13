package TestListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Base.BaseClass;



public class MyTransformer extends BaseClass implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class class1, Constructor constructor, Method method) {
		annotation.setRetryAnalyzer(RetryAnalyser.class);
	}

}
