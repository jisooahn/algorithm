class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] dbIdPw : db) {
            String dbId = dbIdPw[0];
            String dbPw = dbIdPw[1];
            if (id.equals(dbId)) {
                if (pw.equals(dbPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}