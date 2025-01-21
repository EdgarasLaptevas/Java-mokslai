package lt.vtmc.praktiniai.users;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        int sumAge = 0;
        int countUsers = 0;
        for (User user : users) {
            sumAge += user.getAge();
            countUsers++;

        }
        return (double) sumAge / countUsers;
    }

    private static void extracted() {
        throw new UnsupportedOperationException("Not implemented");
    }

    // TODO: Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {

        User minUserAge = Collections.min(users, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return Integer.compare(user.getAge(), t1.getAge());
            }
        });
        return minUserAge.getAge();
    }


    public static User findByName(List<User> users, String name) {

        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List sortByAge(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return Integer.compare(user.getAge(), t1.getAge());
            }
        });
        return users;
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {
        return Collections.max(users, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return Integer.compare(user.getAge(), t1.getAge());
            }
        });

    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }


}
