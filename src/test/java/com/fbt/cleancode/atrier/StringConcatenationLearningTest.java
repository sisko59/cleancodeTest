package com.fbt.cleancode.atrier;

import java.util.Date;

import org.junit.Test;

public class StringConcatenationLearningTest
{
    @Test
    public void stringBuffer() throws Exception {
        long start = new Date().getTime();

        for (int i = 0; i < 50000; i++) {
            // @formatter:off

            StringBuffer sbQuery = new StringBuffer(1024).append("select tac1 from ").append("TacheBO").append(" tac1 ");
            sbQuery.append("where tac1.id in (");
            sbQuery.append("select tac.id from ").append("TacheBO").append(" tac ");
            sbQuery.append("inner join ").append(" tac.attributTache ").append(" att ");
            sbQuery.append("where index(att) = :nomAttribut ");
            sbQuery.append("and att.valeur = 'true' ");
            sbQuery.append("and tac.alerteur.id = 1)");
            String result = sbQuery.toString();

            // @formatter:on
        }

        System.err.println("Elapsed time: " + (new Date().getTime() - start) + "ms");
    }

    @Test
    public void stringConcatenationOperator() throws Exception {
        long start = new Date().getTime();

        for (int i = 0; i < 50000; i++) {
            // @formatter:off

            String result =
                    "select tac1 from TacheBO tac1 " +
                    "where tac1.id in (" +
                        "select tac.id from TacheBO tac " +
                        "inner join tac.attributTache att " +
                        "where index(att) = :nomAttribut " +
                        "and att.valeur = 'true' " +
                        "and tac.alerteur.id = 1)";
            // @formatter:on
        }

        System.err.println("Elapsed time: " + (new Date().getTime() - start) + "ms");
    }
}