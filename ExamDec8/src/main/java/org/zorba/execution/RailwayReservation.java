package org.zorba.execution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.zorba.entity.General;
import org.zorba.entity.PhysicallyHandicapp;
import org.zorba.entity.SeniorCitizen;
import org.zorba.utility.DatabaseConnectivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DatabaseConnectivity.getSession();
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Scanner sc = new Scanner(System.in);
        // prepare object of general passanger
        try{
            tx = session.beginTransaction();

            List<General> generalList = getGeneral(sc);
            System.out.println(generalList);
            for(General ge : generalList){
                session.persist(ge);
            }
//            List<PhysicallyHandicapp> physicallyHandicapps = getPhysicallyHandicapp(sc);
//            for(PhysicallyHandicapp ph : physicallyHandicapps ){
//                session.persist(ph);
//            }
//            List<SeniorCitizen> seniorCitizens = getseniorCitizens(sc);
//            System.out.println(seniorCitizens);
//            for(SeniorCitizen ph : seniorCitizens ){
//                session.persist(ph);
//            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        String fetchPhysicallyHandicapp = " from PhysicallyHandicapp";
        List<PhysicallyHandicapp> physicallyHandicapps = session.createQuery(fetchPhysicallyHandicapp).getResultList();





    }
    public static List<General> getGeneral(Scanner sc){
        List<General> generalList = new ArrayList<>();
        General general = new General();
        System.out.println("Enter General Passanger name");
        general.setName(sc.next());

        System.out.println("Enter General Passenger Email");
        general.setEmail(sc.next());

        System.out.println("Enter General Passenger Mobnile");
        general.setMobile(sc.nextLong());

        System.out.println("Enter General Passanger Destination");
        general.setDestination(sc.next());

        System.out.println("ENter General seat number");
        general.setSeatNumber(sc.next());

        System.out.println("Enter General coach type");
        general.setCoachType(sc.next());

        generalList.add(general);

        return generalList;
    }

    public static List<PhysicallyHandicapp> getPhysicallyHandicapp(Scanner sc){
        List<PhysicallyHandicapp> physicallyHandicapps = new ArrayList<>();
        PhysicallyHandicapp physicallyHandicapp = new PhysicallyHandicapp();
        System.out.println("Enter General Passanger name");
        physicallyHandicapp.setName(sc.next());

        System.out.println("Enter Physically handicapp Passenger Email");
        physicallyHandicapp.setEmail(sc.next());

        System.out.println("Enter Physically handicapp Passenger Mobnile");
        physicallyHandicapp.setMobile(sc.nextLong());

        System.out.println("Enter Physically handicapp Passanger Destination");
        physicallyHandicapp.setDestination(sc.next());

        System.out.println("ENter Physically handicapp seat number");
        physicallyHandicapp.setSeatNumber(sc.next());

        System.out.println("Enter Physically handicapp proof of disability");
        physicallyHandicapp.setProofOfDisability(sc.next());

        physicallyHandicapps.add(physicallyHandicapp);

        return physicallyHandicapps;
    }

    public static List<SeniorCitizen> getseniorCitizens(Scanner sc){
        List<SeniorCitizen> seniorCitizens = new ArrayList<>();
         SeniorCitizen seniorCitizen = new SeniorCitizen();
        System.out.println("Enter Senior Passanger name");
        seniorCitizen.setName(sc.next());

        System.out.println("Enter Senior citizen  Passenger Email");
        seniorCitizen.setEmail(sc.next());

        System.out.println("Enter Senior citizen  Passenger Mobnile");
        seniorCitizen.setMobile(sc.nextLong());

        System.out.println("Enter Senior Citizen Passanger Destination");
        seniorCitizen.setDestination(sc.next());

        System.out.println("ENter Senior citizen   seat number");
        seniorCitizen.setSeatNumber(sc.next());

        System.out.println("Enter Senior citizen   disocunt");
        seniorCitizen.setDiscount(sc.nextInt());

        seniorCitizens.add(seniorCitizen);

        return seniorCitizens;
    }
}
