package pt.uminho.di.reolangeditor.reconfigurations.editors.adapter;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import pt.uminho.di.reolangeditor.reconfigurations.editors.adapter.model.DataModel;


public class DataModelPropertySource implements IPropertySource {

	private final DataModel data_model;

	public DataModelPropertySource(DataModel dm) {
		this.data_model = dm;
	}


//	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

//	@Override
	public Object getEditableValue() {
		return this;
	}

//	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {

		return new IPropertyDescriptor[] {
				new TextPropertyDescriptor("summary", "Summary"),
				new TextPropertyDescriptor("description", "Description") 
		};
	}

//	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("summary")) {
			return data_model.getSummary();
		}
		
		if (id.equals("description")) {
			return data_model.getDescription();
		}
		return null;
	}

//	@Override
	public void resetPropertyValue(Object id) {
	}

//	@Override
	public void setPropertyValue(Object id, Object value) {
		String s = (String) value;
		if (id.equals("summary")) {
			data_model.setSummary(s);
		}
	
		if (id.equals("description")) {
			data_model.setDescription(s);
		}
	}

} 
