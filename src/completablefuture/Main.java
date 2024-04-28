package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return 42;
		});
		
		future.thenAccept(resultat -> System.out.println("Résultat de la tâche : "+resultat));
		
		future.exceptionally(ex -> {
			System.out.println("La tâche  échoué : " + ex);
			return 2;
		});
		
		try {
			future.get();
		} catch(ExecutionException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
