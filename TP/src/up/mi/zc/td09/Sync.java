package up.mi.zc.td09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sync {


	private final int nbThread;


	private List<Integer> list = new ArrayList<Integer>();

	private Random gen = new Random();

	public Sync(int longueurListe,int nbThread){
		this.nbThread=nbThread;
		for (int i=0;i<longueurListe;i++)
			list.add(i);
	}

	public void verify(){
		List<Integer> copie= new ArrayList<Integer>(this.list);
		Collections.sort(copie);
		for (int i=0;i<copie.size();i++)
			if (copie.get(i).intValue()!=i) 
				throw new RuntimeException("indice "+i+" val : "+copie.get(i));
	}




	private void tester() {
		verify();
		List<ThreadList> tl = new ArrayList<ThreadList>();
		for (int i=0;i<nbThread;i++) 
			tl.add(new ThreadList(i+""));
		for (int i=0;i<nbThread;i++) 
			tl.get(i).start();
		for (int i=0;i<nbThread;i++)
			try {
				tl.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		try {verify();
		System.out.println("OK pour "+nbThread+" thread(s)");
		}
		catch (RuntimeException exp){ System.out.println("PAS OK pour "+nbThread+" thread(s)");}
	}

	public static void main(String[] args) {
		new Sync(1000,1).tester();
		new Sync(1000,2).tester();
		new Sync(1000,30).tester();
		new Sync(1000,1000).tester();

		new Sync(100000,1).tester();
		new Sync(100000,2).tester();
		new Sync(1000000,3).tester();
		new Sync(100000,1000).tester();
	} 


	class ThreadList extends Thread{
		private String name;

		public ThreadList(String name){
			super(name);
			this.name=name;
		}
		public String getNameThread()
		{
			return this.name;
		}
		public void run (){
			int cpt=10;
			while (cpt!=0){
				synchronized(list)
				{
				int index=gen.nextInt(list.size());
				Integer value = list.get(index);
				list.remove(index);
				list.add(0,value);
				cpt--;
				}
			}
		}
	}

}
// Question 1 : que fait ce programme ?
// Question 2 : pourquoi l'execution ne donne pas le résultat que l'on pourrait attendre ?
// Question 3 : utiliser un bloc synchronized pour obtenir un resultat correct