package baseline;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class HTMLFileWriterTest {

    // create class test object
    HTMLFileWriter test;

    // create one test to be run in only one method
    // we can test that the result is standard this way
    // this will be demonstrated by the final test method
    static HTMLFileWriter finalTest;
    @BeforeAll
    static void init_finalTest() {
        finalTest = new HTMLFileWriter("final_test","author",true,true);
    }

    // test that the JavaScript directory was created correctly
    // note: this applies to the four following tests
    @Test
    void test_JSDirectoryCreationWithTrueTrue() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",true,true);
        File js = new File("./data/website/website_name/js");
        assertTrue(js.isDirectory());
    }

    @Test
    void test_JSDirectoryCreationWithTrueFalse() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",true,false);
        File js = new File("./data/website/website_name/js");
        assertTrue(js.isDirectory());
    }

    @Test
    void test_JSDirectoryCreationWithFalseTrue() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",false,true);
        File js = new File("./data/website/website_name/js");
        assertFalse(js.isDirectory());
    }

    @Test
    void test_JSDirectoryCreationWithFalseFalse() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",false,false);
        File js = new File("./data/website/website_name/js");
        assertFalse(js.isDirectory());
    }

    // test that the CSS directories were created correctly
    // note: this applies to the next four tests
    @Test
    void test_CSSDirectoryCreationWithTrueTrue() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",true,true);
        File css = new File("./data/website/website_name/css");
        assertTrue(css.isDirectory());
    }

    @Test
    void test_CSSDirectoryCreationWithTrueFalse() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",true,false);
        File css = new File("./data/website/website_name/css");
        assertFalse(css.isDirectory());
    }

    @Test
    void test_CSSDirectoryCreationWithFalseTrue() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",false,true);
        File css = new File("./data/website/website_name/css");
        assertTrue(css.isDirectory());
    }

    @Test
    void test_CSSDirectoryCreationWithFalseFalse() {
        // delete preexisting directories
        File delete = new File("./data/website/website_name/js");
        delete.delete();
        delete = new File("./data/website/website_name/css");
        delete.delete();

        test = new HTMLFileWriter("website_name","author_name",false,false);
        File css = new File("./data/website/website_name/css");
        assertFalse(css.isDirectory());
    }

    // test that the html files were created correctly
    // note: since the file is created regardless of parameters, we only need to test one object
    @Test
    void test_generateHTMLFile() {
        test = new HTMLFileWriter("website_name","author_name",true,true);
        File html = new File("./data/website/website_name/index.html");
        assertTrue(html.isFile());
    }

    // test that the data is written into the html file
    @Test
    void test_writeDataToHTML() {
        // try to read directory
        try (BufferedReader in = new BufferedReader(new FileReader("./data/website/final_test/index.html"))) {
            // get the entire html string
            String html = "";
            String temp = " ";
            while(temp != null) {
                temp = in.readLine();
                if(temp != null) html += temp;
            }

            // find the website name using regex pattern
            Pattern websitePattern = Pattern.compile("<title>final_test</title>");
            Matcher findWebsiteName = websitePattern.matcher(html);
            assertTrue(findWebsiteName.find());

            // find the author name using regex pattern
            Pattern authorPattern = Pattern.compile("<meta>author</html>");
            Matcher findAuthorName = authorPattern.matcher(html);
            assertTrue(findAuthorName.find());
        }
        // file was not created
        catch (FileNotFoundException fileNotFoundException) {
            fail("HTML file does not exist. ");
        }
        catch (IOException ioException) {
            fail("IOException thrown. ");
        }
    }
}