package pt.uminho.di.reolangeditor.editors.outline;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;


import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.SimpleSymbolsTable;
import pt.uminho.di.reolang.parsing.util.Type;

public class ReoLangContentOutlineProvider extends LabelProvider implements ITreeContentProvider {

	
	public ReoLangContentOutlineProvider() {
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
				case CHANNEL : img = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER); break;
				case PATTERN : img = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER); break;
				/*case IN_PORT : break;
				case OUT_PORT: break;
				case EXTENSION: break;
				case STATE 	: break;
				case CONDITION : break;
				case OBSERVER : break;
				case TIME : break;
				case STRUCTURE : break;
				case INSTANCE : break;
				case NODE : break;
				case TYPE : break;*/
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
