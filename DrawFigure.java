/**
 * draw a hourglass figure
 */
public class DrawFigure {
    public static final int SUB_HEIGHT = 5; //define a public constant

    public static void main (String[] args) {
    drawLine(); //draw a solid line.
    drawTopHalf(); //draw the top half of the hourglass.
    drawBottomHalf(); //draw the bottom half of the hourglass.
    drawLine();  //draw a solid line.
    }

    /**
     * problem decomposition for produce a line +------+
     */
    public static void drawLine() {
        System.out.print("+");  // write a plus on the output line
        for ( int i = 1; i <= (2 * SUB_HEIGHT); i++) {
            System.out.print("-");  // write 6 slashes on the output line
        }
        System.out.println("+");  // write a plus on the output line
    }

    /**
     * problem decomposition for produce the top of the hourglass figure
     * |\..../|
     * | \../ |
     * |  \/  |
    */
     public static void drawTopHalf() {
     for (int line = 1; line <= SUB_HEIGHT; line++) {
         System.out.print("|");   //write a bar on the output line
         for (int i = 1; i <=(line - 1); i++ ) {
             System.out.print(" ");  // write (line -1) spaces on the output line
         }
         System.out.print("\\");  // write a backslash on the output line
         int dots = 2 * SUB_HEIGHT - 2 * line;
         for (int j = 1; j <= dots; j++) {
             System.out.print(".");  // write (6 - 2 * line) dots on the output line
         }
         System.out.print("/");  // write a slash on the output line
         for (int i = 1; i <=(line - 1); i++ ) {
             System.out.print(" ");  // write (line -1) spaces on the output line
         }
         System.out.println("|");  // write a bar on the output line
     }
     }

    /**
     * problem decomposition for produce the bottom of the hourglass figures
     * |  /\  |
     * | /..\ |
     * |/....\|
     */
    public static void drawBottomHalf() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");   //write a bar on the output line
            int spaces = SUB_HEIGHT - line;
            for (int i = 1; i <=spaces; i++ ) {
                System.out.print(" ");  // write some spaces on the output line
            }
            System.out.print("/");  // write a backslash on the output line
            int dots = 2 * (line - 1);
            for (int j = 1; j <= dots ; j++) {
                System.out.print(".");  // write some dots on the output line
            }
            System.out.print("\\");  // write a slash on the output line
            for (int i = 1; i <= spaces; i++ ) {
                System.out.print(" ");  // write some spaces on the output line
            }
            System.out.println("|");  // write a bar on the output line
        }
    }
}
