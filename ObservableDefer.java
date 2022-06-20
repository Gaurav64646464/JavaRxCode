import io.reactivex.Observable;

public class ObservableDefer {
    
    private static int start=5,count=2;
    public static void main(String[] args) {
    
        Observable<Integer> observable=Observable.defer(() ->{
            System.out.println("Now Observable is created with start ="+start+" and Count="+count);
          return Observable.range(start,count);
        });
        observable.subscribe(item -> System.out.println("observer: 1::" + item));
        count=3;
        observable.subscribe(item ->System.out.println("observer : 2::"+ item));
    }
}
