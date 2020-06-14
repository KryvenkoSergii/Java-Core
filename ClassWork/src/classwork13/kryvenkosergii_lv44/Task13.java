package classwork13.kryvenkosergii_lv44;

public class Task13 {
	int a=1;
	int b=2;
	int j;
	int i=1;
public Task13() {
	}

public void NCK() {
	if(a<b) {
		j=b;
	} else j=a;
	boolean t = true;
	while(t) {
		if((j%a==0)&&(j%b==0)) break;
		else j+=1;
	}
	if(b==200)System.out.println(j);
	else {
		i+=1;
		a=j;
		b=i-1;
		NCK();
	}
}
}
