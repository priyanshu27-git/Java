class string{
    public static void main(String[] args)
    {
        String str = "    Hello    World   ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace('H','l'));
        System.out.println(str.trim().charAt(3));
        System.out.println(str);
    }
}