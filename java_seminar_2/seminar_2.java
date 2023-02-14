package java_seminar_2;

/**
 * seminar_2
 */
public class seminar_2 {

    public static void main(String[] args) {
        parse_String();
    }

    static public void parse_String() {
        String str = "Добрый день Как дела Все хорошо";
        String[] str_arr = str.split(" ");
        String[] new_str_arr = new String[str_arr.length / 2 + 1];
        int j = 0;
        for (int i = 0; i < str_arr.length; i += 2) {
            new_str_arr[j] = String.join(" ", str_arr[i], str_arr[i + 1]);
            j++;
        }
        new_str_arr[j] = "";
        int l = 0;
        String[] pre_res_arr = new String[new_str_arr.length / 2 + 1];
        for (int k = 0; k < pre_res_arr.length; k += 2) {
            pre_res_arr[l] = String.join(". ", new_str_arr[k], new_str_arr[k + 1]);
            l++;
        }
        l = 0;
        String result = String.join(". ", pre_res_arr[l], pre_res_arr[l + 1]);
        System.out.println(result);
    }
}