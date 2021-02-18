package com.jason.myjavatrips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Jason
 * @time 2017年6月30日 下午3:49:43
 */
public class ListTest {
    public static void main(String[] args) {
        // List<MyTest> myTests = new ArrayList<MyTest>();
        // MyTest myTest = new MyTest();
        // myTest.setAge(15);
        // myTest.setName("name1");
        // myTests.add(myTest);
        // myMethod(myTests);
        // if(myTests.contains(myTest)){
        // System.out.println("11111");
        // }
        // System.out.println(myTests);
        //
        // List<String> testContains = new ArrayList<String>();
        // testContains.add("123");
        // testContains.add("123");
        // testContains.add("12");
        // System.out.println(testContains.size());
        // System.out.println(testContains.contains("123"));
        MyTest test = new MyTest();
        test.setAge(1);
        test.setName("");
        List<Friend> friends = new ArrayList<>();
        Friend friend = new Friend();
        friend.setFriendAge(5);
        friend.setFriendName("name5");
        friend.setBeautiful(true);
        friends.add(friend);
        Friend friend2 = new Friend();
        friend2.setFriendAge(6);
        friend2.setFriendName("name6");
        friend.setBeautiful(false);
        friends.add(friend2);
        Friend friend3 = new Friend();
        friend3.setFriendAge(1);
        friend3.setFriendName("name1");
        friend.setBeautiful(true);
        friends.add(friend3);
        test.setFriends(friends);

        test.setFriends(test.getFriends().stream().sorted(Comparator.comparing(Friend::getFriendAge).reversed())
                .collect(Collectors.toList()));
        System.out.println(test.toString());
        test.getFriends().sort(Comparator.comparing(Friend::getFriendAge).reversed());
        System.out.println(test.toString());
        // 结论：0 和 -1 是 不需要换位置的，1是需要换位置的
        test.getFriends().sort((a, b) -> {
            if (a.getFriendAge() > b.getFriendAge()) {
                return 1;
            } else if (a.getFriendAge() < b.getFriendAge()) {
                return -1;
            }
            return 0;
        });
        System.out.println("*********" + test.toString());
        test.setFriends(
                test.getFriends().stream().filter(s -> s.getBeautiful().equals(true)).collect(Collectors.toList()));
        System.out.println(test.toString());

        Friend friend4 = new Friend();
        System.out.println(friend4.getFriendName() == null);

        String string = "1,2";
        System.out.println(string.isEmpty());
        // List<String> listString = Arrays.asList(string.split(","));
        List<Integer> list = Arrays.asList(string.split(",")).stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(list);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(12);
        System.out.println(intList.contains(12));

    }

    public static void myMethod(List<MyTest> myTests) {
        for (MyTest m : myTests) {
            m.setAge(16);
            m.setName("name3");
        }
    }
}

class MyTest {
    private String name;
    private Integer age;
    private List<Friend> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "MyTest [name=" + name + ", age=" + age + ", friends=" + friends + "]";
    }
}

class Friend {
    private String friendName;
    private Integer friendAge;
    private Boolean beautiful;

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public Integer getFriendAge() {
        return friendAge;
    }

    public void setFriendAge(Integer friendAge) {
        this.friendAge = friendAge;
    }

    public Boolean getBeautiful() {
        return beautiful;
    }

    public void setBeautiful(Boolean beautiful) {
        this.beautiful = beautiful;
    }

    @Override
    public String toString() {
        return "Friend [friendName=" + friendName + ", friendAge=" + friendAge + "]";
    }
}