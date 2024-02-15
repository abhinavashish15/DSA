public class shortestPath {
    public static void pathString(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            }
            // switch(ch){
            // case 'S': y--; break;
            // case 'N': y++; break;
            // case 'w': x--; break;
            // case 'E':x++; break;
            // }
        }
        int x2 = x * x;
        int y2 = y * y;
        float sq = (float) Math.sqrt(x2 + y2);
        System.out.println(sq);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        pathString(path);
    }

}
