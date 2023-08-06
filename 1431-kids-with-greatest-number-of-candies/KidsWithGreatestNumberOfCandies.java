class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
         
        List<Boolean>  hasMaxCandiesAfterExtraCandies = new ArrayList<>();

        int highestNumberOfCandies = 0;

        for(int i = 0; i < candies.length; i++) {
            if (candies[i] > highestNumberOfCandies)
                highestNumberOfCandies = candies[i];

        }

        

        for(int i = 0; i < candies.length; i++)
        {
            
            if(candies[i] + extraCandies >= highestNumberOfCandies)
                hasMaxCandiesAfterExtraCandies.add(true);
            else
                hasMaxCandiesAfterExtraCandies.add(false);
        }

        return hasMaxCandiesAfterExtraCandies;
    }

    }
