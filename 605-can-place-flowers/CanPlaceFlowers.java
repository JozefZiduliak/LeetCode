class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int availableSpaceForFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++)
        {

            if(i == 0)
            {
               if(flowerbed[i] == 1)
                   continue;

               if(flowerbed.length != 1) {
                   if (flowerbed[i + 1] == 0) {
                       flowerbed[i] = 1;
                       availableSpaceForFlowers++;
                   }
               }
               
               else
               {
                   flowerbed[i] = 1;
                   availableSpaceForFlowers++;
               }
                   
            }

            else if(i == flowerbed.length-1)
            {
                if(flowerbed[i] == 1)
                    continue;

                if(flowerbed[i-1] == 0)
                {
                    flowerbed[i] = 1;
                    availableSpaceForFlowers++;
                }

            }

            else {
                if(flowerbed[i] == 1)
                    continue;

                if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0)
                {
                    flowerbed[i] = 1;
                    availableSpaceForFlowers++;
                }
            }
        }


        boolean isEnoughSpace;

        if(n <= availableSpaceForFlowers)
            return true;
        else
            return false;

    
    }
}