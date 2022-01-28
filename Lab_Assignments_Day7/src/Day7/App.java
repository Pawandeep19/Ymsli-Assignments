package Day7;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("Day7.AnnotatedClass");
		Method[] methods = c.getDeclaredMethods();
		readAnnotation(c);
		System.out.println();
		readAnnotation(methods);
	}
	
	public static void readAnnotation(Method[] methods) {
		System.out.println("********Method Annotations*********");
		for(Method method : methods) {
			
			Annotation[] methodAnnotations = method.getAnnotations();
			for(Annotation annotation : methodAnnotations) {
				
				if(annotation instanceof Author) {
					Author author = (Author)annotation;
					System.out.println("Author: "+author.name());
				}
				
				if(annotation instanceof Version) {
					Version version = (Version)annotation;
					System.out.println("Version : "+version.number());
				}
				
			}
		}

	}
	
	public static void readAnnotation(Class<?> clas) {
		System.out.println("************Class Annotations************");
		
		Annotation[] classAnnotations = clas.getAnnotations();
		for(Annotation annotation : classAnnotations) {
			
			if(annotation instanceof Author) {
				Author author = (Author)annotation;
				System.out.println("Author: "+author.name());
			}
			
			if(annotation instanceof Version) {
				Version version = (Version)annotation;
				System.out.println("Version : "+version.number());
			}
			
		}

	}
	
}
