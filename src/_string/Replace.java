package _string;

public class Replace {
    public static void main(String[] args) {
        //정 문자열을 다른 문자열로 대체하는 데 사용됩니다. 이 메서드는 문자열의 모든 일치하는 문자열을
        // 새로운 문자열로 교체하며, 이는 정규 표현식을 사용하지 않습니다
        String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";

        a= a.replace("대한", "민국");
        System.out.println(a);

    }

}
