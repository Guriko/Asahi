/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package asahi;

import org.apache.commons.io.FilenameUtils;
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	
        System.out.println(FilenameUtils.getExtension("c:/foo/bar/hoge.fuga"));
        
        System.out.println(new App().getGreeting());

    }
}