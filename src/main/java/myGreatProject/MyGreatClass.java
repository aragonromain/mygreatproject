package myGreatProject;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

public class MyGreatClass {
	public static void main(String[] args) {

		System.out.println(Strings.isNullOrEmpty("kikou"));
		System.out.println(Strings.isNullOrEmpty(""));
		System.out.println(Strings.isNullOrEmpty(null));

		System.out.println(StringUtils.isEmpty(null));
		System.out.println(StringUtils.isEmpty("kikou"));
		System.out.println(StringUtils.isEmpty(""));
		
		// commentaire utile 
	}
}
