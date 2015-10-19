package com.fbt.cleancode.atrier;

import java.util.Date;

import org.junit.Test;

/**
 * TODO: réécrire en utilisant une classe spécifique
 * @author hp
 *
 */
public class StringAllocationOrTestTest
{
    @Test
    public void stringTest() throws Exception {
        long start = new Date().getTime();

        String toto ="";
        for (int i = 0; i < 5000000; i++) {

            if (toto.equals("")) {
                toto="toto";
            }

        }

        System.err.println("Elapsed time: utilisation if :\n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    /**
     * la réaffectation est moins couteuse
     * @throws Exception
     */
    public void stringReAllocation() throws Exception {
        long start = new Date().getTime();

        String toto ="";
        for (int i = 0; i < 5000000; i++) {
            toto="toto";
        }

        System.err.println("Elapsed time: reaffectation :\n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    public void stringNoReAllocation() throws Exception {
        long start = new Date().getTime();

        String toto = "toto";
        for (int i = 0; i < 5000000; i++) {
        }

        System.err.println("Elapsed time: no reaffectation :\n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    public void stringTest2() throws Exception {
        long start = new Date().getTime();

        String totoString = "";
        String libelleServices = "";
        for (int i = 0; i < 5000; i++) {
            if (totoString == null) {
                break;
            }
            if (libelleServices.length() > 0) {
                libelleServices = libelleServices + " ; ";
            }
            libelleServices = libelleServices + "toto";
        }
        System.err.println("Elapsed time: test sur taille string :\n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    /**
     * la réaffectation est moins couteuse
     * @throws Exception
     */
    public void stringReAllocation2() throws Exception {
        long start = new Date().getTime();

        String totoString = "";
        String libelleServices = "", separateur = "";
        for (int i = 0; i < 5000; i++) {
            if (totoString == null) {
                break;
            }
            libelleServices = libelleServices + separateur;
            libelleServices = libelleServices + "toto";
            separateur =" ; ";
        }
        System.err.println("Elapsed time: reaffectation / string en 2 étape :\n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    /**
     * la réaffectation est moins couteuse
     * @throws Exception
     */
    public void stringReAllocation2bis() throws Exception {
        long start = new Date().getTime();

        String totoString = "";
        String libelleServices = "", separateur = "";
        for (int i = 0; i < 5000; i++) {
            if (totoString == null) {
                break;
            }
            libelleServices = libelleServices + separateur+ "toto";
            separateur =" ; ";
        }
        System.err.println("Elapsed time: reaffectation / string en 1 étape \n" + (new Date().getTime() - start) + "ms");
    }

    @Test
    /**
     * la réaffectation est moins couteuse
     * mais attention au string si on vient ajouté de la donnée en boucle, il vaut meux un stringBuffer
     * @throws Exception
     */
    public void stringReAllocation2ter() throws Exception {
        long start = new Date().getTime();

        String totoString = "";
        StringBuffer libelleServices = new StringBuffer();
        String separateur = "";
        for (int i = 0; i < 5000; i++) {
            if (totoString == null) {
                break;
            }
            libelleServices.append(separateur+ "toto");
            separateur =" ; ";
        }
        System.err.println("Elapsed time: reaffectation / stringBuffer\n" + (new Date().getTime() - start) + "ms");
    }
}