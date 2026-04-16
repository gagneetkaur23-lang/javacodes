class StringBuilder {
    public static void main(String[] args){
        String S1="java programming";

        StringBuilder sb = new StringBuilder(S1);

        sb.append("lecture");
         System.out.println(sb);

         sb.replace(2,3,"hii");
        System.out.println(sb);

         sb.delete(2,3);
        System.out.println(sb);

        sb.insert(6,";");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
