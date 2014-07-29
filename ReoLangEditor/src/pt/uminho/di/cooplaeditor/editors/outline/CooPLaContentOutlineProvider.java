package pt.uminho.di.cooplaeditor.editors.outline;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;


import pt.uminho.di.cooplaeditor.Activator;
import pt.uminho.di.cooplaeditor.editors.CooPLaEditor;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.SimpleSymbolsTable;
import pt.uminho.di.reolang.parsing.util.Type;

public class CooPLaContentOutlineProvider extends LabelProvider implements ITreeContentProvider {

	
	public CooPLaContentOutlineProvider() {
		super();
	}
	

	
	
	//LabelProvider
	
	@Override
	public String getText(Object element) {
		String s ="";
		if(element instanceof SimpleSymbol){
			SimpleSymbol ss = (SimpleSymbol) element;
			s = ss.getId();
			switch(ss.getType()){
				
				case INSTANCE : {
					ArrayList<String> keys_to_remove = new ArrayList<String>(1);
					SimpleSymbolsTable scope = ss.getScope();
					for(String k : scope.getSymbols().keySet()){
						SimpleSymbol instance_child = scope.getSymbols().get(k);
						if(instance_child.getType().equals(Type.TYPE)){
							s+= " : " + instance_child.getId();
							keys_to_remove.add(k);
						}
					}
					for(String k : keys_to_remove){
						scope.getSymbols().remove(k);
					}
					
				} break;
				default : break;
			}
			
		}
		return s; 
	}
	
	
	@Override
	public Image getImage(Object element) {
		Image img = super.getImage(element);
		if(element instanceof SimpleSymbol) {
			switch(((SimpleSymbol) element).getType()){
				case CHANNEL : img = Activator.getImageDescriptor("/icons/outline/channel.gif").createImage(); break;
				case PATTERN : img = Activator.getImageDescriptor("/icons/outline/pattern.gif").createImage(); break;
				case IN_PORT : img = Activator.getImageDescriptor("/icons/outline/in_port.gif").createImage(); break;
				case OUT_PORT: img = Activator.getImageDescriptor("/icons/outline/out_port.gif").createImage();break;
				case EXTENSION: img = Activator.getImageDescriptor("/icons/outline/extension.gif").createImage();break;
				case STATE 	: img = Activator.getImageDescriptor("/icons/outline/state.gif").createImage();break;
				case CONDITION : img = Activator.getImageDescriptor("/icons/outline/condition.gif").createImage();break;
				case OBSERVER : img = Activator.getImageDescriptor("/icons/outline/observer.gif").createImage();break;
				case TIME : img = Activator.getImageDescriptor("/icons/outline/time.gif").createImage();break;
				case STRUCTURE : img = Activator.getImageDescriptor("/icons/outline/structure.gif").createImage();break;
				case INSTANCE : img = Activator.getImageDescriptor("/icons/outline/instance.gif").createImage();break;
				case NODE : img = Activator.getImageDescriptor("/icons/outline/node.gif").createImage();break;
				case TYPE : img = Activator.getImageDescriptor("/icons/outline/type.gif").createImage();break;
				default : img = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE); break;
			}
		}
		return img; 
	}
	
	
	
	
	//ITreeContentProvider...
	
	
	public void dispose() {
	
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}

	
	
	
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public Object[] getChildren(Object parentElement) {
		Object[] res = new Object[0];
		if(parentElement instanceof SimpleSymbol){
			SimpleSymbol ss = (SimpleSymbol) parentElement;
			res = ss.getScope().getSymbols().values().toArray(res); 
			//TODO -- Need to sort by offsetStart...
		}
		return res;
	}

	public Object getParent(Object element) {
		Object res = null;
		
		if(element instanceof SimpleSymbol){
			res = ((SimpleSymbol)element).getParent();
		}
		
		return res;
	}

	public boolean hasChildren(Object element) {
		int size = ((SimpleSymbol)element).getScope().getSymbols().size();
		boolean res = (element instanceof SimpleSymbol) ? ((SimpleSymbol)element).getScope().getSymbols().size() > 0 : false; 
		return res;
	}

}
