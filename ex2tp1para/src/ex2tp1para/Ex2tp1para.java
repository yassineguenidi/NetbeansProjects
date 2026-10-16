/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2tp1para;

/**
 *
 * @author yassi
 */
public class Ex2tp1para {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.err.format("utilisation  java %s   [nbthreads]   [maxvalue]\n Il me faut deux parametres  ",TestOrdre0.class.getCanonicalName());
			System.exit(-1);
		}

		int nb_threads = Integer.parseInt(args[0]);
		int max_value = Integer.parseInt(args[1]);

		Thread Mes_Jobs[] = new Thread[nb_threads];
		for (int currentThread = 0; currentThread < nb_threads; currentThread++) {
			String jobname = String.format("Job_%d", currentThread);
			TestOrdre0 ti_Job = new TestOrdre0(jobname, currentThread+1,
					max_value);
			System.out.format("Creating thread %s\n", jobname);
			Mes_Jobs[currentThread] = new Thread(ti_Job);
			Mes_Jobs[currentThread].start();
		}

		System.out.format("Main :Fini ici  !\n");


	}
    
    
}
