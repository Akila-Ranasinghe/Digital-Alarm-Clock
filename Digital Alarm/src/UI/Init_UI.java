/*
 * Copyright (c) 2014  Akila Ranasinghe </ SPYD3R-X >
 * All rights reserved.
 * GitHub: https://github.com/SPYD3R-X
 * 09 Nov 2014 08:36:10 PM By AKILA.
 */
package UI;

import com.alee.laf.WebLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author AKILA
 */
public class Init_UI {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new WebLookAndFeel());
            WebLookAndFeel.setDecorateDialogs(true);

            final Alarm_UI st = new Alarm_UI();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String val;
                        for (int i = 0; i < 10; i++) {
                            val = "0." + i;
                            st.setOpacity(Float.parseFloat(val));
                            Thread.sleep(50);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            st.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
}
