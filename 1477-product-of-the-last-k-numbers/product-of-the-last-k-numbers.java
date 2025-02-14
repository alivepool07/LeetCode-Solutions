class ProductOfNumbers {
    private List<Integer> prefixProduct;
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1);
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        }
    }
    

    
    public int getProduct(int k) {
       int size = prefixProduct.size();
        if (k >= size) {
            return 0; 
        }
        return prefixProduct.get(size - 1) / prefixProduct.get(size - 1 - k);
     
    }
}
