import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class a {
    public static void main(String[] args) {
        String res = "4C201201010005FA5B4710F78C0B17748D4F515CA8000055A230472A28E688AD0000580453510F1031D09F00006B011BF41F679CD8DC000078F7BB0C238D67C6A200007A84E4E167FAD138A400007AD21809C7630CA8BE00007B338ABB98ECF1B0AB000080C16477F1712FCCC3000085341BF41F679C2ADD000087DE01420D0CD408A900008CFA0C";
        String probeMac = res.substring(14, 26);
        int n = Integer.valueOf(res.substring(26, 28), 16);
        if (n > 0) {
            List<c> list = new ArrayList(n);
            for (int i = 1; i <= n; i++) {
                c bean = new c();
                String dstMac = res.substring(28 + (i - 1) * 22, 40 + (i - 1) * 22);
                System.out.println(dstMac);
                byte rssis =parseHexStr2Byte(res.substring(40 + (i - 1) * 22, 42 + (i - 1) * 22))[0];
                System.out.println(rssis);
                int time= Integer.valueOf(res.substring(42 + (i - 1) * 22, 50 + (i - 1) * 22), 16);
                System.out.println(time);
            }
        }
        System.out.println(System.currentTimeMillis());
    }

    /**
     * @param hexStr
     * @return
     * @description 将16进制转换为二进制
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1)
            return null;
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

    static class c {
        private String dstMac;

        private Integer rssis;

        private Date date;

        public String getDstMac() {
            return dstMac;
        }

        public void setDstMac(String dstMac) {
            this.dstMac = dstMac;
        }

        public Integer getRssis() {
            return rssis;
        }

        public void setRssis(Integer rssis) {
            this.rssis = rssis;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }


}
