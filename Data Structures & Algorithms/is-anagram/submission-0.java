class Solution {
    public boolean isAnagram(String s, String t) {

        int size_s = s.length();
        int size_t = t.length();

        if(size_s != size_t) return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for(int i=0; i<size_s; i++)
        {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<size_t; i++)
        {
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i),0)-1);
            if(countMap.get(t.charAt(i))==0)
            {
                countMap.remove(t.charAt(i));
            }
        }

    return countMap.isEmpty();

    }
}
