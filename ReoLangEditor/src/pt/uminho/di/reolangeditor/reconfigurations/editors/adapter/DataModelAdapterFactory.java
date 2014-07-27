package pt.uminho.di.reolangeditor.reconfigurations.editors.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;

import pt.uminho.di.reolangeditor.reconfigurations.editors.adapter.model.DataModel;

public class DataModelAdapterFactory implements IAdapterFactory {

//	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType== IPropertySource.class && adaptableObject instanceof DataModel){
			return new DataModelPropertySource((DataModel) adaptableObject);
		}
		return null;
	}

//	@Override
	public Class[] getAdapterList() {
		return new Class[] { IPropertySource.class };
	}

} 
