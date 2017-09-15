package be.aga.dominionSimulator.gui;

import be.aga.dominionSimulator.enums.DomCardName;

import javax.swing.*;
import java.awt.*;
import java.net.URL;


  public class CustomComboBoxRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(
                                       JList list,
                                       Object value,
                                       int index,
                                       boolean isSelected,
                                       boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (isSelected) {
            URL theImageLocation = getClass().getResource(((DomCardName)value).getImageLocation());
            if (DomBotEditor.cardImageLabel!=null && theImageLocation!=null) {
              ImageIcon theCardPicture = new ImageIcon(theImageLocation) ;
              DomBotEditor.cardImageLabel.setIcon(theCardPicture);
            }
        }
        return c;
    }
}
