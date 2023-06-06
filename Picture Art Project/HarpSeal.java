// Jiwon Jeong, Period 3

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

class HarpSeal extends Frame {
        public static void main(String args[]) {
                new HarpSeal();
        }

        // Creating Window
        public HarpSeal() {
                super("Harp Seal Drawing");
                setSize(1400, 800);
                setVisible(true);
                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                dispose();
                                System.exit(0);
                        }
                });
        }

        public void paint(Graphics g) {
                // Changing pen to Graphics2D so that it has more methods
                Graphics2D pen = (Graphics2D) g;

                // Setting Background Colors
                pen.setColor(Color.cyan);
                pen.fillRect(0, 0, 1400, 800);
                Color BackdropColor1 = new Color(161, 212, 208);
                Color BackdropColor2 = new Color(222, 238, 252);
                Color BackdropColor3 = new Color(41, 111, 204);
                Color BackdropColor4 = new Color(181, 214, 247);
                Color BackdropColor5 = new Color(13, 53, 92);
                pen.setColor(BackdropColor1);
                pen.fillRect(0, 0, 1400, 50);

                // Background Gradients
                GradientPaint blueToLightBlue = new GradientPaint(0, 0, BackdropColor2,
                                1000, 400, BackdropColor3);
                pen.setPaint(blueToLightBlue);
                pen.fill(new Rectangle2D.Double(0, 0, 1400, 800));
                GradientPaint lightBluetoBlue = new GradientPaint(0, 400, BackdropColor4,
                                0, 700, BackdropColor5);
                pen.setPaint(lightBluetoBlue);
                pen.fill(new Rectangle2D.Double(0, 400, 1400, 800));
                Color IceburgColor2 = new Color(221, 227, 235);
                pen.setColor(IceburgColor2);

                // Background Iceburg Creation
                int[] xPoints1 = { 100, 530, 550, 555, 570, 585, 595, 610, 615, 625, 630, 640, 650, 665, 670, 680, 690,
                                720, 740, 760, 765, 775, 785, 795, 800, 820, 860, 875, 880, 890, 900,
                                915, 920, 930, 940, 955, 960, 965, 970, 980, 995, 1000, 1010, 1025, 1030, 1040, 1055,
                                1075, 1080, 1095, 1110, 1125, 1130, 1140, 1150 };
                int[] yPoints1 = { 400, 190, 180, 170, 140, 155, 160, 140, 125, 135, 110, 70, 75, 65, 60, 65, 100, 140,
                                125, 160, 195, 220, 215, 223, 215, 230, 235, 240, 255, 265, 270, 280,
                                270, 275, 265, 260, 285, 270, 290, 300, 310, 315, 320, 325, 315, 320, 335, 330, 340,
                                360, 370, 375, 380, 385, 400 };
                pen.fillPolygon(xPoints1, yPoints1, 55);
                Color IceburgColor1 = new Color(235, 244, 252);
                pen.setColor(IceburgColor1);
                int[] xPoints2 = { 100, 240, 280, 285, 292, 320, 340, 365, 370, 380, 385, 387, 390, 400, 410, 415, 425,
                                435, 445, 450, 455, 465, 475, 480, 485, 495, 500, 510, 515, 520, 530, 540, 545, 550,
                                560, 570, 590, 600, 610, 615, 620, 625, 635, 640, 650, 655, 665, 670, 680, 685, 695,
                                700, 710, 720, 735, 740, 750, 755, 765, 770, 780, 785, 795, 800 };
                int[] yPoints2 = { 400, 200, 180, 170, 190, 100, 80, 120, 145, 132, 150, 142, 160, 180, 190, 185, 192,
                                200, 192, 185, 160, 180, 182, 170, 192, 186, 190, 192, 180, 185, 190, 230, 235, 225,
                                200, 220, 260, 300, 315, 320, 335, 310, 315, 320, 310, 315, 310,
                                325, 310, 335, 315, 350, 365, 355, 375, 370, 380, 350, 360, 345, 360, 380, 375, 400 };
                pen.fillPolygon(xPoints2, yPoints2, 64);
                pen.setColor(Color.white);
                int[] xPoints3 = { 100, 150, 170, 200, 210, 215, 220, 230, 235, 240, 245, 250, 260, 265, 270, 285 };
                int[] yPoints3 = { 400, 240, 260, 220, 100, 105, 107, 150, 140, 240, 290, 350, 330, 340, 300, 400 };
                pen.fillPolygon(xPoints3, yPoints3, 16);

                // Icesheets Creation (for loop is for duplicating)
                pen.setColor(IceburgColor1);
                int[] xPoints4 = { 200, 200, 240, 260, 258, 240 };
                int[] yPoints4 = { 550, 540, 535, 540, 548, 552 };
                pen.fillPolygon(xPoints4, yPoints4, 6);
                for (int i = 0; i < yPoints4.length; i++) {
                        xPoints4[i] += 120;
                        yPoints4[i] -= 220;
                        xPoints4[i] *= 1.4;
                        yPoints4[i] *= 1.4;
                }
                pen.fillPolygon(xPoints4, yPoints4, 6);
                for (int i = 0; i < yPoints4.length; i++) {
                        xPoints4[i] += 320;
                        yPoints4[i] += 350;
                        xPoints4[i] *= 0.8;
                        yPoints4[i] *= 0.8;
                }
                pen.fillPolygon(xPoints4, yPoints4, 6);
                int[] xPoints5 = { 900, 960, 980, 1200, 1205, 1150, 1100, 980, 900 };
                int[] yPoints5 = { 540, 500, 480, 483, 492, 545, 555, 590, 550 };
                pen.setColor(IceburgColor1);
                pen.fillPolygon(xPoints5, yPoints5, 9);
                pen.setColor(IceburgColor2);
                // Making the right-most ice sheet 3D
                int[] xPoints6 = { 900, 980, 1100, 1150, 1200, 1205, 1150, 1100, 980, 900 };
                int[] yPoints6 = { 540, 580, 545, 535, 483, 492, 545, 555, 590, 550 };
                pen.fillPolygon(xPoints6, yPoints6, 10);
                for (int i = 0; i < yPoints5.length; i++) {
                        xPoints5[i] -= 550;
                        yPoints5[i] += 400;
                        xPoints5[i] *= 0.7;
                        yPoints5[i] *= 0.7;
                }
                pen.setColor(IceburgColor1);
                pen.fillPolygon(xPoints5, yPoints5, 9);
                for (int i = 0; i < yPoints5.length; i++) {
                        xPoints5[i] += 320;
                        yPoints5[i] -= 230;
                        xPoints5[i] *= 1.1;
                        yPoints5[i] *= 1.1;
                }
                pen.fillPolygon(xPoints5, yPoints5, 9);
                for (int i = 0; i < yPoints5.length; i++) {
                        xPoints5[i] -= 320;
                        yPoints5[i] += 260;
                        xPoints5[i] *= 0.6;
                        yPoints5[i] *= 0.6;
                }
                pen.fillPolygon(xPoints5, yPoints5, 9);

                // Harp Seal Creation
                Color harpSealColor = new Color(247, 251, 255);
                Color harpSealColor1 = new Color(159, 178, 196);
                pen.setColor(harpSealColor);
                int[] xPoints7 = { 946, 962, 970, 1066, 1074, 1154, 1149, 1162, 1166, 1163, 1163, 1158, 1154, 1149,
                                1146, 1130, 1114, 1130, 1126, 1126, 1123, 1123, 1118, 1118, 1112, 1002, 970, 962, 946,
                                942, 946, 942, 946, 942 };
                int[] yPoints7 = { 502, 505, 494, 470, 438, 438, 505, 508, 513, 514, 518, 518, 521, 521, 524, 518, 524,
                                534, 534, 537, 537, 540, 540, 545, 545, 518, 519, 521, 518, 514, 511, 508, 505, 502 };
                pen.fillPolygon(xPoints7, yPoints7, 34);
                pen.setColor(harpSealColor1);
                pen.drawPolygon(xPoints7, yPoints7, 34);
                pen.setColor(harpSealColor);
                pen.fillOval(1070, 410, 90, 90);
                pen.setColor(harpSealColor1);
                pen.drawOval(1070, 410, 90, 90);
                pen.setColor(harpSealColor);
                pen.fillRect(1070, 450, 79, 51);
                pen.setColor(Color.black);
                pen.fillOval(1092, 430, 19, 9);
                pen.fillOval(1120, 430, 19, 9);
                pen.fillPolygon(new int[] { 1120, 1105, 1125, 1105 }, new int[] { 442, 452, 452, 442 }, 4);
                pen.drawArc(670, 440, 500, 40, 0, 40);
                pen.drawArc(675, 438, 500, 40, 10, 30);
                pen.drawArc(1053, 440, 500, 40, 140, 40);
                pen.drawArc(1030, 440, 500, 40, 130, 25);
                pen.drawArc(955, 442, 500, 40, 110, 18);
                pen.drawArc(705, 439, 500, 40, 30, 20);
                pen.setColor(Color.white);
                pen.fillOval(1102, 431, 5, 5);
                pen.fillOval(1130, 431, 5, 5);
                pen.fillOval(1098, 434, 3, 3);
                pen.fillOval(1126, 434, 3, 3);
        }
}
