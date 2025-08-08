package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //exercise 1: Creating an ArrayList and Adding Elements

        //result prediction: true, ["Secure the perimeter", "Establish communication", "Report status"], 3
        //actual result: true, ["Secure the perimeter", "Establish communication", "Report status"], 3

//        ArrayList<String> missionTasks = new ArrayList<>();
//
//        System.out.println("Is the list empty initially? " + missionTasks.isEmpty());
//
//        missionTasks.add("Secure the perimeter");
//        missionTasks.add("Establish communication");
//        missionTasks.add("Report status");
//
//        System.out.println("Current tasks: " + missionTasks);
//        System.out.println("Number of tasks: " + missionTasks.size());
        //explanation: After creating arraylist object missionTasks, it is initially empty.
        //Then .add appends passed objects with .size() giving out number of items in the list

        //exercise 2: Accessing and Modifying Elements

        //result prediction: "Map", ["Compass", "Map", "Radio"], ["GPS", "Compass", "Map", "Radio"]
        //actual result: "Map", ["Compass", "Map", "Radio"], ["GPS", "Compass", "Map", "Radio"]
//        ArrayList<String> equipment = new ArrayList<>();
//        equipment.add("Compass");
//        equipment.add("Map");
//        equipment.add("Radio");
//
//        String secondItem = equipment.get(1);
//        System.out.println("Item at index 1: " + secondItem);
//
//        System.out.println("List before modification: " + equipment);
//
//
//        equipment.set(0, "GPS");
//
//        System.out.println("List after modification: " + equipment);
        //explanation: After creating and appending objects to the ArrayList, .get() return the object within your array
        //specified by inputted index. Now, with .set(), initially I thought it would push the original objects to the
        //right, making GPS set in index 0. However, with .set(), it overrides the current object at that index and deletes it.

        //exercise 3: Inserting and Removing Elements

        //result prediction: ["Primary Objective", "Secondary Objective", "Tertiary Objective"], ["Primary Objective", "Secondary Objective"],
        // ["Secondary Objective"]
        //actual result: [Primary Objective, Secondary Objective, Tertiary Objective], Tertiary Objective
        // [Primary Objective, Secondary Objective], [Secondary Objective]
//        ArrayList<String> objectives = new ArrayList<>();
//        objectives.add("Primary Objective");
//        objectives.add("Tertiary Objective");
//
//        objectives.add(1, "Secondary Objective");
//        System.out.println("List after insertion: " + objectives);
//
//        String removedObjective = objectives.remove(2);
//        System.out.println("Removed objective: " + removedObjective);
//        System.out.println("List after removing by index: " + objectives);
//
//        objectives.remove("Primary Objective");
//        System.out.println("List after removing by object: " + objectives);
        //explanation: when adding to a filled index with .add(), it will push the original object to the right
        //Then .remove() can remove items at a specific index or a specific object within your ArrayList

        //exercise 4: Searching the List

        //result prediction: true, 2, -1
        //actual result: true, 2, -1
//        ArrayList<String> waypoints = new ArrayList<>();
//        waypoints.add("Alpha");
//        waypoints.add("Bravo");
//        waypoints.add("Charlie");
//
//        boolean hasBravo = waypoints.contains("Bravo");
//        System.out.println("Does the list contain 'Bravo'? " + hasBravo);
//
//        int indexOfCharlie = waypoints.indexOf("Charlie");
//        System.out.println("Index of 'Charlie': " + indexOfCharlie);
//
//        int indexOfDelta = waypoints.indexOf("Delta");
//        System.out.println("Index of 'Delta': " + indexOfDelta);
//        //explanation: .contains() returns true when a substring exist within your string literal. As for indexOf,
          //it returns the index of specified item then returns -1 if none are found
//
//        //exercise 5: Iterating Through the List
//
//        //result prediction: [Leader, Medic, Engineer, Scout], [0, Leader, 1, Medic, 2, Engineer, 3, Scout]
//        //actual result: [Leader, Medic, Engineer, Scout], [0, Leader, 1, Medic, 2, Engineer, 3, Scout]
//        ArrayList<String> squad = new ArrayList<>();
//        squad.add("Leader");
//        squad.add("Medic");
//        squad.add("Engineer");
//        squad.add("Scout");
//
//        System.out.println("--- Using an Enhanced For-Loop ---");
//        for (String role : squad) {
//            System.out.println("Role: " + role);
//        }
//        System.out.println("\n--- Using a Standard For-Loop with index ---");
//        for (int i = 0; i < squad.size(); i++) {
//            System.out.println("Role at index " + i + ": " + squad.get(i));
//            //explanation: Although both methods of iterating over the ArrayList can allow us to retrieve and
              //print the items, with enhances for loops, it does not tell allow us to retrieve the index of the item
              //directly from it unlike with a standard for loop
//
//          //exercise 6: Clearing the List
//
//          //result prediction: 2, ["Enemy position: Sector 4", "Weakness: Power generator"], 0, true, null
//          //actual result: 2, ["Enemy position: Sector 4", "Weakness: Power generator"], 0, true, []
            ArrayList<String> intel = new ArrayList<>();
            intel.add("Enemy position: Sector 4");
            intel.add("Weakness: Power generator");

            System.out.println("Intel count before mission: " + intel.size());
            System.out.println("Intel list: " + intel);

            intel.clear();

            System.out.println("\nIntel count after mission: " + intel.size());
            System.out.println("Is the intel list empty now? " + intel.isEmpty());
            System.out.println("Intel list: " + intel);
//          //explanation: .clear() removes items from the list which is why when .isEmpty() is executed it returns
            //true as it now becomes an empty set as seen when the ArrayList is printed
    }
}