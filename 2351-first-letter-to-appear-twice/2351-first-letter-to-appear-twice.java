class Solution {
    public char repeatedCharacter(String s) {
     HashSet<Character> set=new HashSet<>();

     for(char x:s.toCharArray()){
        if(set.contains(x)){
            return x;
        }
        set.add(x);
     }

return '\0';
    }
}