
public class Lambda {

	public interface TernaryIntPredicate
	{
		
		boolean test(int n1,int n2,int n3);
		
	}
	
	
	
	public static final TernaryIntPredicate ALL_DIFFERENT=(int n1,int n2,int n3)->(n1!=n2 && n1!=n3 && n2!=n3);





	
		
		
}
