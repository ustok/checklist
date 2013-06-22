package org.ustok.checklist.ui.sandox.util.controls;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.ustok.checklist.internal.ui.util.controls.list.ListControl;
import org.ustok.checklist.internal.ui.util.controls.list.renderer.DefaultListItemRenderer;
import org.ustok.checklist.internal.ui.util.controls.list.viewer.ListViewer;

public class SimpleListControl {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText(SimpleListControl.class.getSimpleName());
		shell.setSize(640, 480);
		shell.setLayout(new FillLayout());

		ListControl control = new ListControl(shell, SWT.NONE);

		DefaultListItemRenderer renderer = (DefaultListItemRenderer) control
				.getItemRenderer();
		renderer.setBackground(new Color(display, 210, 140, 60));
		renderer.setBorderColor(new Color(display, 180, 180, 180));
		renderer.setMouseOverBackground(new Color(display, 220, 150, 70));
		renderer.setSelectionBackground(new Color(display, 150, 220, 70));

		ListViewer viewer = new ListViewer(control);
		viewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer pViewer, Object pOldInput,
					Object pNewInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object pInputElement) {
				if (pInputElement != null) {
					Library lib = (Library) pInputElement;
					return lib.books.toArray();
				}
				return null;
			}
		});
		viewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object pElement) {
				return ((Book) pElement).title;
			}
		});

		Library model = createModel();
		viewer.setInput(model);

		shell.open();
		viewer.refresh();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	private static Library createModel() {
		Library lib = new Library();
		lib.books.add(new Book("Book 1"));
		lib.books.add(new Book("Book 2"));
		lib.books.add(new Book("Book 3"));
		return lib;
	}

	private static class Library {
		private List<Book> books = new ArrayList<SimpleListControl.Book>();
	}

	private static class Book {
		public Book(String pTitle) {
			title = pTitle;
		}

		private String title;
	}

}
