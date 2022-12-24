import java.util.ArrayList;

public class TugasBus {
        public static void main(String[] args) {
            ArrayList<int[]> stopGo = new ArrayList<int[]>();
            stopGo.add(new int[]{10,0});
            stopGo.add(new int[]{3,5});
            stopGo.add(new int[]{2,5});

            System.out.println(GetPassanger(stopGo));

        }

        public static int GetPassanger(ArrayList<int[]> BisKota) {
            int result = 0;
            for (int i = 0; i < BisKota.size(); i++) {
                for (int j = 0; j < BisKota.get(1).length; j++) {
                    if (BisKota.get(i)[j] == BisKota.get(1)[0]) {
                        result += BisKota.get(1)[j];
                    } else {
                        result = BisKota.get(1)[j];
                    }
                }
            }
            return result;
        }
    }

