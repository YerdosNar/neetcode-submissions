class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str:strs) {
            res.append(str.length());
            res.append("#");
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str.length() == 0) return list;

        int i = 0;
        int offset = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            int length = 0;
            if (c == '#') {
                length = Integer.parseInt(str.substring(offset, i));
                offset = i+1;
                String s = str.substring(offset, offset+length);
                list.add(s);
                offset = offset+length;
                i = offset;
            } else {i++;}
        }
        return list;
    }
}
