class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        // round to nearest multiple of 10
        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;

        // initial balance is 100
        return 100 - roundedAmount;
    }
}