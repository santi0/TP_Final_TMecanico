package py.edu.facitec.mec.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SoloMayusculas extends PlainDocument{
    public void insertString(int offset, String str, AttributeSet atrr)throws BadLocationException{
        super.insertString(offset, str.toUpperCase(), atrr);
    }
}
