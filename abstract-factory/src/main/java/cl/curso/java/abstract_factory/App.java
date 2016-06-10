package cl.curso.java.abstract_factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String plataform=System.getProperty("os.name").toLowerCase();
        System.out.println(plataform);
        GUIBuilder builder=new GUIBuilder();
        if(plataform.startsWith("win")){
        	builder.buildWindow(new MsWindowsWidgetFactory());
        }else{
        	builder.buildWindow(new MacOSXWidgetFactory());
        }
    }
}
