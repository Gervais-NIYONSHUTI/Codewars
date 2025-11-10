import java.util.List;
​
public class PaginationHelper<I> {
  List<I> collection;
  int itemsPerPage;
  
  public PaginationHelper(List<I> collection, int itemsPerPage) {
      this.collection = collection;
      this.itemsPerPage = itemsPerPage;
  }
  
  public int itemCount() {
      return collection.size();
  }
  
  public int pageCount() {
      return (int)Math.ceil( (double) itemCount()/(double) itemsPerPage);
  }
  public int pageItemCount(int pageIndex) {
      if(pageIndex >= pageCount() || pageIndex < 0) return -1;
      if(pageIndex == pageCount() - 1) return collection.size() - (pageCount()-1) * itemsPerPage;
      return itemsPerPage;
  }
  public int pageIndex(int itemIndex) {
      int pageIndex = (int)Math.ceil((double)(itemIndex + 1)/(double)itemsPerPage);
      return (itemIndex >= collection.size() || itemIndex < 0) ? -1 : pageIndex - 1;
  }
}