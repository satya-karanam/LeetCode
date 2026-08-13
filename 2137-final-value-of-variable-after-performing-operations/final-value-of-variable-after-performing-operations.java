class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (String operation : operations) {
            if (operation.contains("+")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }

}