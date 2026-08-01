class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.size()-1; i++) {
            String str = strs.get(i);
            res.append(str.length()+",");
        }
        res.append(strs.get(strs.size()-1).length()+"#");
        for (int i = 0; i < strs.size(); i++) {
            res.append(strs.get(i));
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if (str.length() == 0) return list;

        int splitIndex = str.indexOf("#");
        String sizes[] = str.substring(0, splitIndex).split(",");
        int offset = 1;
        for (int i = 0; i < sizes.length; i++) {
            int length = Integer.parseInt(sizes[i]);
            int begin = splitIndex+offset;
            list.add(str.substring(begin, begin+length));
            offset += length;
        }
        return list;
    }
}
