package berict.alfile.file;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

import static berict.alfile.main.form.MainForm.tableModel;

public class TableModelRenderer extends DefaultTableCellRenderer {

    private Runnable runnable;

    public TableModelRenderer() {
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.LEFT);
    }

    public TableModelRenderer(Runnable runnable) {
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.LEFT);
        this.runnable = runnable;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (!tableModel.get(row).exists()) {
            // file missing
            component.setFont(new Font("Default", Font.ITALIC, 12));
            component.setForeground(Color.RED);
            setToolTipText("Missing file");
        } else {
            component.setForeground(Color.BLACK);
            setToolTipText(null);
            if (column == 2) {
                if (tableModel.get(row).hasDuplicate()) {
                    // duplicate found
                    component.setFont(new Font("Default", Font.ITALIC, 12));
                    component.setForeground(Color.RED);
                    setToolTipText("Duplicate found");
                } else if (tableModel.get(row).isModified()) {
                    component.setFont(new Font("Default", Font.BOLD | Font.ITALIC, 12));
                    setToolTipText("Changed file");
                }
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        return component;
    }
}
