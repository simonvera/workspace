package cl.curso.java.abstract_factory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory{

	public Window createWindow() {
		// TODO Auto-generated method stub
		return new MSWindow();
	}

}
