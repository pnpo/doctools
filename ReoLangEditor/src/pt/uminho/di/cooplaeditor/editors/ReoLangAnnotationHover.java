package pt.uminho.di.cooplaeditor.editors;

import java.util.ArrayList;
import java.util.Iterator;


import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;


public class ReoLangAnnotationHover implements IAnnotationHover {

	
	
	private ArrayList<Annotation> getAnnotationsForLine(ISourceViewer viewer, int line){
		ArrayList<Annotation> annotations = new ArrayList<Annotation>();
		IAnnotationModel model = viewer.getAnnotationModel();
		IDocument doc = viewer.getDocument();
		
		if (model == null)
			return null;
		
		@SuppressWarnings("unchecked")
		Iterator<Annotation> it = (Iterator<Annotation>)model.getAnnotationIterator();
		
		while(it.hasNext()){
			Annotation a = it.next();
			Position p = model.getPosition(a);
			try{
				if(doc.getLineOfOffset(p.getOffset()) == line){
					annotations.add(a);
				}
			}
			catch(BadLocationException ble){
				
			}
				
		}
		
		return annotations;
	}
	
	
	
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		//IDocument document= sourceViewer.getDocument();
		ArrayList<Annotation> annotations = getAnnotationsForLine(sourceViewer, lineNumber);
		StringBuffer s = new StringBuffer();
		if(annotations.size()>0){
			for(Annotation a : annotations){
				if(a.getClass().getName().equals(Annotation.class.getName()))
					s.append("   -  ").append(a.getText()).append("\n");
			}
		}
		
		return s.toString();
	}
	

}
