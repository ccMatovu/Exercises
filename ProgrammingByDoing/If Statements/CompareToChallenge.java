public class CompareToChallenge {
    public static void main(String[] args) {
        String str1 = "food";
        String str2 = "jazz";
        String str3 = "Itor";
        String str4 = "cpu";
        String str5 = "sugar";
        String str6 = "cry";
        String str7 = "deer";
        String str8 = "java";

        System.out.print("Comparing \"food\" with \"jazz\" produces ");
        int result = str1.compareTo( str2 );
        System.out.println(result);

        System.out.print("Comparing \"jazz\" with \"tor\" produces ");
        result = str2.compareTo( str3 );
        System.out.println(result);

        System.out.print("Comparing \"cpu\" with \"sugar\" produces ");
        result = str4.compareTo( str5 );
        System.out.println(result);

        System.out.print("Comparing \"sugar\" with \"cpu\" produces ");
        result = str5.compareTo( str4 );
        System.out.println(result);

        System.out.print("Comparing \"cry\" with \"deer\" produces ");
        result = str6.compareTo( str7 );
        System.out.println(result);

        System.out.print("Comparing \"java\" with \"Zen\" produces ");
        result = str7.compareTo( str8 );
        System.out.println(result);

        System.out.print("Comparing \"deer\" with \"cpu\" produces ");
        result = str7.compareTo( str4 );
        System.out.println(result);

        System.out.print("Comparing \"sugar\" with \"cry\" produces ");
        result = str5.compareTo( str6 );
        System.out.println(result);

        System.out.print("Comparing \"cry\" with \"sugar\" produces ");
        result = str6.compareTo( str5 );
        System.out.println(result);

        System.out.print("Comparing \"itor\" with \"deer\" produces ");
        result = str3.compareTo( str7 );
        System.out.println(result);
    }
}
