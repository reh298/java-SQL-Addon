class Main {
    public static void main(String[] args) {
        String name="rehana";
        name=name.toLowerCase();
        int n = name.length();
        int count = 0;
        int conCount =0;
        for(int i=0;i<6;i++){
            System.out.println(name.charAt(i));
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
            count++;
            else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
                conCount++;
            }
        }
        System.out.println(count);
          System.out.println(conCount);
    }

}
